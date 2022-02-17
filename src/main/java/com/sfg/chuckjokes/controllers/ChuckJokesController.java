package com.sfg.chuckjokes.controllers;

import com.sfg.chuckjokes.services.ChuckJokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckJokesController {

    ChuckJokesServiceImpl chuckJokesServiceImpl;

    public ChuckJokesController(ChuckJokesServiceImpl chuckJokesServiceImpl) {
        this.chuckJokesServiceImpl = chuckJokesServiceImpl;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {
        model.addAttribute("joke", chuckJokesServiceImpl.getChuckQuote());
        return "index";
    }
}
