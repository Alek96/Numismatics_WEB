package com.numismatics.controller;

import com.numismatics.model.entity.Monety;
import com.numismatics.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/moneta/{id}")
    public String coinDetails(@PathVariable("id") int id, Model model) {
        //model.clear(); ??
        model.addAttribute("coin", coinService.findById(id));
        return "coinDetails";
    }

    /*@RequestMapping(value = "/path/to/{iconId}", method = RequestMethod.GET)
    public void webletIconData(@PathVariable String iconId,
                               @RequestParam("size") String iconSize,
                               HttpServletResponse response) throws IOException { ... }*/
}
