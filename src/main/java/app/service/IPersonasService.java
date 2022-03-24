package app.service;

import app.exception.types.PersonaAlreadyExistsException;
import app.exception.types.PersonaDoesntExistDeleteException;
import app.exception.types.PersonaDoesntExistUpdateException;
import app.model.dto.PersonaDTO;

public interface IPersonasService {
    PersonaDTO altaPersona(PersonaDTO persona) throws PersonaAlreadyExistsException;
    PersonaDTO bajaPersona(String dniPersona) throws PersonaDoesntExistDeleteException;
    PersonaDTO modificacionPersona(PersonaDTO persona) throws PersonaDoesntExistUpdateException;
    PersonaDTO getPersona(String dniPersona);
}
