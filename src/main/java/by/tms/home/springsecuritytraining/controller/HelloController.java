package by.tms.home.springsecuritytraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/hello")
public class HelloController {

    @GetMapping
    public ModelAndView getHelloPage(ModelAndView modelAndView) {
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
