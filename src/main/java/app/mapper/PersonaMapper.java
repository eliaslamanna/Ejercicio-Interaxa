package app.mapper;

import app.model.Persona;
import app.model.dto.PersonaDTO;

public class PersonaMapper {

    public static Persona createPersona(PersonaDTO persona) {
        return new Persona(
                persona.getDni(),
                persona.getNombre(),
                persona.getApellido(),
                persona.getEmpleado()
        );
    }

    public static PersonaDTO createPersonaDTO(Persona persona) {
        return new PersonaDTO(
            persona.getDni(),
            persona.getNombre(),
            persona.getApellido(),
            persona.getEmpleado()
        );
    }
}
