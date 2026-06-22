package org.rdd.leccion02;

public class Ejercicio1 {

    public static void main(String[] args){
        String[] listaNombres = {"Juan", "Raul", "Dora"};
        ImprimirElementos(listaNombres);

        String clave = "Raul";
        if (HitElemento(listaNombres, clave)){
            System.out.println("Encontrado " + clave);
        } else {
            System.out.println("No está " + clave);
        }
    }
    private static void ImprimirElementos(String[] lista) {
       // Sintaxis: (inicio; condición; incremento)
        for (int i = 0; i < lista.length; i++) {
            int j = i + 1;
            System.out.println("Nombre " + j + ": " + lista[i]);
        }
    }
    private static boolean HitElemento(String[] lista, String elemento) {
        Boolean salida = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(elemento)) salida = true;
        }
        return (salida);
    }
}
