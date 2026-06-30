package org.rdd.leccion03;

public class Producto {
    protected String numeroProducto;

    public void setNumeroProducto(String numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public String getNumeroProducto() {
        return numeroProducto;
    }

    protected String clienteId;

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    protected double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
