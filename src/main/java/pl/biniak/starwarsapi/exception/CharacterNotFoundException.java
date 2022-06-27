package pl.biniak.starwarsapi.exception;

public class CharacterNotFoundException extends RuntimeException {

  public CharacterNotFoundException(long id) {
    super("Couldn't find character with id: " + id);
  }
}
