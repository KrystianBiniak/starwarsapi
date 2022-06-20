package pl.biniak.starwarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.biniak.starwarsapi.entity.HomeWorld;
import pl.biniak.starwarsapi.entity.MovieCharacter;
import pl.biniak.starwarsapi.entity.Starship;
import pl.biniak.starwarsapi.enums.HairColor;
import pl.biniak.starwarsapi.enums.StarshipClass;
import pl.biniak.starwarsapi.repository.CharacterRepo;
import pl.biniak.starwarsapi.repository.HomeWorldRepo;
import pl.biniak.starwarsapi.repository.StarshipRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterManager {

  private CharacterRepo characterRepo;
  private HomeWorldRepo homeWorldRepo;
  private StarshipRepo starshipRepo;

  @Autowired
  public CharacterManager(CharacterRepo characterRepo, HomeWorldRepo homeWorldRepo, StarshipRepo starshipRepo) {
    this.characterRepo = characterRepo;
    this.homeWorldRepo = homeWorldRepo;
    this.starshipRepo = starshipRepo;
  }

  public Iterable<MovieCharacter> findAll() {
    return characterRepo.findAll();
  }

  public Optional<MovieCharacter> findByID(long id) {
    return characterRepo.findById(id);
  }

  public MovieCharacter save(MovieCharacter movieCharacter) {
    return characterRepo.save(movieCharacter);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void fillDB() {
    List<Starship> starships = new ArrayList<>();
    HomeWorld homeWorld = new HomeWorld(1L, "Tatooine", 10465L, 200000L);
    homeWorldRepo.save(homeWorld);
    starships.add(new Starship(
        1L,
        "X-wing",
        "T-65 X-wing",
        149999,
        12,
        1050,
        1,
        StarshipClass.STARFIGHTER));
    starships.add(new Starship(
        2L,
        "Imperial shuttle",
        "Lambda-class T-4a shuttle",
        240000,
        20,
        850,
        6,
        StarshipClass.ARMED_GOVERMENT_TRANSPORT));
    for(Starship starship : starships) {
      starshipRepo.save(starship);
    }
    save(new MovieCharacter(
        1,
        "Luke Skywalker",
        172,
        77,
        HairColor.BLOND,
        homeWorld,
        starships));
  }
}
