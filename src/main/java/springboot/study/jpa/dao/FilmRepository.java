package springboot.study.jpa.dao;

import org.springframework.data.jpa.repository.*;
import springboot.study.jpa.domain.Film;

import javax.persistence.QueryHint;
import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer>, JpaSpecificationExecutor<Film> {

        @Query(" select f FROM Film  f LEFT JOIN Fetch f.outline WHERE f.classify like ?1%")
        List<Film> findByClassify(String classify);

        @EntityGraph(attributePaths ={ "outline"})
        List<Film> findAll();
}