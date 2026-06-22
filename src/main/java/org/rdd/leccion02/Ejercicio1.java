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

        String sub = "u";
        ImprimirElementos(HitSubstring(listaNombres,sub));
    }
    private static void ImprimirElementos(String[] lista) {
       // Sintaxis: (inicio; condición; incremento)
        for (int i = 0; i < lista.length; i++) {
            int j = i + 1;
            if (lista[i] != null) {
                System.out.println("Nombre " + j + ": " + lista[i]);
            }
        }
    }
    private static boolean HitElemento(String[] lista, String elemento) {
        Boolean salida = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(elemento)) salida = true;
        }
        return (salida);
    }
    private static String[] HitSubstring(String[] lista, String substring){
        int k = 0;
        String salida[]= new String[lista.length];
        for (int i = 0; i < lista.length; i++) {
             if (lista[i].contains(substring)) {salida[k] = lista[i]; k++;}
        }
        return (salida);
    }
}
