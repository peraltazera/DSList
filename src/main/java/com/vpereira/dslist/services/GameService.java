package com.vpereira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vpereira.dslist.dto.GameMinDTO;
import com.vpereira.dslist.entities.Game;
import com.vpereira.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> resultGames = gameRepository.findAll();
		List<GameMinDTO> resGameMinDTOs = resultGames.stream().map(game -> new GameMinDTO(game)).toList();
		return resGameMinDTOs;
	}
}
