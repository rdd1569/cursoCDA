package org.rdd.leccion03;

public class TarjetaCredito extends Producto {
    private double limiteCredito;

    public void setLimiteCredito(double acuerdo) {
        if (acuerdo > 0) {
            limiteCredito = acuerdo;
        }
    }
    public void pagarConTarjeta(double monto) {
        double saldoFinal = limiteCredito - saldo - monto;
        if (monto > 0 &&  saldoFinal >= 0 ) {
            saldo = saldo + monto;
        } else {
            if (monto > 0) System.out.println("Excede limite " + saldoFinal);
            else System.out.println("Monto invalido " + monto);
        }
    }
    public void pagarTarjeta(double monto) {
        double saldoFinal = saldo - monto;
        if (monto > 0) {saldo = saldo - monto;
        } else {
            System.out.println("Monto invalido " + monto);
        }
    }
}
