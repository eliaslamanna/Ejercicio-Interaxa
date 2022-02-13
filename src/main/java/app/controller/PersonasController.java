package app.controller;

import app.model.dto.PersonaDTO;
import app.service.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/personas")
public class PersonasController {

    private final IPersonasService personasService;

    @Autowired
    public PersonasController(IPersonasService personasService) {
        this.personasService = personasService;
    }

    @PostMapping("/alta")
    public ResponseEntity<PersonaDTO> altaPersona(PersonaDTO persona) {
        return new ResponseEntity<>(personasService.altaPersona(persona), HttpStatus.OK);
    }

    @PostMapping("/baja")
    public ResponseEntity<PersonaDTO> bajaPersona(PersonaDTO persona) {
        return new ResponseEntity<>(personasService.bajaPersona(persona), HttpStatus.OK);
    }

    @PostMapping("/modificacion")
    public ResponseEntity<PersonaDTO> modificacionPersona(PersonaDTO persona) {
        return new ResponseEntity<>(personasService.modificacionPersona(persona), HttpStatus.OK);
    }
}
