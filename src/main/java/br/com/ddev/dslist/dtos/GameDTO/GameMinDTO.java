package br.com.ddev.dslist.dtos.GameDTO;

import br.com.ddev.dslist.entities.Game;
import br.com.ddev.dslist.projections.GameMinProjection;
import org.springframework.beans.BeanUtils;

import java.io.Serial;
import java.io.Serializable;

public class GameMinDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private String title;
	private Integer gameYear;
	private String imgUrl;
	private String shortDescription;


	public GameMinDTO() {
	}

	//Para o Copy Properties funcionar é necessário colcocar os Get's e Set's do Objeto/DTO
	public GameMinDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getGameYear() {
		return gameYear;
	}

	public void setGameYear(Integer gameYear) {
		this.gameYear = gameYear;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
}
