package co.com.bancolombia.certificacion.pruebasj8.funcionalInterface;

/*
* https://www.arquitecturajava.com/java-functional-interface/
*
* Un interface funcional es aquel interface que solo dispone de un método abstracto.
* Recordemos que a día de hoy los interfaces han evolucionado mucho y pueden disponer
* de métodos por defecto. Así pues vamos a igualar nuestra expresión lambda a un interface funcional
* */
@FunctionalInterface
public interface Matematicas {
    public double operacion(double x, double y);

    //public void otro();
}
