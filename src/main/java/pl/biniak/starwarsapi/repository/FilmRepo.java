package pl.biniak.starwarsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.biniak.starwarsapi.entity.Film;

@Repository
public interface FilmRepo extends CrudRepository<Film, Long> {
}
