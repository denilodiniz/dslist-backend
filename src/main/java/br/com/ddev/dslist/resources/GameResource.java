package br.com.ddev.dslist.resources;

import java.util.List;

import br.com.ddev.dslist.dtos.GameDTO.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.ddev.dslist.dtos.GameDTO.GameMinDTO;
import br.com.ddev.dslist.servicies.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

	@Autowired
	private GameService gameService;
	
	@GetMapping	
	public ResponseEntity<List<GameMinDTO>> findAllGamesMin() {
		return ResponseEntity.ok().body(gameService.findAllGamesMin());
	}

	@GetMapping(value= "/{id}")
	public ResponseEntity<GameDTO> findById(@PathVariable long id) {
		return ResponseEntity.ok().body(gameService.findByid(id));
	}
	
}
