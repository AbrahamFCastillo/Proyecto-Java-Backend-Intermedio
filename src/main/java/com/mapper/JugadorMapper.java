package com.mapper;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.dto.ActualizarJugadorDTO;
import com.dto.CrearJugadorDTO;
import com.dto.JugadorDTO;
import com.model.Jugador;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface JugadorMapper {
    JugadorDTO toDTO(Jugador modelo);

    List<JugadorDTO> toDTO(List<Jugador> modelos);
  
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Jugador toModel(CrearJugadorDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void actualizar(@MappingTarget Jugador modelo, ActualizarJugadorDTO dto);
}
