package pl.biniak.starwarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.biniak.starwarsapi.entity.Species;
import pl.biniak.starwarsapi.repository.SpeciesRepo;

import java.util.List;

@Service
public class SpeciesManager {

  private SpeciesRepo speciesRepo;

  @Autowired
  public SpeciesManager(SpeciesRepo speciesRepo) {
    this.speciesRepo = speciesRepo;
  }

  public Species save(Species species) {
    return speciesRepo.save(species);
  }

  public Iterable<Species> findAll() {
    return speciesRepo.findAll();
  }

  public boolean loadFromURL(List<String> urls) {
    RestTemplate restTemplate = new RestTemplate();
    urls.forEach(url -> save(
            restTemplate.exchange(
                url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Species.class
            ).getBody()
        ));
    return true;
  }
}
