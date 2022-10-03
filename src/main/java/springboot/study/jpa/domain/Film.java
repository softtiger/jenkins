package springboot.study.jpa.domain;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "film")
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 影片名称
     */
    @Column(name = "name", nullable = false)
    private String name = "";

    /**
     * 分类
     */
    @Column(name = "classify", nullable = false)
    private String classify;

    /**
     * 导演
     */
    @Column(name = "director", nullable = false)
    private String director;

    /**
     * 男主教
     */
    @Column(name = "hero", nullable = false)
    private String hero;

    /**
     * 女主角
     */
    @Column(name = "heroine", nullable = false)
    private String heroine;

    /**
     * 制作时间
     */
    @Column(name = "production", nullable = false)
    private Date production;


    @OneToOne(mappedBy = "film",cascade = CascadeType.REMOVE)
    @BatchSize(size = 30)
    private Outline outline;

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    @OneToMany
    @JoinColumn(name="f_id")
    private List<Schedule> scheduleList =  new ArrayList<Schedule>();


    public Outline getOutline() {
        return outline;
    }

    public void setOutline(Outline outline) {
        this.outline = outline;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    /**
     * 影片名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 影片名称
     */
    public String getName() {
        return name;
    }

    /**
     * 分类
     */
    public void setClassify(String classify) {
        this.classify = classify;
    }

    /**
     * 分类
     */
    public String getClassify() {
        return classify;
    }

    /**
     * 导演
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * 导演
     */
    public String getDirector() {
        return director;
    }

    /**
     * 男主教
     */
    public void setHero(String hero) {
        this.hero = hero;
    }

    /**
     * 男主教
     */
    public String getHero() {
        return hero;
    }

    /**
     * 女主角
     */
    public void setHeroine(String heroine) {
        this.heroine = heroine;
    }

    /**
     * 女主角
     */
    public String getHeroine() {
        return heroine;
    }

    /**
     * 制作时间
     */
    public void setProduction(Date production) {
        this.production = production;
    }

    /**
     * 制作时间
     */
    public Date getProduction() {
        return production;
    }


    @Override
    public String toString() {
        return "Film{" +
                "id=" + id + '\'' +
                "name=" + name + '\'' +
                "classify=" + classify + '\'' +
                "director=" + director + '\'' +
                "hero=" + hero + '\'' +
                "heroine=" + heroine + '\'' +
                "production=" + production + '\'' +
                '}';
    }
}
