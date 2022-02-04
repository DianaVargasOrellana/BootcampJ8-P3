package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ListaPaises {
    public ListaPaises(){

    }

    public void ordenar(HashMap<String, Pais> lista1,HashMap<String, Pais> lista2 ){
        lista1.putAll(lista2);
        ArrayList<Pais> listaOrdenadaPaises = new ArrayList<>();
        HashMap<String, Pais> res = new HashMap<>();
        for (Pais p : lista1.values()){
            listaOrdenadaPaises.add(p);
        }
        listaOrdenadaPaises.sort((o1, o2)
                -> o1.getContinente().compareTo(
                o2.getContinente()));

        for (Pais p: listaOrdenadaPaises){
            System.out.println(p.getContinente() + "--" + p.getNombre() + "--" + p.getPoblacion());
        }




    }
}
