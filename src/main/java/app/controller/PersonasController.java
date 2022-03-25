package app.controller;

import app.exception.types.PersonaAlreadyExistsException;
import app.exception.types.PersonaDoesntExistDeleteException;
import app.exception.types.PersonaDoesntExistUpdateException;
import app.model.dto.PersonaDTO;
import app.service.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"app.url"})
@RestController
@RequestMapping(path = "/personas")
public class PersonasController {

    private final IPersonasService personasService;

    @Autowired
    public PersonasController(IPersonasService personasService) {
        this.personasService = personasService;
    }

    @PostMapping("/alta")
    public ResponseEntity<PersonaDTO> altaPersona(@RequestBody PersonaDTO persona) throws PersonaAlreadyExistsException {
        return new ResponseEntity<>(personasService.altaPersona(persona), HttpStatus.OK);
    }

    @DeleteMapping("/baja/{dniPersona}")
    public ResponseEntity<PersonaDTO> bajaPersona(@PathVariable String dniPersona) throws PersonaDoesntExistDeleteException {
        return new ResponseEntity<>(personasService.bajaPersona(dniPersona), HttpStatus.OK);
    }

    @PutMapping("/modificacion")
    public ResponseEntity<PersonaDTO> modificacionPersona(@RequestBody PersonaDTO persona) throws PersonaDoesntExistUpdateException {
        return new ResponseEntity<>(personasService.modificacionPersona(persona), HttpStatus.OK);
    }

    @GetMapping("/obtener/{dniPersona}")
    public ResponseEntity<PersonaDTO> getPersona(@PathVariable String dniPersona) {
        return new ResponseEntity<>(personasService.getPersona(dniPersona), HttpStatus.OK);
    }
}
