package pl.biniak.starwarsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.biniak.starwarsapi.entity.Starship;

import java.util.List;

@Repository
public interface StarshipRepo extends CrudRepository<List<Starship>, Long> {
}
