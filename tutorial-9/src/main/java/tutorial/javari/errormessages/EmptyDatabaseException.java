package tutorial.javari.errormessages;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Empty Database")
public class EmptyDatabaseException extends RuntimeException {

}
