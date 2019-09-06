package co.com.bancolombia.certificacion.pruebasj8.stream.main;

import co.com.bancolombia.certificacion.pruebasj8.stream.modelo.Gasto;

import java.util.ArrayList;
import java.util.List;

/*
*link donde pueden ver explicado este ejemplo https://www.arquitecturajava.com/programacion-funcional-java-8-streams/
*/
public class PrincipalFuncional {
    public static void main(String[] args) {
        List<Gasto> lista = new ArrayList<Gasto>();
        lista.add(new Gasto("A", 80));
        lista.add(new Gasto("B", 50));
        lista.add(new Gasto("C", 70));
        lista.add(new Gasto("D", 95));
        double resultado = lista.stream()
                .mapToDouble(gasto -> gasto.getImporte() * 1.21)
                .filter(gasto -> gasto < 100)
                .sum();
        System.out.println(resultado);
    }
}