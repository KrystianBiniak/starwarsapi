package pl.biniak.starwarsapi.entity;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Generated("jsonschema2pojo")
public class Film {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private long id;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("episode_id")
  @Expose
  private Integer episodeId;
  @SerializedName("opening_crawl")
  @Expose
  private String openingCrawl;
  @SerializedName("director")
  @Expose
  private String director;
  @SerializedName("producer")
  @Expose
  private String producer;
  @SerializedName("release_date")
  @Expose
  private String releaseDate;
  @SerializedName("characters")
  @Expose
  @ElementCollection
  @Column(name = "character")
  private List<String> characters = null;
  @SerializedName("planets")
  @Expose
  @ElementCollection
  @Column(name = "planet")
  private List<String> planets = null;
  @SerializedName("starships")
  @Expose
  @ElementCollection
  @Column(name = "starship")
  private List<String> starships = null;
  @SerializedName("vehicles")
  @Expose
  @ElementCollection
  @Column(name = "vehicle")
  private List<String> vehicles = null;
  @SerializedName("species")
  @Expose
  @ElementCollection
  @Column(name = "species")
  private List<String> species = null;
  @SerializedName("created")
  @Expose
  private String created;
  @SerializedName("edited")
  @Expose
  private String edited;
  @SerializedName("url")
  @Expose
  private String url;

  public Film() {
  }

  public Film(String title, Integer episodeId, String openingCrawl, String director, String producer, String releaseDate, List<String> characters, List<String> planets, List<String> starships, List<String> vehicles, List<String> species, String created, String edited, String url) {
    this.title = title;
    this.episodeId = episodeId;
    this.openingCrawl = openingCrawl;
    this.director = director;
    this.producer = producer;
    this.releaseDate = releaseDate;
    this.characters = characters;
    this.planets = planets;
    this.starships = starships;
    this.vehicles = vehicles;
    this.species = species;
    this.created = created;
    this.edited = edited;
    this.url = url;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getEpisodeId() {
    return episodeId;
  }

  public void setEpisodeId(Integer episodeId) {
    this.episodeId = episodeId;
  }

  public String getOpeningCrawl() {
    return openingCrawl;
  }

  public void setOpeningCrawl(String openingCrawl) {
    this.openingCrawl = openingCrawl;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public List<String> getCharacters() {
    return characters;
  }

  public void setCharacters(List<String> characters) {
    this.characters = characters;
  }

  public List<String> getPlanets() {
    return planets;
  }

  public void setPlanets(List<String> planets) {
    this.planets = planets;
  }

  public List<String> getStarships() {
    return starships;
  }

  public void setStarships(List<String> starships) {
    this.starships = starships;
  }

  public List<String> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<String> vehicles) {
    this.vehicles = vehicles;
  }

  public List<String> getSpecies() {
    return species;
  }

  public void setSpecies(List<String> species) {
    this.species = species;
  }

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public String getEdited() {
    return edited;
  }

  public void setEdited(String edited) {
    this.edited = edited;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Species.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
    sb.append("title");
    sb.append('=');
    sb.append(((this.title == null) ? "<null>" : this.title));
    sb.append(',');
    sb.append("episodeId");
    sb.append('=');
    sb.append(((this.episodeId == null) ? "<null>" : this.episodeId));
    sb.append(',');
    sb.append("openingCrawl");
    sb.append('=');
    sb.append(((this.openingCrawl == null) ? "<null>" : this.openingCrawl));
    sb.append(',');
    sb.append("director");
    sb.append('=');
    sb.append(((this.director == null) ? "<null>" : this.director));
    sb.append(',');
    sb.append("producer");
    sb.append('=');
    sb.append(((this.producer == null) ? "<null>" : this.producer));
    sb.append(',');
    sb.append("releaseDate");
    sb.append('=');
    sb.append(((this.releaseDate == null) ? "<null>" : this.releaseDate));
    sb.append(',');
    sb.append("characters");
    sb.append('=');
    sb.append(((this.characters == null) ? "<null>" : this.characters));
    sb.append(',');
    sb.append("planets");
    sb.append('=');
    sb.append(((this.planets == null) ? "<null>" : this.planets));
    sb.append(',');
    sb.append("starships");
    sb.append('=');
    sb.append(((this.starships == null) ? "<null>" : this.starships));
    sb.append(',');
    sb.append("vehicles");
    sb.append('=');
    sb.append(((this.vehicles == null) ? "<null>" : this.vehicles));
    sb.append(',');
    sb.append("species");
    sb.append('=');
    sb.append(((this.species == null) ? "<null>" : this.species));
    sb.append(',');
    sb.append("created");
    sb.append('=');
    sb.append(((this.created == null) ? "<null>" : this.created));
    sb.append(',');
    sb.append("edited");
    sb.append('=');
    sb.append(((this.edited == null) ? "<null>" : this.edited));
    sb.append(',');
    sb.append("url");
    sb.append('=');
    sb.append(((this.url == null) ? "<null>" : this.url));
    sb.append(',');
    if (sb.charAt((sb.length() - 1)) == ',') {
      sb.setCharAt((sb.length() - 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }

}

