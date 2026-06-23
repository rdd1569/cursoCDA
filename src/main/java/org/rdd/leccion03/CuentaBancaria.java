package org.rdd.leccion03;

public class CuentaBancaria  extends Producto {
    public void depositar(double monto){
        if (monto > 0) {
            saldo=saldo+monto;
        }
        else {
            System.out.println("Monto invalido " + monto);
        }
    }
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
        } else {
            if (monto > 0) System.out.println("Saldo insuficiente " + saldo);
            else System.out.println("Monto invalido " + monto);
        }
    }
}