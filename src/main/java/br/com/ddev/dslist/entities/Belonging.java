package br.com.ddev.dslist.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging implements Serializable {

    @Serial
    private static final long serialVersionUID= 1L;

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    @Column(name = "position")
    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
