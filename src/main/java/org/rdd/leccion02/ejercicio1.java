package org.rdd.leccion02;

public class ejercicio1 {

    public static void main(String[] args){
        String[] listaNombres = {"Juan", "Raul", "Dora"};
        imprimirElementos(listaNombres);
    }
    private static void imprimirElementos(String[] lista) {
       // Sintaxis: (inicio; condición; incremento)
        for (int i = 0; i < lista.length; i++) {
            int j = i + 1;
            System.out.println("Nombre " + j + ": " + lista[i]);
        }
    }
}
