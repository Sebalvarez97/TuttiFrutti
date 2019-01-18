package com.students.everis.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.everis.app.services.SalaService;

@Controller
@RestController
@RequestMapping(path = "/sala")
public class SalaController {

	@Autowired
	private SalaService salaservice;
	
	
}
