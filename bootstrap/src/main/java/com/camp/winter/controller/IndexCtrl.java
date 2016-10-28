package com.camp.winter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：
 * <p>
 * #
 * </p>
 * User: wenchang.wu Date: 16-10-28 ProjectName:camp Version:
 */
@Controller
@Slf4j
public class IndexCtrl {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}