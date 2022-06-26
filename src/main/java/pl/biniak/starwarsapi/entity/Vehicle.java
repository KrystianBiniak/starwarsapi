package pl.biniak.starwarsapi.entity;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Generated("jsonschema2pojo")
public class Vehicle {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private long id;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("model")
  @Expose
  private String model;
  @SerializedName("manufacturer")
  @Expose
  private String manufacturer;
  @SerializedName("cost_in_credits")
  @Expose
  private String costInCredits;
  @SerializedName("length")
  @Expose
  private String length;
  @SerializedName("max_atmosphering_speed")
  @Expose
  private String maxAtmospheringSpeed;
  @SerializedName("crew")
  @Expose
  private String crew;
  @SerializedName("passengers")
  @Expose
  private String passengers;
  @SerializedName("cargo_capacity")
  @Expose
  private String cargoCapacity;
  @SerializedName("consumables")
  @Expose
  private String consumables;
  @SerializedName("vehicle_class")
  @Expose
  private String vehicleClass;
  @SerializedName("pilots")
  @Expose
  @ElementCollection
  @Column(name = "character")
  private List<String> pilots = null;
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

  public Vehicle() {
  }

  public Vehicle(String name, String model, String manufacturer, String costInCredits, String length, String maxAtmospheringSpeed, String crew, String passengers, String cargoCapacity, String consumables, String vehicleClass, List<String> pilots, List<String> films, String created, String edited, String url) {
    this.name = name;
    this.model = model;
    this.manufacturer = manufacturer;
    this.costInCredits = costInCredits;
    this.length = length;
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    this.crew = crew;
    this.passengers = passengers;
    this.cargoCapacity = cargoCapacity;
    this.consumables = consumables;
    this.vehicleClass = vehicleClass;
    this.pilots = pilots;
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

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCostInCredits() {
    return costInCredits;
  }

  public void setCostInCredits(String costInCredits) {
    this.costInCredits = costInCredits;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public String getMaxAtmospheringSpeed() {
    return maxAtmospheringSpeed;
  }

  public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
  }

  public String getCrew() {
    return crew;
  }

  public void setCrew(String crew) {
    this.crew = crew;
  }

  public String getPassengers() {
    return passengers;
  }

  public void setPassengers(String passengers) {
    this.passengers = passengers;
  }

  public String getCargoCapacity() {
    return cargoCapacity;
  }

  public void setCargoCapacity(String cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }

  public String getConsumables() {
    return consumables;
  }

  public void setConsumables(String consumables) {
    this.consumables = consumables;
  }

  public String getVehicleClass() {
    return vehicleClass;
  }

  public void setVehicleClass(String vehicleClass) {
    this.vehicleClass = vehicleClass;
  }

  public List<String> getPilots() {
    return pilots;
  }

  public void setPilots(List<String> pilots) {
    this.pilots = pilots;
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
    sb.append("model");
    sb.append('=');
    sb.append(((this.model == null) ? "<null>" : this.model));
    sb.append(',');
    sb.append("manufacturer");
    sb.append('=');
    sb.append(((this.manufacturer == null) ? "<null>" : this.manufacturer));
    sb.append(',');
    sb.append("costInCredits");
    sb.append('=');
    sb.append(((this.costInCredits == null) ? "<null>" : this.costInCredits));
    sb.append(',');
    sb.append("length");
    sb.append('=');
    sb.append(((this.length == null) ? "<null>" : this.length));
    sb.append(',');
    sb.append("maxAtmospheringSpeed");
    sb.append('=');
    sb.append(((this.maxAtmospheringSpeed == null) ? "<null>" : this.maxAtmospheringSpeed));
    sb.append(',');
    sb.append("crew");
    sb.append('=');
    sb.append(((this.crew == null) ? "<null>" : this.crew));
    sb.append(',');
    sb.append("passengers");
    sb.append('=');
    sb.append(((this.passengers == null) ? "<null>" : this.passengers));
    sb.append(',');
    sb.append("cargoCapacity");
    sb.append('=');
    sb.append(((this.cargoCapacity == null) ? "<null>" : this.cargoCapacity));
    sb.append(',');
    sb.append("consumables");
    sb.append('=');
    sb.append(((this.consumables == null) ? "<null>" : this.consumables));
    sb.append(',');
    sb.append("vehicleClass");
    sb.append('=');
    sb.append(((this.vehicleClass == null) ? "<null>" : this.vehicleClass));
    sb.append(',');
    sb.append("pilots");
    sb.append('=');
    sb.append(((this.pilots == null) ? "<null>" : this.pilots));
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
