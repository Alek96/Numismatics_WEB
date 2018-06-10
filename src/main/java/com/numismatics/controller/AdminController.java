package com.numismatics.controller;

import com.numismatics.model.entity.Monety;
import com.numismatics.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private CoinService coinService;

    //private Monety coin;

    public AdminController() {
        super();
    }

    @ModelAttribute("allCoins")
    public List<Monety> populateCoins() {
        return this.coinService.findAll();
    }

    /*@Bean
    @ModelAttribute("coin")
    public Monety coin() {
        return this.coin;
    }*/

    @RequestMapping("/admin")
    public String admin(final Monety coin) {
        return "admin";
    }

    @RequestMapping(value="/admin", params={"save"})
    public String saveCoin(final Monety coin/*, final BindingResult bindingResult, final ModelMap model*/) {
        /*if (bindingResult.hasErrors()) {
            return "nowaMoneta";
        }*/
        this.coinService.add(coin);
        //model.clear();
        return "redirect:/admin";
    }
}
