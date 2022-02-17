package com.sfg.chuckjokes.controllers;

import com.sfg.chuckjokes.services.ChuckJokesService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckJokesController {

    ChuckJokesService chuckJokesService;

    public ChuckJokesController(ChuckJokesService chuckJokesService) {
        this.chuckJokesService = chuckJokesService;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {
        model.addAttribute("joke", chuckJokesService.getChuckQuote());
        return "index";
    }
}
