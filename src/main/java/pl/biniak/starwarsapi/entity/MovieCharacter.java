package pl.biniak.starwarsapi.entity;


//@Entity

  //@GeneratedValue(strategy = GenerationType.AUTO)
  //@Id
  //private long id;


  //@ManyToOne
  //@NotFound(action = NotFoundAction.IGNORE)
  //private HomeWorld homeWorld;
  //@ElementCollection
  //@NotFound(action = NotFoundAction.IGNORE)
  //@CollectionTable(name = "STARSHIPS_ID", joinColumns = @JoinColumn(name = "MOVIE_CHARACTER_ID"))
  //private List<Starship> starships;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
@Entity
public class MovieCharacter {

  @SerializedName("name")
  @Expose
  @Id
  //@Column(name = "name", nullable = false)
  private String name;
  @SerializedName("height")
  @Expose
  private String height;
  @SerializedName("mass")
  @Expose
  private String mass;
  @SerializedName("hair_color")
  @Expose
  private String hairColor;
  @SerializedName("skin_color")
  @Expose
  private String skinColor;
  @SerializedName("eye_color")
  @Expose
  private String eyeColor;
  @SerializedName("birth_year")
  @Expose
  private String birthYear;
  @SerializedName("gender")
  @Expose
  private String gender;
  @SerializedName("homeworld")
  @Expose
  private String homeworld;
  @SerializedName("films")
  @Expose
  @ElementCollection
  @CollectionTable(name = "films", joinColumns = @JoinColumn(name = "MOVIE_CHARACTER_ID"))
  @Column(name = "film")
  private List<String> films = null;
  @SerializedName("species")
  @Expose
  @ElementCollection
  @CollectionTable(name = "species", joinColumns = @JoinColumn(name = "MOVIE_CHARACTER_ID"))
  @Column(name = "specie")
  private List<String> species = null;
  @SerializedName("vehicles")
  @Expose
  @ElementCollection
  @CollectionTable(name = "vehicles", joinColumns = @JoinColumn(name = "MOVIE_CHARACTER_ID"))
  @Column(name = "vehicle")
  private List<String> vehicles = null;
  @SerializedName("starships")
  @Expose
  @ElementCollection
  @CollectionTable(name = "starships", joinColumns = @JoinColumn(name = "MOVIE_CHARACTER_ID"))
  @Column(name = "starship")
  private List<String> starships = null;
  @SerializedName("created")
  @Expose
  private String created;
  @SerializedName("edited")
  @Expose
  private String edited;
  @SerializedName("url")
  @Expose
  private String url;

  public MovieCharacter() {
  }

  public MovieCharacter(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender, String homeworld, List<String> films, List<String> species, List<String> vehicles, List<String> starships, String created, String edited, String url) {
    this.name = name;
    this.height = height;
    this.mass = mass;
    this.hairColor = hairColor;
    this.skinColor = skinColor;
    this.eyeColor = eyeColor;
    this.birthYear = birthYear;
    this.gender = gender;
    this.homeworld = homeworld;
    this.films = films;
    this.species = species;
    this.vehicles = vehicles;
    this.starships = starships;
    this.created = created;
    this.edited = edited;
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getMass() {
    return mass;
  }

  public void setMass(String mass) {
    this.mass = mass;
  }

  public String getHairColor() {
    return hairColor;
  }

  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  public String getSkinColor() {
    return skinColor;
  }

  public void setSkinColor(String skinColor) {
    this.skinColor = skinColor;
  }

  public String getEyeColor() {
    return eyeColor;
  }

  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  public String getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getHomeworld() {
    return homeworld;
  }

  public void setHomeworld(String homeworld) {
    this.homeworld = homeworld;
  }

  public List<String> getFilms() {
    return films;
  }

  public void setFilms(List<String> films) {
    this.films = films;
  }

  public List<String> getSpecies() {
    return species;
  }

  public void setSpecies(List<String> species) {
    this.species = species;
  }

  public List<String> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<String> vehicles) {
    this.vehicles = vehicles;
  }

  public List<String> getStarships() {
    return starships;
  }

  public void setStarships(List<String> starships) {
    this.starships = starships;
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
    sb.append(MovieCharacter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
    sb.append("name");
    sb.append('=');
    sb.append(((this.name == null)?"<null>":this.name));
    sb.append(',');
    sb.append("height");
    sb.append('=');
    sb.append(((this.height == null)?"<null>":this.height));
    sb.append(',');
    sb.append("mass");
    sb.append('=');
    sb.append(((this.mass == null)?"<null>":this.mass));
    sb.append(',');
    sb.append("hairColor");
    sb.append('=');
    sb.append(((this.hairColor == null)?"<null>":this.hairColor));
    sb.append(',');
    sb.append("skinColor");
    sb.append('=');
    sb.append(((this.skinColor == null)?"<null>":this.skinColor));
    sb.append(',');
    sb.append("eyeColor");
    sb.append('=');
    sb.append(((this.eyeColor == null)?"<null>":this.eyeColor));
    sb.append(',');
    sb.append("birthYear");
    sb.append('=');
    sb.append(((this.birthYear == null)?"<null>":this.birthYear));
    sb.append(',');
    sb.append("gender");
    sb.append('=');
    sb.append(((this.gender == null)?"<null>":this.gender));
    sb.append(',');
    sb.append("homeworld");
    sb.append('=');
    sb.append(((this.homeworld == null)?"<null>":this.homeworld));
    sb.append(',');
    sb.append("films");
    sb.append('=');
    sb.append(((this.films == null)?"<null>":this.films));
    sb.append(',');
    sb.append("species");
    sb.append('=');
    sb.append(((this.species == null)?"<null>":this.species));
    sb.append(',');
    sb.append("vehicles");
    sb.append('=');
    sb.append(((this.vehicles == null)?"<null>":this.vehicles));
    sb.append(',');
    sb.append("starships");
    sb.append('=');
    sb.append(((this.starships == null)?"<null>":this.starships));
    sb.append(',');
    sb.append("created");
    sb.append('=');
    sb.append(((this.created == null)?"<null>":this.created));
    sb.append(',');
    sb.append("edited");
    sb.append('=');
    sb.append(((this.edited == null)?"<null>":this.edited));
    sb.append(',');
    sb.append("url");
    sb.append('=');
    sb.append(((this.url == null)?"<null>":this.url));
    sb.append(',');
    if (sb.charAt((sb.length()- 1)) == ',') {
      sb.setCharAt((sb.length()- 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }

}