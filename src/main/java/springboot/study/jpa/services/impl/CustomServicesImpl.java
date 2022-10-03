package springboot.study.jpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.study.jpa.dao.CustomRepository;
import springboot.study.jpa.domain.Custom;
import springboot.study.jpa.services.ICustomServices;

import java.util.List;

/*
 * @author     chengYu
 * @date     2022/8/16
 * @describe
 */

@Service
public class CustomServicesImpl implements ICustomServices {
    @Autowired
    CustomRepository customRepository;

    @Override
    public Custom addCustom(Custom custom) {
        return customRepository.save(custom);
    }

    @Override
    public List<Custom> findAll() {
        return customRepository.findAll();
    }
}
