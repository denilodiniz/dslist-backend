package br.com.ddev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ddev.dslist.entities.Game;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
