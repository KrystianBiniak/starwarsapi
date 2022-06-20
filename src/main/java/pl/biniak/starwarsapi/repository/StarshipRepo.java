package pl.biniak.starwarsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.biniak.starwarsapi.entity.Starship;

@Repository
public interface StarshipRepo extends CrudRepository<Starship, Long> {
}
