package com.sofkau.crudPersona.servicios;

import com.sofkau.crudPersona.entidades.Persona;

import java.util.List;

public interface InterfazServicioPersona {

    public List<Persona> Listar();
    public Persona listarId(int id);
    public Persona guardar(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);

}
