package pl.biniak.starwarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.biniak.starwarsapi.entity.Starship;
import pl.biniak.starwarsapi.repository.StarshipRepo;

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
}
