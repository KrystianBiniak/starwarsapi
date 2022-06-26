package pl.biniak.starwarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.biniak.starwarsapi.entity.HomeWorld;
import pl.biniak.starwarsapi.repository.HomeWorldRepo;

@Service
public class HomeWorldManager {

  private HomeWorldRepo homeWorldRepo;

  @Autowired
  public HomeWorldManager(HomeWorldRepo homeWorldRepo) {
    this.homeWorldRepo = homeWorldRepo;
  }

  public HomeWorld save(HomeWorld homeWorld) {
    return homeWorldRepo.save(homeWorld);
  }

  public Iterable<HomeWorld> findAll() {
    return homeWorldRepo.findAll();
  }

  public boolean loadFromURL(String url) {
    HomeWorld homeWorld = new RestTemplate().exchange(
        url,
        HttpMethod.GET,
        HttpEntity.EMPTY,
        HomeWorld.class
    ).getBody();
    save(homeWorld);
    return true;
  }
}
