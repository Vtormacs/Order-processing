package com.educaweb.projeto.Service.Exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resouce not found. Id " + id);
    }
}
