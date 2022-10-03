package springboot.study.jpa.domain;

import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "outline")
@BatchSize(size = 30)
public class Outline implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @MapsId
    @JoinColumn(name="id",foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Film film;

    /**
     * 简介
     */
    @Column(name = "outline")
    private String outline;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    /**
     * 简介
     */
    public void setOutline(String outline) {
        this.outline = outline;
    }

    /**
     * 简介
     */
    public String getOutline() {
        return outline;
    }

    @Override
    public String toString() {
        return "Outline{" +
                "id=" + id + '\'' +
                "outline=" + outline + '\'' +
                '}';
    }


    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
