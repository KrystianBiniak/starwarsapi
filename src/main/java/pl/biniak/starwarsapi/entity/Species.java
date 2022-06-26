package pl.biniak.starwarsapi.entity;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Generated("jsonschema2pojo")
public class Species {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private long id;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("classification")
  @Expose
  private String classification;
  @SerializedName("designation")
  @Expose
  private String designation;
  @SerializedName("average_height")
  @Expose
  private String averageHeight;
  @SerializedName("skin_colors")
  @Expose
  private String skinColors;
  @SerializedName("hair_colors")
  @Expose
  private String hairColors;
  @SerializedName("eye_colors")
  @Expose
  private String eyeColors;
  @SerializedName("average_lifespan")
  @Expose
  private String averageLifespan;
  @SerializedName("homeworld")
  @Expose
  private String homeworld;
  @SerializedName("language")
  @Expose
  private String language;
  @SerializedName("people")
  @Expose
  @ElementCollection
  @Column(name = "character")
  private List<String> people = null;
  @SerializedName("films")
  @Expose
  @ElementCollection
  @Column(name = "film")
  private List<String> films = null;
  @SerializedName("created")
  @Expose
  private String created;
  @SerializedName("edited")
  @Expose
  private String edited;
  @SerializedName("url")
  @Expose
  private String url;

  public Species() {
  }

  public Species(String name, String classification, String designation, String averageHeight, String skinColors, String hairColors, String eyeColors, String averageLifespan, String homeworld, String language, List<String> people, List<String> films, String created, String edited, String url) {
    this.name = name;
    this.classification = classification;
    this.designation = designation;
    this.averageHeight = averageHeight;
    this.skinColors = skinColors;
    this.hairColors = hairColors;
    this.eyeColors = eyeColors;
    this.averageLifespan = averageLifespan;
    this.homeworld = homeworld;
    this.language = language;
    this.people = people;
    this.films = films;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getAverageHeight() {
    return averageHeight;
  }

  public void setAverageHeight(String averageHeight) {
    this.averageHeight = averageHeight;
  }

  public String getSkinColors() {
    return skinColors;
  }

  public void setSkinColors(String skinColors) {
    this.skinColors = skinColors;
  }

  public String getHairColors() {
    return hairColors;
  }

  public void setHairColors(String hairColors) {
    this.hairColors = hairColors;
  }

  public String getEyeColors() {
    return eyeColors;
  }

  public void setEyeColors(String eyeColors) {
    this.eyeColors = eyeColors;
  }

  public String getAverageLifespan() {
    return averageLifespan;
  }

  public void setAverageLifespan(String averageLifespan) {
    this.averageLifespan = averageLifespan;
  }

  public String getHomeworld() {
    return homeworld;
  }

  public void setHomeworld(String homeworld) {
    this.homeworld = homeworld;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public List<String> getPeople() {
    return people;
  }

  public void setPeople(List<String> people) {
    this.people = people;
  }

  public List<String> getFilms() {
    return films;
  }

  public void setFilms(List<String> films) {
    this.films = films;
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
    sb.append("name");
    sb.append('=');
    sb.append(((this.name == null) ? "<null>" : this.name));
    sb.append(',');
    sb.append("classification");
    sb.append('=');
    sb.append(((this.classification == null) ? "<null>" : this.classification));
    sb.append(',');
    sb.append("designation");
    sb.append('=');
    sb.append(((this.designation == null) ? "<null>" : this.designation));
    sb.append(',');
    sb.append("averageHeight");
    sb.append('=');
    sb.append(((this.averageHeight == null) ? "<null>" : this.averageHeight));
    sb.append(',');
    sb.append("skinColors");
    sb.append('=');
    sb.append(((this.skinColors == null) ? "<null>" : this.skinColors));
    sb.append(',');
    sb.append("hairColors");
    sb.append('=');
    sb.append(((this.hairColors == null) ? "<null>" : this.hairColors));
    sb.append(',');
    sb.append("eyeColors");
    sb.append('=');
    sb.append(((this.eyeColors == null) ? "<null>" : this.eyeColors));
    sb.append(',');
    sb.append("averageLifespan");
    sb.append('=');
    sb.append(((this.averageLifespan == null) ? "<null>" : this.averageLifespan));
    sb.append(',');
    sb.append("homeworld");
    sb.append('=');
    sb.append(((this.homeworld == null) ? "<null>" : this.homeworld));
    sb.append(',');
    sb.append("language");
    sb.append('=');
    sb.append(((this.language == null) ? "<null>" : this.language));
    sb.append(',');
    sb.append("people");
    sb.append('=');
    sb.append(((this.people == null) ? "<null>" : this.people));
    sb.append(',');
    sb.append("films");
    sb.append('=');
    sb.append(((this.films == null) ? "<null>" : this.films));
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

