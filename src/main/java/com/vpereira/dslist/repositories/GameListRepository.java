package com.vpereira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vpereira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
