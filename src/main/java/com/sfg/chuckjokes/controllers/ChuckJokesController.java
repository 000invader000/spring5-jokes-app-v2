package com.sfg.chuckjokes.controllers;

import com.sfg.chuckjokes.services.ChuckJokesServiceImpl;
import com.sfg.chuckjokes.services.ChuckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckJokesController {

    private final ChuckService chuckService;

    public ChuckJokesController(ChuckService chuckService) {
        this.chuckService = chuckService;
    }

    @RequestMapping({"/", ""})
    public String getQuote(Model model) {
        model.addAttribute("joke", chuckService.getChuckQuote());
        return "index";
    }
}
