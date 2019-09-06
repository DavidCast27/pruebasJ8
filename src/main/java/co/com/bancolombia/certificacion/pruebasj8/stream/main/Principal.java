package co.com.bancolombia.certificacion.pruebasj8.stream.main;

import co.com.bancolombia.certificacion.pruebasj8.stream.modelo.Gasto;

import java.util.ArrayList;
import java.util.List;

/*
* ava 8 tiene un buen soporte para ello .Sin embargo muchas veces no tenemos muy claro como aplicarla.
* Vamos a construir un ejemplo sencillo. Supongamos que tenemos una lista de gastos de viaje diarios y
* la empresa se hará cargo de todos ellos. Eso sí , si una vez sumado a los gastos el IVA el importe supera los 100 euros
* la empresa no lo pagará ya que considerará que nos hemos excedido en lo que gastamos en un día.
*
* Las operaciones que tendremos que realizar resumiendo son:
* 1. Sumamos el IVA a cada uno de nuestros gastos
* 2. Filtramos aquellos gastos que se pasan del tope
* 3. Sumamos los que restan
* */

public class Principal {
    public static void main(String[] args) {

        List<Gasto> lista= new ArrayList<Gasto>();

        lista.add(new Gasto("A",80));
        lista.add(new Gasto("B",50));
        lista.add(new Gasto("C",70));
        lista.add(new Gasto("D",95));

        double totalPago=0;

        for (Gasto g:lista) {
            double importeMasIva = g.getImporte()*1.21;
            if (importeMasIva<100) {
                totalPago=totalPago+ importeMasIva;
            }
        }

        System.out.println(totalPago);

    }
}
