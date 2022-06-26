package pl.biniak.starwarsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.biniak.starwarsapi.entity.Species;

@Repository
public interface SpeciesRepo extends CrudRepository<Species, Long> {
}
