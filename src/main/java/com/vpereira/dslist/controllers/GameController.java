package com.vpereira.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vpereira.dslist.dto.GameDTO;
import com.vpereira.dslist.dto.GameMinDTO;
import com.vpereira.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO gameDTO = gameService.findById(id);
		return gameDTO;
	}
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> games = gameService.findAll();
		return games;
	}
}
