package com.sofkau.crudPersona.controlador;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.excopciones.PersonaNoEncontrada;
import com.sofkau.crudPersona.servicios.InterfazServicioPersona;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfazServicioPersona servicioPersona;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> listarPersonas(){
        return servicioPersona.Listar();
    }

    @PostMapping(value = "/guardarPersonas")
    public Persona guardarPersonas(@RequestBody Persona persona){
        return servicioPersona.guardar(persona);
    }

    @GetMapping(value = "/listarPersona/{id}")
    public Persona listarPersonaPorId(@PathVariable int id) throws PersonaNoEncontrada {
        return servicioPersona.listarId(id);
    }

    @PostMapping(value = "/borrarPersona/{id}")
    public void borrarPersona(@PathVariable int id){
        servicioPersona.borrar(id);
    }

    @PostMapping(value = "/actualizarPersona")
    public Persona actualizarPersonaPorId(@RequestBody Persona persona){
        return servicioPersona.actualizar(persona);
    }

    @ExceptionHandler(value = PersonaNoEncontrada.class)
    public String handlePersonaNoEncontrada(PersonaNoEncontrada personaNoEncontrada){
        return "Persona no encontrada rey, revisa la ID ingresada";
    }

}
