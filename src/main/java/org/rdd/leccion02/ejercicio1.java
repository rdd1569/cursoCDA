package org.rdd.leccion02;

import java.util.Arrays;

public class ejercicio1 {

    public static void main(String[] args){
        String[] listaNombres = {"Juan", "Raul", "Dora"};
        imprimirElementos(listaNombres);

        String clave = "Raul";
        if (hitElemento(listaNombres, clave)){
            System.out.println("Encontrado " + clave);
        } else {
            System.out.println("No está " + clave);
        }
    }
    private static void imprimirElementos(String[] lista) {
       // Sintaxis: (inicio; condición; incremento)
        for (int i = 0; i < lista.length; i++) {
            int j = i + 1;
            System.out.println("Nombre " + j + ": " + lista[i]);
        }
    }
    private static boolean hitElemento(String[] lista, String elemento) {
        Boolean salida = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(elemento)) salida = true;
        }
        return (salida);
    }
}
