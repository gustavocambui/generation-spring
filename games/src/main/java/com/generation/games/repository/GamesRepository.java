package com.generation.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.games.model.Games;


public interface GamesRepository extends JpaRepository <Games, Long>{
	public List<Games> findAllByNomeContainingIgnoreCase (String nome);
}
