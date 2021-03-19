package by.tms.home.springsecuritytraining.controller;

import by.tms.home.springsecuritytraining.entity.Operation;
import by.tms.home.springsecuritytraining.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/calc")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public ModelAndView getCalculatorPage(ModelAndView modelAndView) {
        modelAndView.setViewName("calculator");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView postCalculatorPage(Operation operation, ModelAndView modelAndView) {
        calculatorService.getResult(operation);
        modelAndView.setViewName("calculator");
        modelAndView.addObject("operation", operation);
        return modelAndView;
    }
}
