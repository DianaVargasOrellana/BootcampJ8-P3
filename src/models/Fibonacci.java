package models;

import java.util.ArrayList;
import java.util.LinkedList;

public class Fibonacci {
    public Fibonacci(){

    }

    public ArrayList<Integer> fibonacci (int n){
    ArrayList<Integer> respuesta = new ArrayList<>();
    int anterior = 0;
    int actual = 1;
    System.out.println(actual);
    respuesta.add(actual);
    int suma = 0;
    for(int i=1; i<n; i++){
        suma = anterior + actual;
        System.out.println(suma);
        respuesta.add(suma);
        anterior = actual;
        actual = suma;
    }
    return  respuesta;

    }

    public int top(ArrayList<Integer> lista){
        int res = 0;
        LinkedList<Integer> lista2 = transformar(lista);
        res = lista2.getFirst();
        return  res;

    }


    public int last(ArrayList<Integer> lista){
        int res = 0;
        LinkedList<Integer> lista2 = transformar(lista);
        res = lista2.getLast();
        return  res;

    }
    private LinkedList<Integer> transformar (ArrayList<Integer> lista){
        LinkedList<Integer> tranformar = new LinkedList<>();
        tranformar.addAll(lista);
        return  tranformar;
    }
}
