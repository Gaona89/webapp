package com.jugador.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.jugador.webapp.entity.Jugador;

public interface JugadorRepository extends CrudRepository<Jugador, Integer> {

}
