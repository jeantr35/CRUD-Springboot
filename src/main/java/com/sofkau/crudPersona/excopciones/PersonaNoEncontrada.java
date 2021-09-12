package com.sofkau.crudPersona.excopciones;

import org.apache.coyote.Response;

public class PersonaNoEncontrada extends RuntimeException{

    private String message;

    public PersonaNoEncontrada(String message){
        super(message);
        this.message = message;
    }

    public PersonaNoEncontrada(){
    }

}
