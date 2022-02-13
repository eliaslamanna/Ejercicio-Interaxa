package app.exception.types;

import app.exception.PersonaException;
import app.model.dto.ErrorDTO;
import org.springframework.http.HttpStatus;

public class PersonaDoesntExistDeleteException extends PersonaException {
    public PersonaDoesntExistDeleteException() {
        super(HttpStatus.BAD_REQUEST, new ErrorDTO("La persona no existe", "La persona que se quiere borrar no existe."));
    }
}
