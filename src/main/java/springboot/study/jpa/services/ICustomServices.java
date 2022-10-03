package springboot.study.jpa.services;

import springboot.study.jpa.domain.Custom;

import java.util.List;

/*
 * @author     chengYu
 * @date     2022/8/16
 * @describe
 */
public interface ICustomServices {

    public Custom addCustom(Custom custom);

    public List<Custom> findAll();

}
