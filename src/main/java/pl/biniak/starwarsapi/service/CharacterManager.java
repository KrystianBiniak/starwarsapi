package pl.biniak.starwarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.biniak.starwarsapi.entity.MovieCharacter;
import pl.biniak.starwarsapi.repository.CharacterRepo;

import java.io.IOException;
import java.util.*;

@Service
public class CharacterManager {

  private CharacterRepo characterRepo;
  private HomeWorldManager homeWorldManager;
  private StarshipManager starshipManager;
  private FilmManager filmManager;
  private SpeciesManager speciesManager;
  private VehicleManager vehicleManager;

  public CharacterManager(CharacterRepo characterRepo, HomeWorldManager homeWorldManager, StarshipManager starshipManager, FilmManager filmManager, SpeciesManager speciesManager, VehicleManager vehicleManager) {
    this.characterRepo = characterRepo;
    this.homeWorldManager = homeWorldManager;
    this.starshipManager = starshipManager;
    this.filmManager = filmManager;
    this.speciesManager = speciesManager;
    this.vehicleManager = vehicleManager;
  }

  @Autowired


  public Iterable<MovieCharacter> findAll() {
    return characterRepo.findAll();
  }

  public Optional<MovieCharacter> findByID(long id) {
    return characterRepo.findById(id);
  }

  public Iterable<MovieCharacter> findPage(long page) {
    List<MovieCharacter> selectedPage = (List<MovieCharacter>) characterRepo.findAll();
    int fromIndex = (int) ((page * 3) - 3);
    return selectedPage.subList(fromIndex, fromIndex + 3);
  }

  public MovieCharacter save(MovieCharacter movieCharacter) {
    return characterRepo.save(movieCharacter);
  }

  @EventListener(ApplicationReadyEvent.class)
  public boolean fillDB() throws IOException {
    RestTemplate restTemplate = new RestTemplate();
    int characterID = 1;

    do {
      if (characterID == 17) {
        continue;
      }
      String currentUrl = "https://swapi.dev/api/people/" + characterID + "?format=json";

      MovieCharacter movieCharacter = restTemplate.exchange(
          currentUrl,
          HttpMethod.GET,
          HttpEntity.EMPTY,
          MovieCharacter.class
      ).getBody();
      if (movieCharacter != null) {
        save(movieCharacter);
        homeWorldManager.loadFromURL(movieCharacter.getHomeworld());
        starshipManager.loadFromURL(movieCharacter.getStarships());
        vehicleManager.loadFromURL(movieCharacter.getVehicles());
        filmManager.loadFromURL(movieCharacter.getFilms());
        speciesManager.loadFromURL(movieCharacter.getSpecies());
      }
      characterID++;
    } while (characterID <= 100);
    return true;
  }
}
