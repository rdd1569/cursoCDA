package org.rdd.leccion02;

public class Ejercicio1 {

    public static void main(String[] args){
        String[] listaNombres = {"Juan", "Raul", "Dora"};
        imprimirElementos(listaNombres);

        String clave = "Raul";
        if (hitElemento(listaNombres, clave)){
            System.out.println("Encontrado " + clave);
        } else {
            System.out.println("No está " + clave);
        }

        String sub = "u";
        imprimirElementos(hitSubstring(listaNombres,sub));
    }
    private static void imprimirElementos(String[] lista) {
       for (int i = 0; i < lista.length; i++) {
            int j = i + 1;
            if (lista[i] != null) {
                System.out.println("Nombre " + j + ": " + lista[i]);
            }
        }
    }
    private static boolean hitElemento(String[] lista, String elemento) {
        boolean salida = false;
        for (String s : lista) {
            if (s.equals(elemento)) {
                salida = true;
                break;
            }
        }
        return (salida);
    }
    private static String[] hitSubstring(String[] lista, String substring){
        int k = 0;
        String[] salida = new String[lista.length];
        for (String s : lista) {
            if (s.contains(substring)) {
                salida[k] = s;
                k++;
            }
        }
        return (salida);
    }
}
