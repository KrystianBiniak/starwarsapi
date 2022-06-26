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
    int id = 1;
    RestTemplate restTemplate = new RestTemplate();
    do {
      if(id == 17) {
        continue;
      }
      String currentUrl = "https://swapi.dev/api/people/" + id + "?format=json";

      // OTHER SOLUTION //
      /*URL url = new URL(currentUrl);
      InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
      MovieCharacter movieCharacter = new Gson().fromJson(inputStreamReader, MovieCharacter.class);*/

      MovieCharacter movieCharacter = restTemplate.exchange(
          currentUrl,
          HttpMethod.GET,
          HttpEntity.EMPTY,
          MovieCharacter.class
      ).getBody();
      if(movieCharacter != null) {
        save(movieCharacter);
        homeWorldManager.loadFromURL(movieCharacter.getHomeworld());
        starshipManager.loadFromURL(movieCharacter.getStarships());
        vehicleManager.loadFromURL(movieCharacter.getVehicles());
        filmManager.loadFromURL(movieCharacter.getFilms());
        speciesManager.loadFromURL(movieCharacter.getSpecies());
      }
      id++;
    } while (id < 50);
    return true;
  }
}
