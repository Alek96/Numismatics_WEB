package com.numismatics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eoller on 16-May-18.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld(){
        return "HelloWorld";
    }


}
