/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.everis.app.entidad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gvalverd
 */
@Entity
public class Sala{
    
	private String name;
	
	private List<Usuario> jugadores = new ArrayList<Usuario>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Usuario> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Usuario> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void addPlayer(Usuario user) {
		this.jugadores.add(user);
	}
	
	public void removePlayer(Usuario user) {
		this.jugadores.remove(user);
	}
}
