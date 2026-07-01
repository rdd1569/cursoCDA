package org.rdd.leccion03;

public class Paso3 {
    public static void main(String[] args) {
        // Crear un PlazoFijo con un capital inicial de $10,000 a 30 días con una tasa del 45.0%.
        PlazoFijo cuentaPF   = new PlazoFijo();
        cuentaPF.setNumeroProducto("0000003");
        cuentaPF.setClienteId("00000001");
        cuentaPF.setSaldo(10000);
        cuentaPF.setPlazoDias(30);
        cuentaPF.setTasaInteres(45);
        //  Simular vencimiento
        cuentaPF.simularVencimiento();
    }
}