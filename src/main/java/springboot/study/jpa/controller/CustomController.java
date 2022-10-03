package springboot.study.jpa.controller;

import org.hibernate.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.study.jpa.dao.CustomRepository;
import springboot.study.jpa.domain.Custom;
import springboot.study.jpa.services.ICustomServices;

import java.util.List;

/*
 * @author     chengYu
 * @date     2022/8/15
 * @describe
 */
@RestController
@RequestMapping("/custom")
public class CustomController {
    private static final Logger logger = LoggerFactory.getLogger(CustomController.class);
    @Autowired
    ICustomServices customServices;

    @PostMapping("/add")
    public Custom addCustom(@RequestBody  Custom custom){
        return  customServices.addCustom(custom);
    }

    @GetMapping("/findAll")
    public List<Custom> findAll(){
        return  customServices.findAll();
    }


}
