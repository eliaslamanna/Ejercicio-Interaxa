package app.exception.types;

import app.exception.PersonaException;
import app.model.dto.ErrorDTO;
import org.springframework.http.HttpStatus;

public class PersonaAlreadyExistsException extends PersonaException {
    public PersonaAlreadyExistsException() {
        super(HttpStatus.BAD_REQUEST, new ErrorDTO("La persona ya existe", "La persona que se quiere dar de alta ya existe."));
    }
}
