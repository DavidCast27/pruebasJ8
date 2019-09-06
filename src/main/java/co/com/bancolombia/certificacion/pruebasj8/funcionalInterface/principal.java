package co.com.bancolombia.certificacion.pruebasj8.funcionalInterface;

public class principal {
    public static void main(String[] args) {

        Matematicas o = (x, y) -> x + y;

        System.out.println(o.operacion(2, 3));
    }
}
