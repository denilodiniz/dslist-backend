package br.com.ddev.dslist.resources;

import br.com.ddev.dslist.dtos.GameDTO.GameMinDTO;
import br.com.ddev.dslist.dtos.GameDTO.GameMinProjectionDTO;
import br.com.ddev.dslist.dtos.GameListDTO.GameListDTO;
import br.com.ddev.dslist.servicies.GameListService;
import br.com.ddev.dslist.servicies.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games-lists")
public class GameListResource {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        return ResponseEntity.ok().body(gameListService.findAll());
    }

    @GetMapping(value = "/{idList}/games")
    public ResponseEntity<List<GameMinProjectionDTO>> findAllGamesInList(@PathVariable Long idList) {
        return ResponseEntity.ok().body(gameService.findByList(idList));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GameListDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(gameListService.findById(id));
    }

}
