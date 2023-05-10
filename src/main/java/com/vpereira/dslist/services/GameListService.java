package com.vpereira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vpereira.dslist.dto.GameListDTO;
import com.vpereira.dslist.entities.GameList;
import com.vpereira.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> gameList = gameListRepository.findAll();
		List<GameListDTO> gameListDTO = gameList.stream().map(list -> new GameListDTO(list)).toList();
		return gameListDTO;
	}
}