package com.liuping.controller;

import com.liuping.common.ApiResult;
import com.liuping.user.service.UserService;
import com.liuping.util.JsonConfigUtil;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

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
        apiResult.setResult(JSONArray.fromObject(userService.findAll(),JsonConfigUtil.formatDate()));
        return apiResult;
    }
}
