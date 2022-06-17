package pl.biniak.starwarsapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.biniak.starwarsapi.entity.MovieCharacter;
import pl.biniak.starwarsapi.service.CharacterManager;

import java.util.Optional;

@RestController
@RequestMapping("/characters")
public class StarWarsApi {

  private CharacterManager characterManager;

  @Autowired
  public StarWarsApi(CharacterManager characterManager) {
    this.characterManager = characterManager;
  }

  @GetMapping("/all")
  public Iterable<MovieCharacter> getAll() {
    return characterManager.findAll();
  }

  @GetMapping
  public Optional<MovieCharacter> getByID(@RequestParam long id) {
    return characterManager.findByID(id);
  }
}
