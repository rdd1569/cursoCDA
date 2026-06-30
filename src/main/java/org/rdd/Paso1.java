package org.rdd;

import org.rdd.leccion03.CajaAhorro;

public class Paso1 {
    public static void main(String[] args) {
    //  Paso 1: Validación de Caja de Ahorro
    //  Crear una CajaAhorro con saldo inicial de $5,000.
        CajaAhorro cuentaAH = new CajaAhorro();
        cuentaAH.setNumeroProducto("000001/7");
        cuentaAH.setClienteId("00000001");
        cuentaAH.setSaldo(5000);
    //  Realizar un retiro exitoso de $1,000 (Saldo esperado: $4,000).
        cuentaAH.retirar(1000);
        String ncta = cuentaAH.getNumeroProducto();
        double saldo = cuentaAH.getSaldo();
        System.out.println("Cta " + ncta + " Saldo " + saldo);
    // Intentar un retiro inválido de $6,000
        cuentaAH.retirar(6000);
        saldo = cuentaAH.getSaldo();
        System.out.println("Cta " + ncta + " Saldo " + saldo);
    }
}