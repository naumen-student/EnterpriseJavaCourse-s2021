package ru.urfu.rtfdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.urfu.rtfdemo.dao.FDao;

import java.util.Map;

@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView message(Map<String, Object> model){


        model.put("message", FDao.getMsg());

        return new ModelAndView("index", model);
    }
}
