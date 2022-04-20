package com.devsuperior.dslearnbds.services.exceptions;

public class UnauthorizedException extends RuntimeException{
    private static final long serialVersionUID = 1l;
    public UnauthorizedException(String msg){
        super(msg);
    }
}
