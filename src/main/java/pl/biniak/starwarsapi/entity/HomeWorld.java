package pl.biniak.starwarsapi.entity;

import org.springframework.data.annotation.Transient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HomeWorld {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private long id;
  private String name;
  private long diameter;
  private long population;

  public HomeWorld() {
  }

  public HomeWorld(long id, String name, long diameter, long population) {
    this.id = id;
    this.name = name;
    this.diameter = diameter;
    this.population = population;
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

  public long getDiameter() {
    return diameter;
  }

  public void setDiameter(long diameter) {
    this.diameter = diameter;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }
}
