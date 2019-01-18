/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.everis.app.entidad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

/**
 *
 * @author gvalverd
 */
@Entity
public class Result {
    
	private Usuario user;
	
	private int puntos;
	
	private List<Respuesta> respuestas = new ArrayList<Respuesta>();

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}
}
