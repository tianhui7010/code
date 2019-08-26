package com.tian.hangmuRibbon.controller;

import com.tian.hangmuRibbon.healthcheck.MyHealthChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 52613 on 2019/8/24.
 */
@RestController
public class CheckController {

    @Autowired
    MyHealthChecker myHealthChecker;

    @RequestMapping("up")
    public String up(@RequestParam("up") Boolean up) {
        System.out.println("CheckController up");
        myHealthChecker.setUp(up);

        return up.toString();
    }

    }
