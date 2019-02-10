package com.andy.controller;

import com.andy.domain.TourAdmin;
import com.andy.domain.common.PageVo;
import com.andy.service.AdminService;
import com.andy.service.TestService;
import com.andy.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private TestService testService;

    @RequestMapping("/findAll")
    @ResponseBody
    public PageVo findAll(TourAdmin tourAdmin){
        return adminService.findAll(tourAdmin);
    }

    @RequestMapping("/findAll2")
    @ResponseBody
    public PageVo findAll2(TourAdmin tourAdmin){
        return testService.findAll(tourAdmin);
    }
}
