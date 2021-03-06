package pl.biniak.starwarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.biniak.starwarsapi.entity.Starship;
import pl.biniak.starwarsapi.repository.StarshipRepo;

import java.util.List;

@Service
public class StarshipManager {

  private StarshipRepo starshipRepo;

  @Autowired
  public StarshipManager(StarshipRepo starshipRepo) {
    this.starshipRepo = starshipRepo;
  }

  public Starship save(Starship starship) {
    return starshipRepo.save(starship);
  }

  public Iterable<Starship> findAll() {
    return starshipRepo.findAll();
  }

  public boolean loadFromURL(List<String> urls) {
    RestTemplate restTemplate = new RestTemplate();
    urls.forEach(url ->
        save (
            restTemplate.exchange(
                url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Starship.class
            ).getBody()
        ));
    return true;
  }
}
