package org.rdd.leccion03;

public class PlazoFijo extends Producto {
    private int plazoDias;
    private double tasaInteres;

    public void setPlazoDias(int plazo) {
        if (plazo > 7) {
            plazoDias = plazo;
        } else {
            plazoDias = 30;
        }
    }

    public void setTasaInteres(double tasa) {
        if (tasa >= 0) {
            tasaInteres = tasa;
        }
    }

    public void simularVencimiento() {
        double Ganancia = saldo * (tasaInteres / 100) * (plazoDias / 365.0);
        System.out.println("Intereses al vto." + Ganancia);
    }
}
