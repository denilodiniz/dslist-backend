package br.com.ddev.dslist.dtos.GameDTO;

import java.io.Serial;
import java.io.Serializable;

public class GameMinDTO implements Serializable {
	
	@Serial
	private static final long serialVersionUID = 1L;

	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
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
