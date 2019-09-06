package co.com.bancolombia.certificacion.pruebasj8.lamdaexpressions.main;

import co.com.bancolombia.certificacion.pruebasj8.lamdaexpressions.modelo.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* https://www.arquitecturajava.com/java-8-lambda-expressions/
*
* El uso de Expresiones Lambda nos permitirá simplificar de forma muy clara algunos de los bloques de código
* que construíamos hasta ahora. Bloques que en muchos casos hacían uso de clases anónimas para solventar problemas
* que una expresión lambda expresa de una forma mucho mas directa.
* */

public class PrincipalFuncional {

    public static void main(String[] args) {
        List<Persona> milista= new ArrayList<Persona>();
        milista.add(new Persona("Miguel"));
        milista.add(new Persona("Alicia"));
        milista.add(new Persona("David"));
        milista.add(new Persona("Oscar"));
        milista.add(new Persona("Rafael"));

        Collections.sort(milista,
                (Persona p1,Persona p2)-> p1.getNombre().compareTo(p2.getNombre()));
        for (Persona p: milista) {
            System.out.println(p.getNombre());
        }
    }
}
