package com.numismatics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControler {

    @RequestMapping({"/","/index"})
    String index() {
        return "index";
    }
}
