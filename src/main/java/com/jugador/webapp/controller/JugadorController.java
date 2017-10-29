package com.jugador.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jugador.webapp.entity.Jugador;
import com.jugador.webapp.repository.JugadorRepository;

@RestController
@RequestMapping("/jugador")
public class JugadorController {
	
	private static final String LIST_JUGADORES	= "/";
	private static final String JUGADOR 		= "/{jugadorCI}";
	
	
	@Autowired
	private JugadorRepository repo;
	
	@GetMapping(value = LIST_JUGADORES, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> listJugadores(){
		List<Jugador> jugadores = (List<Jugador>) repo.findAll();
		
		return new ResponseEntity<List<Jugador>>(jugadores, HttpStatus.OK);
	}
	
	@GetMapping(value = JUGADOR, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getJugadorByCI(@PathVariable String jugadorCI) {
		Jugador jugador = repo.findOne(Integer.parseInt(jugadorCI));
		
		return new ResponseEntity<Jugador>(jugador, HttpStatus.OK);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveJugador(@RequestBody Jugador jugador){
		
		Jugador j = repo.save(jugador);
		
		return new ResponseEntity<Jugador>(j, HttpStatus.CREATED);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateJugador(@RequestBody Jugador jugador){
		
		Jugador j = repo.save(jugador);
		return new ResponseEntity<Jugador>(j, HttpStatus.OK);
	}
	
	@DeleteMapping(value= JUGADOR)
	public ResponseEntity<?> deleteJugador(@PathVariable String jugadorCI){
		
		repo.delete(Integer.parseInt(jugadorCI));
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
