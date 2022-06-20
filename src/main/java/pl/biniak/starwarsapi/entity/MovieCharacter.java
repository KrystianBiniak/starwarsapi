package pl.biniak.starwarsapi.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import pl.biniak.starwarsapi.enums.HairColor;

import javax.persistence.*;
import java.util.List;

@Entity
public class MovieCharacter {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String name;
  private long height;
  private long mass;
  private HairColor hairColor;
  @ManyToOne
  @NotFound(action = NotFoundAction.IGNORE)
  private HomeWorld homeWorld;
  @ElementCollection
  @NotFound(action = NotFoundAction.IGNORE)
  @CollectionTable(name = "STARSHIPS_ID", joinColumns = @JoinColumn(name = "MOVIE_CHARACTER_ID"))
  private List<Starship> starships;

  public MovieCharacter() {
  }

  public MovieCharacter(long id, String name, long height, long mass, HairColor hairColor, HomeWorld homeWorld, List<Starship> starships) {
    this.id = id;
    this.name = name;
    this.height = height;
    this.mass = mass;
    this.hairColor = hairColor;
    this.homeWorld = homeWorld;
    this.starships = starships;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public long getMass() {
    return mass;
  }

  public void setMass(int mass) {
    this.mass = mass;
  }

  public HairColor getHairColor() {
    return hairColor;
  }

  public void setHairColor(HairColor hairColor) {
    this.hairColor = hairColor;
  }

  public void setHeight(long height) {
    this.height = height;
  }

  public void setMass(long mass) {
    this.mass = mass;
  }

  public HomeWorld getHomeWorld() {
    return homeWorld;
  }

  public void setHomeWorld(HomeWorld homeWorld) {
    this.homeWorld = homeWorld;
  }

  public List<Starship> getStarships() {
    return starships;
  }

  public void setStarships(List<Starship> starships) {
    this.starships = starships;
  }
}
