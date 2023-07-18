package br.com.ddev.dslist.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_games")
public class Game implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotNull(message = "The TITLE field is required.")
	@Column(name = "title")
	private String title;
	
	@NotNull(message = "The YEAR field is required.")
	@Column(name = "game_year")
	private Integer year;
	
	@NotNull(message = "The GENRE field is required.")
	@Column(name = "genre")
	private String genre;
	
	@NotNull(message = "The PLATFORMS field is required.")
	@Column(name = "platforms")
	private String platforms;
	
	@NotNull(message = "The SCORE field is required.")
	@Column(name = "score")
	private Double score;
	
	@NotNull(message = "The IMAGE URL field is required.")
	@Column(name = "img_url")
	private String imgUrl;
	
	@NotNull(message = "The SHORT DESCRIPTION field is required.")
	@Column(name = "short_description")
	private String shortDescription;
	
	@NotNull(message = "The LONG DESCRIPTION field is required.")
	@Column(name = "long_description")
	private String longDescription;

	
	
	public Game() {
	}

	public Game(@NotNull(message = "The TITLE field is required.") String title,
			@NotNull(message = "The YEAR field is required.") Integer year,
			@NotNull(message = "The GENRE field is required.") String genre,
			@NotNull(message = "The PLATFORMS field is required.") String platforms,
			@NotNull(message = "The SCORE field is required.") Double score,
			@NotNull(message = "The IMAGE URL field is required.") String imgUrl,
			@NotNull(message = "The SHORT DESCRIPTION field is required.") String shortDescription,
			@NotNull(message = "The LONG DESCRIPTION field is required.") String longDescription) {
		super();
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
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

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id) && Objects.equals(title, other.title);
	}
	
}
