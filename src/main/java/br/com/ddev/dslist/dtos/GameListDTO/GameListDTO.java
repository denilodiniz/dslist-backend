package br.com.ddev.dslist.dtos.GameListDTO;

import br.com.ddev.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

import java.io.Serial;
import java.io.Serializable;

public class GameListDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
