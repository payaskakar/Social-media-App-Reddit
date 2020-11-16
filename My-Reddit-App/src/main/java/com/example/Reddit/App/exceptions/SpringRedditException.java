package com.example.Reddit.App.exceptions;

public class SpringRedditException extends RuntimeException{
    SpringRedditException(String exMessage, Exception exception)
    {
        super(exMessage, exception);
    }
    public SpringRedditException(String exMessage){
        super(exMessage);
    }

}
