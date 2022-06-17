package pl.biniak.starwarsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.biniak.starwarsapi.entity.MovieCharacter;

@Repository
public interface CharacterRepo extends CrudRepository<MovieCharacter, Long> {
}
