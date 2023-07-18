package br.com.ddev.dslist.servicies.converterDtos;

import br.com.ddev.dslist.dtos.GameDTO.GameMinDTO;
import br.com.ddev.dslist.entities.Game;

public class GameConverterDTO {
	
	public static GameMinDTO gameToGameMinDTO (Game game) {
		GameMinDTO gameMinDTO = new GameMinDTO();
		gameMinDTO.setTitle(game.getTitle());
		gameMinDTO.setYear(game.getYear());
		gameMinDTO.setImgUrl(game.getImgUrl());
		gameMinDTO.setShortDescription(game.getShortDescription());
		
		return gameMinDTO;
	}
	
}
