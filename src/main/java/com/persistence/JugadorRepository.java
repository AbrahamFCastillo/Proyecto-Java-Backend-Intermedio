package com.persistence;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Jugador;

@Repository
public interface JugadorRepository extends CrudRepository<Jugador, Long>{
    List<Jugador> findAll();
}
