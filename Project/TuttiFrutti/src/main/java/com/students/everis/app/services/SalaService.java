package com.students.everis.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.students.everis.app.entidad.Sala;
import com.students.everis.app.entidad.Usuario;

@Service
public class SalaService {

	private List<Sala> salas;
	
	public SalaService() {
		this.salas = new ArrayList<Sala>();
	}
	
	public Sala create(String name) {
		Sala nueva = new Sala();
		nueva.setName(name); 
		salas.add(nueva);
		return nueva;
	}
	
	public Sala getSala(Long sala) {
		for (Sala salita : salas) {
			if(salita.getId().equals(sala)) {
				return salita;
			}
		}
		return null;
	}
	
	public boolean addUser(Long sala, Long user) {
		Sala salita = getSala(sala);
		if(salita != null) {
			Usuario usuario = getUser(salita, user);
			if(usuario != null) {
				salita.addPlayer(usuario);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeUser(Long sala, Long user) {
		Sala salita = getSala(sala);
		if(salita != null) {
			Usuario usuario = getUser(salita, user);
			if(usuario != null) {
				salita.removePlayer(usuario);
				return true;
			}
		}
		return false;
	}
	
	private Usuario getUser(Sala sala, Long user) {
		for (Usuario usu : sala.getJugadores()) {
			if(usu.getId().equals(user)) {
				return usu;
			}
		}
		return null;
	}
}
