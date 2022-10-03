package springboot.study.jpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.study.jpa.dao.FilmRepository;
import springboot.study.jpa.dao.OutlineRepository;
import springboot.study.jpa.domain.Film;
import springboot.study.jpa.domain.Outline;
import springboot.study.jpa.services.IFilmServices;

import java.util.List;
import java.util.Optional;

/*
 * @author     chengYu
 * @date     2022/8/17
 * @describe
 */
@Service
public class FilmServicesImpl implements IFilmServices {

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    OutlineRepository outlineRepository;

    @Override
    public Film addFilm(Film film) {

        return filmRepository.save(film);
    }



    @Override
    public Outline addOutline(Outline outline,Integer filmId) {
         Optional<Film> filmOptional = filmRepository.findById(filmId);
         if (filmOptional.isPresent()){
                Film persistFilm = filmOptional.get();
                outline.setFilm(persistFilm);
                outlineRepository.save(outline);
         }
         return outline;
    }

    @Override
    @Transactional
    public Film addFilm(Film film, Outline outline) {


        outline.setFilm(film);

        outlineRepository.save(outline);

        return outline.getFilm();
    }

    @Override
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Optional<Film> findFilm(Integer id) {
        return  filmRepository.findById(id);
    }


    public void removeFilm(Integer filmId){
         filmRepository.deleteById(filmId);
    }

    @Override
    public List<Film> findByClassify(String classify) {
        return filmRepository.findByClassify(classify);
    }

    @Override
    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public List<Outline> findAllOutline(){
        return outlineRepository.findAll();
    }
}
