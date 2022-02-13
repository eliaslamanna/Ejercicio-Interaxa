package app.exception;

import app.model.dto.ErrorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaException extends Exception {
    private HttpStatus status;
    private ErrorDTO error;
}
