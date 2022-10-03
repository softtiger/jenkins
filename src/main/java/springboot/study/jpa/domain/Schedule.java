package springboot.study.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "schedule")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 电影院
     */
    @Column(name = "theater")
    private String theater;

    /**
     * 放映时间
     */
    @Column(name = "show_time", nullable = false)
    private Date showTime;

    /**
     * 余票数量
     */
    @Column(name = "quota", nullable = false)
    private Integer quota;

    /**
     * 价格
     */
    @Column(name = "price")
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="f_id",foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Film film;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    /**
     * 电影院
     */
    public void setTheater(String theater) {
        this.theater = theater;
    }

    /**
     * 电影院
     */
    public String getTheater() {
        return theater;
    }

    /**
     * 放映时间
     */
    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    /**
     * 放映时间
     */
    public Date getShowTime() {
        return showTime;
    }

    /**
     * 余票数量
     */
    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    /**
     * 余票数量
     */
    public Integer getQuota() {
        return quota;
    }

    /**
     * 价格
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 价格
     */
    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id + '\'' +
                "theater=" + theater + '\'' +
                "showTime=" + showTime + '\'' +
                "quota=" + quota + '\'' +
                "price=" + price + '\'' +
                '}';
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
