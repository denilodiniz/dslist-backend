package br.com.ddev.dslist.servicies;

import java.util.List;

import br.com.ddev.dslist.dtos.GameDTO.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ddev.dslist.dtos.GameDTO.GameMinDTO;
import br.com.ddev.dslist.repositories.GameRepository;
import br.com.ddev.dslist.servicies.converterDtos.GameConverterDTO;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAllGamesMin() {
		return gameRepository.findAll()
				.stream()
				.map(x -> GameConverterDTO.gameToGameMinDTO(x))
				.toList();		
	}

	@Transactional(readOnly = true)
	public GameDTO findByid(Long id) {
		return GameConverterDTO.gameToGameDTO(this.gameRepository.findById(id).get());
	}
	
}
