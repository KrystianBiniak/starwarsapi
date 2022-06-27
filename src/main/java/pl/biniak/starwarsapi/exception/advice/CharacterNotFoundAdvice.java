package pl.biniak.starwarsapi.exception.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.biniak.starwarsapi.exception.CharacterNotFoundException;

@ControllerAdvice
public class CharacterNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(CharacterNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String characterNotFoundHandler(CharacterNotFoundException exception) {
    return exception.getMessage();
  }
}
