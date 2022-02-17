package com.sfg.chuckjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckJokesService {
    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getChuckQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }

}
