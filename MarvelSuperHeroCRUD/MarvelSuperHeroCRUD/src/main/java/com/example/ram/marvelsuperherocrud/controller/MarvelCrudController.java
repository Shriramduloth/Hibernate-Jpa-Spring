package com.example.ram.marvelsuperherocrud.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarvelCrudController {
	
	@PostMapping(path = "create")
	public void createSuperHero(@RequestBody Character superHero) {

	}
}
