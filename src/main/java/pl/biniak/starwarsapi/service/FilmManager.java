package pl.biniak.starwarsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.biniak.starwarsapi.entity.Film;
import pl.biniak.starwarsapi.repository.FilmRepo;

import java.util.List;

@Service
public class FilmManager {

  private FilmRepo filmRepo;

  @Autowired
  public FilmManager(FilmRepo filmRepo) {
    this.filmRepo = filmRepo;
  }

  public Film save(Film film) {
    return filmRepo.save(film);
  }

  public Iterable<Film> findAll() {
    return filmRepo.findAll();
  }

  public boolean loadFromURL(List<String> urls) {
    RestTemplate restTemplate = new RestTemplate();
    urls.forEach(url ->
        save(
            restTemplate.exchange(
                url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Film.class
            ).getBody()
        ));

    return true;
  }
}
