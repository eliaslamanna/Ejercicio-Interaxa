package app.service.impl;

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
    public PersonaDTO altaPersona(PersonaDTO persona) {
        personasRepository.save(PersonaMapper.createPersona(persona));
        return persona;
    }

    @Override
    public PersonaDTO bajaPersona(PersonaDTO persona) {
        personasRepository.delete(PersonaMapper.createPersona(persona));
        return persona;
    }

    @Override
    public PersonaDTO modificacionPersona(PersonaDTO persona) {
        personasRepository.save(PersonaMapper.createPersona(persona));
        return persona;
    }
}
