package app.service.impl;

import app.exception.types.PersonaAlreadyExistsException;
import app.exception.types.PersonaDoesntExistDeleteException;
import app.exception.types.PersonaDoesntExistUpdateException;
import app.mapper.PersonaMapper;
import app.model.Persona;
import app.model.dto.PersonaDTO;
import app.repository.IPersonasRepository;
import app.service.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasService implements IPersonasService {

    private final IPersonasRepository personasRepository;

    @Autowired
    public PersonasService(IPersonasRepository personasRepository) {
        this.personasRepository = personasRepository;
    }

    @Override
    public PersonaDTO altaPersona(PersonaDTO persona) throws PersonaAlreadyExistsException {
        if(personasRepository.existsById(persona.getDni())) {
            throw new PersonaAlreadyExistsException();
        }
        personasRepository.save(PersonaMapper.createPersona(persona));
        return persona;
    }

    @Override
    public PersonaDTO bajaPersona(String dniPersona) throws PersonaDoesntExistDeleteException {
        if(!personasRepository.existsById(dniPersona)) {
            throw new PersonaDoesntExistDeleteException();
        }
        Persona persona = personasRepository.getById(dniPersona);
        personasRepository.delete(persona);
        return PersonaMapper.createPersonaDTO(persona);
    }

    @Override
    public PersonaDTO modificacionPersona(PersonaDTO persona) throws PersonaDoesntExistUpdateException {
        if(!personasRepository.existsById(persona.getDni())) {
            throw new PersonaDoesntExistUpdateException();
        }
        personasRepository.save(PersonaMapper.createPersona(persona));
        return persona;
    }
}
