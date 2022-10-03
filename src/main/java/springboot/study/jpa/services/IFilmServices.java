package springboot.study.jpa.services;

import springboot.study.jpa.domain.Film;
import springboot.study.jpa.domain.Outline;

import java.util.List;
import java.util.Optional;

/*
 * @author     chengYu
 * @date     2022/8/17
 * @describe
 */
public interface IFilmServices {
    public Film addFilm(Film film);

    public Outline addOutline(Outline outline,Integer filmId);

    public Film addFilm(Film film,Outline outline);

    public Film saveFilm(Film film);

    public Optional<Film> findFilm(Integer id);


    public void removeFilm(Integer filmId);

    public List<Film> findByClassify(String classify);


    public List<Film> findAll();

    public List<Outline> findAllOutline();
}
