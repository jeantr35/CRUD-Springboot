package com.sofkau.crudPersona.servicios;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.excopciones.PersonaNoEncontrada;

import java.util.List;

public interface InterfazServicioPersona {

    public List<Persona> Listar();
    public Persona listarId(int id) throws PersonaNoEncontrada;
    public Persona guardar(Persona persona);
    public void borrar(int id) throws PersonaNoEncontrada;
    public Persona actualizar(Persona persona);

}
