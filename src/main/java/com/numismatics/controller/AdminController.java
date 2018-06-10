package com.numismatics.controller;

import com.numismatics.model.entity.*;
import com.numismatics.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private CoinService coinService;
    @Autowired
    private OreService oreService;
    @Autowired
    private CertificateService certService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private RulerService rulerService;
    @Autowired
    private MintService mintService;

    //private Monety coin;

    public AdminController() {
        super();
    }

    @ModelAttribute("allCoins")
    public List<Monety> populateCoins() {
        return this.coinService.findAll();
    }
    @ModelAttribute("allOres")
    public List<Kruszce> populateOres() {
        return this.oreService.findAll();
    }
    @ModelAttribute("allCerts")
    public List<Certyfikaty> populateCerts() {
        return this.certService.findAll();
    }
    @ModelAttribute("allCountries")
    public List<Kraje> populateCountries() {
        return this.countryService.findAll();
    }
    @ModelAttribute("allRulers")
    public List<Panujacy> populateRulers() {
        return this.rulerService.findAll();
    }
    @ModelAttribute("allMint")
    public List<Mennice> populateMint() {
        return this.mintService.findAll();
    }


    @RequestMapping("/admin")
    public String adminSite(Model model) {
        model.addAttribute("coin", new Monety());
        return "admin";
    }

    @RequestMapping(value="/admin", params={"save"})
    public String addCoinFormSubmit(@ModelAttribute Monety coin) {
        this.coinService.add(coin);
        //model.clear();
        return "redirect:/admin";
    }


    /*@Bean
    @ModelAttribute("coin")
    public Monety coin() {
        return this.coin;
    }*/

    /*@RequestMapping("/admin")
    public String admin(Monety coin) {
        return "admin";
    }

    @RequestMapping(value="/admin", params={"save"})
    public String saveCoin(@ModelAttribute(value="coin") Monety coin/*, final BindingResult bindingResult, final ModelMap model*//*) {
        /*if (bindingResult.hasErrors()) {
            return "nowaMoneta";
        }*//*
        this.coinService.add(coin);
        //model.clear();
        return "redirect:/admin";
    }*/
}
