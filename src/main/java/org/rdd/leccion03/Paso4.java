package org.rdd.leccion03;

public class Paso4 {
    public static void main(String[] args) {
        // Crear una TarjetaCredito con un límite de compra de $50,000
        TarjetaCredito cuentaTC   = new TarjetaCredito();
        cuentaTC.setNumeroProducto("0000004");
        cuentaTC.setClienteId("00000001");
        cuentaTC.setSaldo(0);
        cuentaTC.setLimiteCredito(50000);
        //  Realizar una compra de $15,000
        cuentaTC.pagarConTarjeta(15000);
        // Intentar una compra de $40,000
        cuentaTC.pagarConTarjeta(40000);
        // Realizar un pago a la tarjeta de $5,000
        cuentaTC.pagarTarjeta(5000);
        // Ejecutar consultarEstado() para comprobar el balance final de la deuda
        cuentaTC.consultaEstado();
    }
}