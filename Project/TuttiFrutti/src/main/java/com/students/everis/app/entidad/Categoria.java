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
public class Categoria {
    
	private String name;
	
	private List<String> possibleValues = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(List<String> possibleValues) {
		this.possibleValues = possibleValues;
	}
	
	public void addValue(String value) {
		this.possibleValues.add(value);
	}
	
	public void removeValue(String value) {
		this.possibleValues.remove(value);
	}
}
