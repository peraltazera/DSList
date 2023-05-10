package com.vpereira.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vpereira.dslist.dto.GameDTO;
import com.vpereira.dslist.dto.GameListDTO;
import com.vpereira.dslist.dto.GameMinDTO;
import com.vpereira.dslist.services.GameListService;
import com.vpereira.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}/games")
	public List<GameMinDTO> findByList(@PathVariable Long id) {
		List<GameMinDTO> result = gameService.findByList(id);
		return result;
	}
}
