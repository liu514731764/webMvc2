package com.liuping.controller;

import com.liuping.common.ApiResult;
import com.liuping.user.model.User;
import com.liuping.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by liuping on 15/12/8.
 */
@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView andView = new ModelAndView("index");
        return andView;
    }

    @RequestMapping("/json")
    @ResponseBody
    public ApiResult json() {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode("0");
        apiResult.setResult(userService.findAll());
        return apiResult;
    }
}
