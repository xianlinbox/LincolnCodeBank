package com.ning.controller;

import com.ning.domain.User;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/5/12
 * Time: 1:39 PM
 */
@Controller
@RequestMapping(value = "/login")
public class RegistrationController {
    @RequestMapping(method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        User user = new User();
        model.addAttribute("User", user);
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@ModelAttribute(value = "User") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "login";
        } else {
            System.out.println("User is " + user);
            return "success";
        }
    }
}
