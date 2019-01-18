/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.everis.app.entidad;

import javax.persistence.Entity;

/**
 *
 * @author gvalverd
 */
@Entity
public class Respuesta {
    
	private String valor;
	
	private Categoria categoria;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
