package co.com.bancolombia.certificacion.pruebasj8.optional.servicios;

import co.com.bancolombia.certificacion.pruebasj8.optional.modelo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServicioPersonas {

    static List<Persona> listaPersonas = new ArrayList<Persona>();
    static {

        listaPersonas.add(new Persona("pedro"));
        listaPersonas.add(new Persona("angel"));
        listaPersonas.add(new Persona("ana"));
    }


    public Persona buscar(String nombre) {

        for (Persona persona: listaPersonas) {

            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }

        return null;
    }

    public Optional<Persona> buscarJ8(String nombre) {
        for (Persona persona: listaPersonas) {
            if (persona.getNombre()==nombre) {
                return  Optional.of(persona);
            }
        }
        return Optional.empty();
    }

    public Optional<Persona> buscarJ8Filter(String nombre){
        return listaPersonas.stream().filter(persona -> persona.getNombre().equals(nombre)).findFirst();
    }
}
