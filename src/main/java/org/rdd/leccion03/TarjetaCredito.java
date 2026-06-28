package org.rdd.leccion03;

public class TarjetaCredito extends Producto {
    private double limiteCredito;

    public void setLimiteCredito(double acuerdo) {
        if (acuerdo > 0) {
            limiteCredito = acuerdo;
        }
    }
}
