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
public class Game {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long time;
	
	private boolean playing;
	
	private List<Ronda> rondas = new ArrayList<Ronda>();
	
	private List<Usuario> jugadores = new ArrayList<Usuario>();
	
	private List<Categoria> categorias = new ArrayList<Categoria>();

	public List<Ronda> getRondas() {
		return rondas;
	}

	public void setRondas(List<Ronda> rondas) {
		this.rondas = rondas;
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
	
	public void addRonda(Ronda ronda) {
		this.rondas.add(ronda);
	}
	
	public void removeRonda(Ronda ronda) {
		this.rondas.remove(ronda);
	}
	
	public void addCategoria(Categoria categoria) {
		this.categorias.add(categoria);
	}
	
	public void removeCategoria(Categoria categoria) {
		this.categorias.remove(categoria);
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
}
