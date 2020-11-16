package com.example.Reddit.App.exceptions;

public class SubredditNotFoundException extends RuntimeException{
    public SubredditNotFoundException(String message)
    {
        super(message);
    }

}
