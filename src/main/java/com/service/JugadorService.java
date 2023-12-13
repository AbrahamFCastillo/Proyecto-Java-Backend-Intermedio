package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.ActualizarJugadorDTO;
import com.dto.CrearJugadorDTO;
import com.dto.JugadorDTO;
import com.exception.JugadorNoEncontradoException;
import com.mapper.JugadorMapper;
import com.model.Jugador;
import com.persistence.JugadorRepository;

//import jakarta.transaction.Transactional;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository repositorio;

    @Autowired
    private JugadorMapper mapper;

    //Obtener todos los registros jugador
    public List<JugadorDTO> findAll() {
        List<Jugador> data = repositorio.findAll();
        return mapper.toDTO(data);
    }

    //@Transactional
    public JugadorDTO guardar(CrearJugadorDTO datos) {
        Jugador guardado = repositorio.save(mapper.toModel(datos));
        
        return mapper.toDTO(guardado);
    }

    public void actualizar(long id, ActualizarJugadorDTO datos) throws JugadorNoEncontradoException {
        Optional<Jugador> resultado = repositorio.findById(id);

        if (resultado.isEmpty()) 
            throw new JugadorNoEncontradoException(id);

        Jugador modelo = resultado.get();

        mapper.actualizar(modelo, datos);

        repositorio.save(modelo);
    }

    public void eliminarPorId(long id) {
        repositorio.deleteById(id);
    }
}
