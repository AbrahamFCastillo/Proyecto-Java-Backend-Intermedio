package com.mapper;

import com.dto.ActualizarJugadorDTO;
import com.dto.CrearJugadorDTO;
import com.dto.JugadorDTO;
import com.model.Jugador;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-13T08:47:33-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class JugadorMapperImpl implements JugadorMapper {

    @Override
    public JugadorDTO toDTO(Jugador modelo) {
        if ( modelo == null ) {
            return null;
        }

        JugadorDTO jugadorDTO = new JugadorDTO();

        if ( modelo.getId() != null ) {
            jugadorDTO.setId( modelo.getId() );
        }
        jugadorDTO.setNombre( modelo.getNombre() );
        jugadorDTO.setApellido( modelo.getApellido() );
        jugadorDTO.setNickname( modelo.getNickname() );
        jugadorDTO.setEmail( modelo.getEmail() );
        jugadorDTO.setPassword( modelo.getPassword() );

        return jugadorDTO;
    }

    @Override
    public List<JugadorDTO> toDTO(List<Jugador> modelos) {
        if ( modelos == null ) {
            return null;
        }

        List<JugadorDTO> list = new ArrayList<JugadorDTO>( modelos.size() );
        for ( Jugador jugador : modelos ) {
            list.add( toDTO( jugador ) );
        }

        return list;
    }

    @Override
    public Jugador toModel(CrearJugadorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Jugador jugador = new Jugador();

        jugador.setNombre( dto.getNombre() );
        jugador.setApellido( dto.getApellido() );
        jugador.setNickname( dto.getNickname() );
        jugador.setEmail( dto.getEmail() );
        jugador.setPassword( dto.getPassword() );

        return jugador;
    }

    @Override
    public void actualizar(Jugador modelo, ActualizarJugadorDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getNombre() != null ) {
            modelo.setNombre( dto.getNombre() );
        }
        if ( dto.getApellido() != null ) {
            modelo.setApellido( dto.getApellido() );
        }
        if ( dto.getNickname() != null ) {
            modelo.setNickname( dto.getNickname() );
        }
        if ( dto.getEmail() != null ) {
            modelo.setEmail( dto.getEmail() );
        }
        if ( dto.getPassword() != null ) {
            modelo.setPassword( dto.getPassword() );
        }
    }
}
