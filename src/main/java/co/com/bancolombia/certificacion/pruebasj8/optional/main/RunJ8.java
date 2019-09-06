package co.com.bancolombia.certificacion.pruebasj8.optional.main;

import co.com.bancolombia.certificacion.pruebasj8.optional.modelo.Persona;
import co.com.bancolombia.certificacion.pruebasj8.optional.servicios.ServicioPersonas;

import java.util.Optional;

/*
 * link donde pueden ver explicado este ejemplo https://www.arquitecturajava.com/usando-java-8-optional/
 * El uso de Java 8 Optional es muy práctico y refuerza los conceptos de programación funcional que tenemos en el lenguaje.
 * Objeto Optional:
 * Su uso esta centrado en eliminar muchos de los problemas que ocurren con el manejo de excepciones de tipo NullPointerException.
 * */

public class RunJ8 {

    public static void main(String[] args) {
        System.out.printf("buscar utilizando for each tradicionalmente");
        buscarPersona("pedro");
        buscarPersona("gema");

        System.out.println("buscar por medio de la funcion filter");
        buscarPersonaFilter("pedro");
        buscarPersonaFilter("gema");

    }

    private static void buscarPersona(String persona){

        ServicioPersonas sp= new ServicioPersonas();

        Optional<Persona> op=sp.buscarJ8(persona);

        if (op.isPresent()) {
            System.out.println(op.get().getNombre());
        }else {
            System.out.println("no hay registros");
        }
    }

    private static void buscarPersonaFilter(String persona){

        ServicioPersonas sp= new ServicioPersonas();

        Optional<Persona> op=sp.buscarJ8Filter(persona);

        if (op.isPresent()) {
            System.out.println(op.get().getNombre());
        }else {
            System.out.println("no hay registros");
        }
    }





}
