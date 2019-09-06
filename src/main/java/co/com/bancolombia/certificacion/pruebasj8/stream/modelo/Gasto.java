package co.com.bancolombia.certificacion.pruebasj8.stream.modelo;

public class Gasto {

    private String gasto;
    private double importe;

    public Gasto(String gasto, double importe) {
        this.gasto = gasto;
        this.importe = importe;
    }

    public String getGasto() {
        return gasto;
    }

    public void setGasto(String gasto) {
        this.gasto = gasto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
