package springboot.study.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import springboot.study.jpa.domain.Custom;

public interface CustomRepository extends JpaRepository<Custom, Integer>, JpaSpecificationExecutor<Custom> {

}