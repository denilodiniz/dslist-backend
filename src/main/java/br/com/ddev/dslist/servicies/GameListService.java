package br.com.ddev.dslist.servicies;

import br.com.ddev.dslist.dtos.GameListDTO.GameListDTO;
import br.com.ddev.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll (){
        return gameListRepository.findAll()
                .stream()
                .map(x -> new GameListDTO(x))
                .toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        return new GameListDTO(gameListRepository.findById(id).get());
    }

}
