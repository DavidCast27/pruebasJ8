package co.com.bancolombia.certificacion.pruebasj8.lamdaexpressions.main;

import co.com.bancolombia.certificacion.pruebasj8.lamdaexpressions.modelo.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Persona> milista= new ArrayList<Persona>();
        milista.add(new Persona("Miguel"));
        milista.add(new Persona("Alicia"));
        milista.add(new Persona("David"));
        milista.add(new Persona("Oscar"));
        milista.add(new Persona("Rafael"));

        Collections.sort(milista,new Comparator<Persona>() {
            public int compare(Persona p1,Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        for (Persona p: milista) {
            System.out.println(p.getNombre());
        }
    }
}
