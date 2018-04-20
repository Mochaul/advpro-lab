package tutorial.javari.errormessages;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No matching animal with found")
public class NoAnimalException extends RuntimeException {
}
