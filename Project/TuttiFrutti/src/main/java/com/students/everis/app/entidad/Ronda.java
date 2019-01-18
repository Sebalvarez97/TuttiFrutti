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
public class Ronda {
	
	public enum Letra{
		A(0), B(1), C(2), D(3), E(4), F(5), G(6), H(7), I(8), J(9), 
		K(10), L(11), M(12), N(13), O(14), P(15), Q(16), R(17), S(18), T(19),
		U(20), V(21), W(22), X(23), Y(24), Z(25);
		
		public int value;
		
		Letra(int value) {
			this.value = value;
		}
		
	}
	
	private Letra letra;
	
	private List<Result> resultados = new ArrayList<Result>();

	public List<Result> getResultados() {
		return resultados;
	}

	public void setResultados(List<Result> resultados) {
		this.resultados = resultados;
	}
	
	public void addResult(Result result) {
		this.resultados.add(result);
	}
	
	public void removeResult(Result result) {
		this.resultados.remove(result);
	}

	public Letra getLetra() {
		return letra;
	}

	public void setLetra(Letra letra) {
		this.letra = letra;
	}
}
