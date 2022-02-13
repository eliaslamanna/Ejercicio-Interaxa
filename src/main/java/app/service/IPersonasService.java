package app.service;

import app.model.Persona;
import app.model.dto.PersonaDTO;

public interface IPersonasService {
    PersonaDTO altaPersona(PersonaDTO persona);
    PersonaDTO bajaPersona(PersonaDTO persona);
    PersonaDTO modificacionPersona(PersonaDTO persona);
}
