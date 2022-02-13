package app.exception.types;

import app.exception.PersonaException;
import app.model.dto.ErrorDTO;
import org.springframework.http.HttpStatus;

public class PersonaDoesntExistUpdateException extends PersonaException {
    public PersonaDoesntExistUpdateException() {
        super(HttpStatus.BAD_REQUEST, new ErrorDTO("La persona no existe", "La persona que se quiere modificar no existe."));
    }
}
