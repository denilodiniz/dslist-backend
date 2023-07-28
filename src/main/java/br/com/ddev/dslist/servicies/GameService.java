package br.com.ddev.dslist.servicies;

import java.util.List;

import br.com.ddev.dslist.dtos.GameDTO.GameDTO;
import br.com.ddev.dslist.dtos.GameDTO.GameMinProjectionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ddev.dslist.dtos.GameDTO.GameMinDTO;
import br.com.ddev.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAllGamesMin() {
		return gameRepository.findAll()
				.stream()
				.map(x -> new GameMinDTO(x))
				.toList();		
	}

	@Transactional(readOnly = true)
	public List<GameMinProjectionDTO> findByList(Long idList) {
		return gameRepository.searchByList(idList)
				.stream()
				.map(x -> new GameMinProjectionDTO(x))
				.toList();
	}

	@Transactional(readOnly = true)
	public GameDTO findByid(Long id) {
		return new GameDTO(gameRepository.findById(id).get());
	}
	
}
