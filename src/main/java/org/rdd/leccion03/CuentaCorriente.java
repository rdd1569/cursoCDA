package org.rdd.leccion03;

public class CuentaCorriente extends CuentaBancaria{
    private double limiteSobregiro;
    public void retirar(double monto) {
        double saldoFinal = saldo - monto + limiteSobregiro;
        if (monto > 0 &&  saldoFinal >= 0 ) {
            saldo = saldo - monto;
        } else {
            if (monto > 0) System.out.println("Sobregirado " + saldoFinal);
            else System.out.println("Monto invalido " + monto);
        }
    }
}
