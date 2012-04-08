package com.ning.controller;

import com.ning.domain.JsonResponse;
import com.ning.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/7/12
 * Time: 2:53 PM
 */
@Controller
public class UserListCotroller {
    private List<User> userList = new ArrayList<User>();

    @RequestMapping(value = "addUser.htm", method = RequestMethod.GET)
    public String showForm() {
        return "addUser";
    }


    @RequestMapping(value = "addUser.htm", method = RequestMethod.POST)
    public @ResponseBody
    JsonResponse addUser(@ModelAttribute("user") User user,BindingResult result){
        JsonResponse response = new JsonResponse();
        if(result.hasErrors()){
            response.setStatus("FAIL");
        }else{
            response.setStatus("SUCCESS");
            userList.add(user);
            response.setResult(userList);
        }
        return response;
    }

    @RequestMapping(value="/showUsers.htm")
    public String showUsers(ModelMap map){
        map.addAttribute("userList",userList);
        return "showUsers";
    }
}
