package org.rdd.leccion03;

import org.rdd.leccion03.CuentaCorriente;

public class Paso2 {
    public static void main(String[] args) {
        // Crear una CuentaCorriente con saldo de $1,000 y un límite de sobregiro de $2,000.
        CuentaCorriente cuentaCC = new CuentaCorriente();
        cuentaCC.setNumeroProducto("000002/4");
        cuentaCC.setClienteId("00000001");
        cuentaCC.setSaldo(1000);
        cuentaCC.setLimiteSobregiro(2000);
        //  Realizar un retiro de 2500
        cuentaCC.retirar(2500);
        String ncta = cuentaCC.getNumeroProducto();
        double saldo = cuentaCC.getSaldo();
        System.out.println("Cta " + ncta + " Saldo " + saldo);
        // Intentar un retiro de $1,000 adicionales
        cuentaCC.retirar(1000);
        saldo = cuentaCC.getSaldo();
        System.out.println("Cta " + ncta + " Saldo " + saldo);
    }
}