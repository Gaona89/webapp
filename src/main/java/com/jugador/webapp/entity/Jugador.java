package com.jugador.webapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jugador {
	@Id
	@Column
//	@GeneratedValue(strategy =  GenerationType.AUTO) //
	private int ci_jugador;
	@Column
	private String nombre_jugador; 
	@Column
	private String apellido_jugador;
	@Column
	private int numero_jugador; 
	@Column
	private Date fchn_jugador;

	public Jugador() {
		
		
	}
	
	public Jugador(int ci_jugador, String nombre_jugador, String apellido_jugador, int numero_jugador,
			Date fchn_jugador) {
		super();
		this.ci_jugador = ci_jugador;
		this.nombre_jugador = nombre_jugador;
		this.apellido_jugador = apellido_jugador;
		this.numero_jugador = numero_jugador;
		this.fchn_jugador = fchn_jugador;
	}


	public int getCi_jugador() {
		return ci_jugador;
	}


	public void setCi_jugador(int ci_jugador) {
		this.ci_jugador = ci_jugador;
	}


	public String getNombre_jugador() {
		return nombre_jugador;
	}


	public void setNombre_jugador(String nombre_jugador) {
		this.nombre_jugador = nombre_jugador;
	}


	public String getApellido_jugador() {
		return apellido_jugador;
	}


	public void setApellido_jugador(String apellido_jugador) {
		this.apellido_jugador = apellido_jugador;
	}


	public int getNumero_jugador() {
		return numero_jugador;
	}


	public void setNumero_jugador(int numero_jugador) {
		this.numero_jugador = numero_jugador;
	}


	public Date getFchn_jugador() {
		return fchn_jugador;
	}


	public void setFchn_jugador(Date fchn_jugador) {
		this.fchn_jugador = fchn_jugador;
	} 
	 

}
