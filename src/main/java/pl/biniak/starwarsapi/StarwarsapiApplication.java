package pl.biniak.starwarsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StarwarsapiApplication {

  public static void main(String[] args) {
    try {
      SpringApplication.run(StarwarsapiApplication.class, args);
    } catch (Throwable exception) {
      exception.printStackTrace();
    }

  }

}
