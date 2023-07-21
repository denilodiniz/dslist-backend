package br.com.ddev.dslist.servicies.converterDtos;

import br.com.ddev.dslist.dtos.GameDTO.GameDTO;
import br.com.ddev.dslist.dtos.GameDTO.GameMinDTO;
import br.com.ddev.dslist.entities.Game;

public class GameConverterDTO {
	
	public static GameMinDTO gameToGameMinDTO (Game game) {
		GameMinDTO gameMinDTO = new GameMinDTO();
		gameMinDTO.setTitle(game.getTitle());
		gameMinDTO.setYear(game.getGameYear());
		gameMinDTO.setImgUrl(game.getImgUrl());
		gameMinDTO.setShortDescription(game.getShortDescription());
		
		return gameMinDTO;
	}

	public static GameDTO gameToGameDTO (Game game) {
		GameDTO gameDTO = new GameDTO();
		gameDTO.setTitle(game.getTitle());
		gameDTO.setGameYear(game.getGameYear());
		gameDTO.setGenre(game.getGenre());
		gameDTO.setPlatforms(game.getPlatforms());
		gameDTO.setScore(game.getScore());
		gameDTO.setImgUrl(game.getImgUrl());
		gameDTO.setLongDescription(game.getLongDescription());

		return gameDTO;
	}
	
}
