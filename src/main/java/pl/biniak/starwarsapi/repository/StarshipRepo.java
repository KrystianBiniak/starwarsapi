package pl.biniak.starwarsapi.repository;

import org.springframework.data.repository.CrudRepository;
import pl.biniak.starwarsapi.entity.Starship;

public interface StarshipRepo extends CrudRepository<Starship, Long> {
}
