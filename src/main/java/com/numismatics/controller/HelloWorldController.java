package com.numismatics.controller;

import com.numismatics.model.entity.Monety;
import com.numismatics.repository.MonetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Eoller on 16-May-18.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private MonetRepository monetRepository;

    @ResponseBody
//    @RequestMapping("/")
    public Monety helloWorld(){
        return monetRepository.getOne(1);
    }


}
