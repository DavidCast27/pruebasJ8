package co.com.bancolombia.certificacion.pruebasj8.optional.main;

import co.com.bancolombia.certificacion.pruebasj8.optional.modelo.Persona;
import co.com.bancolombia.certificacion.pruebasj8.optional.servicios.ServicioPersonas;



public class Run {

    public static void main(String[] args) {

        buscarPersona("pedro");
        buscarPersona("gema");


    }

    private static void buscarPersona(String persona){
        ServicioPersonas sp= new ServicioPersonas();
        Persona p=sp.buscar("gema");
        System.out.println(p.getNombre());
    }
}
