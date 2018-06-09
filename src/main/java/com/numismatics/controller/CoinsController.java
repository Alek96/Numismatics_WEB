package com.numismatics.controller;

import com.numismatics.model.entity.Monety;
import com.numismatics.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CoinsController {

    @Autowired
    private CoinService coinService;

    public CoinsController() {
        super();
    }

    @ModelAttribute("allCoins")
    public List<Monety> populateCoins() {
        return this.coinService.findAll();
    }

    @RequestMapping("/monety")
    public String coins() {
        return "coins";
    }
}
