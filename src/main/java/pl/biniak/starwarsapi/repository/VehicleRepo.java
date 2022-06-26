package pl.biniak.starwarsapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.biniak.starwarsapi.entity.Vehicle;

@Repository
public interface VehicleRepo extends CrudRepository<Vehicle, Long> {
}
