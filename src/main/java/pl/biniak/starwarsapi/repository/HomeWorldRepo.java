package pl.biniak.starwarsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.biniak.starwarsapi.entity.HomeWorld;

@Repository
public interface HomeWorldRepo extends CrudRepository<HomeWorld, Long> {
}
