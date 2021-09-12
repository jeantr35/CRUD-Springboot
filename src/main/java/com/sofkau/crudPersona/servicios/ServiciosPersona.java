package com.sofkau.crudPersona.servicios;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.repositorio.InterfazRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciosPersona implements InterfazServicioPersona{

    @Autowired
    private InterfazRepositorioPersona data;

    @Override
    public List<Persona> Listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return data.findById(id).get();
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {
        data.deleteById(id);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}
