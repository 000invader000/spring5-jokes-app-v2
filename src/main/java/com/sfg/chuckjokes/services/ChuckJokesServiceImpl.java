package com.sfg.chuckjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckJokesServiceImpl implements ChuckService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckJokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getChuckQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }

}
