package springboot.study.jpa.services.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import springboot.study.jpa.domain.Film;
import springboot.study.jpa.domain.Outline;
import springboot.study.jpa.services.IFilmServices;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author     chengYu
 * @date     2022/8/17
 * @describe
 */
@SpringBootTest
class FilmServicesImplTest {

    @Autowired
    IFilmServices  filmServices;

    @Test
    void addFilm() {
        Film  film = new Film();
        film.setName("film name test-add only");
        film.setClassify("枪战");
        film.setDirector("太空人");
        film.setHero("you know");
        film.setHeroine("-");
        film.setProduction(new Date(System.currentTimeMillis()));
        filmServices.addFilm(film);
    }

    @Test
    void addOutline() {
   //     Optional<Film> filmOptional = filmServices.findFilm(1);
        Outline outline = new Outline();
        outline.setOutline("to be continue");
        filmServices.addOutline(outline,1);

    }


    @Test
    void  addFullInfo(){
        Film  film = new Film();
        film.setName("film name test-3");
        film.setClassify("枪战");
        film.setDirector("太空人");
        film.setHero("you know");
        film.setHeroine("-");
        film.setProduction(new Date(System.currentTimeMillis()));

        Outline outline = new Outline();
        outline.setOutline(" to be continue..");

        filmServices.addFilm(film,outline);





    }

    @Test
    void saveFilm() {
        Film  film = new Film();
        film.setId(1);
        film.setName("倩女幽魂-3");
        film.setClassify("恐怖片");
        film.setDirector("徐克");
        film.setHero("张国荣");
        film.setHeroine("王祖贤");
        film.setProduction(new Date(System.currentTimeMillis()));
        filmServices.saveFilm(film);
    }

    @Test
    void removeFilm() {
        filmServices.removeFilm(1);
    }

    @Test
    void findByClassify() {
        List<Film> filmList = filmServices.findByClassify("科幻");
        Assert.isTrue(filmList.size()>0,"查询结果失败");
    }

    @Test
    void findAll() {
        filmServices.findAll();
    }

    @Test
    void findAllOutline() {
        filmServices.findAllOutline();
    }
}