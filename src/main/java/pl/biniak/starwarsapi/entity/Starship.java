package pl.biniak.starwarsapi.entity;

import org.springframework.data.annotation.Transient;
import pl.biniak.starwarsapi.enums.StarshipClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Starship {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String name;
  private String model;
  private long costInCredits;
  private long length;
  private long maxAtmosphericSpeed;
  private long crew;
  private StarshipClass starshipClass;

  public Starship() {
  }

  public Starship(Long id, String name, String model, long costInCredits, long length, long maxAtmosphericSpeed, long crew, StarshipClass starshipClass) {
    this.id = id;
    this.name = name;
    this.model = model;
    this.costInCredits = costInCredits;
    this.length = length;
    this.maxAtmosphericSpeed = maxAtmosphericSpeed;
    this.crew = crew;
    this.starshipClass = starshipClass;
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

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public long getCostInCredits() {
    return costInCredits;
  }

  public void setCostInCredits(long costInCredits) {
    this.costInCredits = costInCredits;
  }

  public long getLength() {
    return length;
  }

  public void setLength(long length) {
    this.length = length;
  }

  public long getMaxAtmosphericSpeed() {
    return maxAtmosphericSpeed;
  }

  public void setMaxAtmosphericSpeed(long maxAtmosphericSpeed) {
    this.maxAtmosphericSpeed = maxAtmosphericSpeed;
  }

  public long getCrew() {
    return crew;
  }

  public void setCrew(long crew) {
    this.crew = crew;
  }

  public StarshipClass getStarshipClass() {
    return starshipClass;
  }

  public void setStarshipClass(StarshipClass starshipClass) {
    this.starshipClass = starshipClass;
  }
}
