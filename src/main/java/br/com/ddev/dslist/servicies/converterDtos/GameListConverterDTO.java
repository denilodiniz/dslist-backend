package br.com.ddev.dslist.servicies.converterDtos;

import br.com.ddev.dslist.dtos.GameListDTO.GameListDTO;
import br.com.ddev.dslist.entities.GameList;

public class GameListConverterDTO {

    public static GameListDTO gameListToDTO (GameList gameList) {
        GameListDTO gameListDTO = new GameListDTO();
        gameListDTO.setName(gameList.getName());

        return gameListDTO;
    }

}
