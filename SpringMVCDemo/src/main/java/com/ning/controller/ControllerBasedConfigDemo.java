package com.ning.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/5/12
 * Time: 11:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class ControllerBasedConfigDemo extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("configDemo");
        mv.addObject("message", "Based on xml config works.");
        return mv;
    }
}
