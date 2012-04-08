package com.ning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/5/12
 * Time: 10:55 AM
 */
@Controller
public class HelloWorldAction  {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView sayHello(Model model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        model.addAttribute("message","This is the first hello message.");
        return mv;
    }
}
