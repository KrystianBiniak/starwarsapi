package pl.biniak.starwarsapi;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import pl.biniak.starwarsapi.entity.MovieCharacter;
import pl.biniak.starwarsapi.service.CharacterManager;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StarwarsapiApplicationTest {

  @Spy
  CharacterManager characterManager;

  @Before
  public void getDataFromAPI() {
    given(characterManager.loadFromURL("https://swapi.dev/api/people/1?format=json")).willReturn(getCharacter());
  }

  @Test
  public void should_get_first_character() {
    String movieCharacter = getCharacter().toString();
    assertEquals(
        movieCharacter.substring(55, movieCharacter.length() - 1),
        characterManager.loadFromURL("https://swapi.dev/api/people/1?format=json").toString().substring(55, movieCharacter.length() - 1));
  }

  @Test
  public void should_get_different_character() {
    assertNotSame(
        getCharacter().toString(),
        characterManager.loadFromURL("https://swapi.dev/api/people/2?format=json").toString());
  }

  @Test
  public void should_fail() {
    assertNull(characterManager.loadFromURL("https://swapi.dev/api/people/17?format=json"));
  }

  private MovieCharacter getCharacter() {
    return new MovieCharacter("Luke Skywalker",
        "172",
        "77",
        null,
        null,
        null,
        null,
        "male",
        "https://swapi.dev/api/planets/1/",
        List.of("https://swapi.dev/api/films/1/", "https://swapi.dev/api/films/2/", "https://swapi.dev/api/films/3/", "https://swapi.dev/api/films/6/"),
        Collections.emptyList(),
        List.of("https://swapi.dev/api/vehicles/14/", "https://swapi.dev/api/vehicles/30/"),
        List.of("https://swapi.dev/api/starships/12/", "https://swapi.dev/api/starships/22/"),
        "2014-12-09T13:50:51.644000Z",
        "2014-12-20T21:17:56.891000Z",
        "https://swapi.dev/api/people/1/");
  }

}
