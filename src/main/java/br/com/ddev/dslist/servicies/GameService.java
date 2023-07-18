package br.com.ddev.dslist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ddev.dslist.dtos.GameDTO.GameMinDTO;
import br.com.ddev.dslist.repositories.GameRepository;
import br.com.ddev.dslist.servicies.converterDtos.GameConverterDTO;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAllGamesMin() {
		return gameRepository.findAll()
				.stream()
				.map(x -> GameConverterDTO.gameToGameMinDTO(x))
				.toList();		
	}
	
}
