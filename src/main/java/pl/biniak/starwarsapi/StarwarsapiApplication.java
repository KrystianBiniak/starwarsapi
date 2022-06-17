package pl.biniak.starwarsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarwarsapiApplication {

  public static void main(String[] args) {
    try {
      SpringApplication.run(StarwarsapiApplication.class, args);
    } catch (Throwable exception) {
      exception.printStackTrace();
    }

  }

}
