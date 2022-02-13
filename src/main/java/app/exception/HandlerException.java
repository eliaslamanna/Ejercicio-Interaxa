package app.exception;

import app.model.dto.ErrorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(PersonaException.class)
    public ResponseEntity<ErrorDTO> petAdoptionException(PersonaException e) {
        return new ResponseEntity<>(e.getError(), e.getStatus());
    }

}
