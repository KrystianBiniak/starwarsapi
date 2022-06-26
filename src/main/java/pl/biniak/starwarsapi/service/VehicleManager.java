package pl.biniak.starwarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.biniak.starwarsapi.entity.Vehicle;
import pl.biniak.starwarsapi.repository.VehicleRepo;

import java.util.List;

@Service
public class VehicleManager {

  private VehicleRepo vehicleRepo;

  @Autowired
  public VehicleManager(VehicleRepo vehicleRepo) {
    this.vehicleRepo = vehicleRepo;
  }

  public Vehicle save(Vehicle vehicle) {
    return vehicleRepo.save(vehicle);
  }

  public Iterable<Vehicle> findAll() {
    return vehicleRepo.findAll();
  }

  public boolean loadFromURL(List<String> urls) {
    RestTemplate restTemplate = new RestTemplate();
    urls.forEach(url -> save(
        restTemplate.exchange(
            url,
            HttpMethod.GET,
            HttpEntity.EMPTY,
            Vehicle.class
        ).getBody()
    ));
    return true;
  }
}
