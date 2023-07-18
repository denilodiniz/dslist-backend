package br.com.ddev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ddev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
