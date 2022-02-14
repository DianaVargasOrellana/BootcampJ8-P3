package models;

import java.util.*;

public class ListaPaises {

    public ListaPaises(){

    }

    public List<Pais> ordenar(HashMap<String, Pais> lista1, HashMap<String, Pais> lista2 ){
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


        return listaOrdenadaPaises;

    }

    public String getMaxCountryTN(List<Pais> list){
        String res = "";
        double max = 0;
        String pais = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNewTasaNatalidad() > max) {
                max = list.get(i).getNewTasaNatalidad();
                pais = list.get(i).getNombre();
            }
        }
        res = "El pais con mas tasa de natalidad es: " + pais;
        return  res;
    }

    public String getMaxCountryTM(List<Pais> list){
        String res = "";
        double max = 0;
        String pais = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNewTasaMortalidad() > max) {
                max = list.get(i).getNewTasaMortalidad();
                pais = list.get(i).getNombre();
            }
        }
        res = "El pais con mas tasa de mortalidad es: " + pais;
        return res;
    }

    public  String getMinCountryTN(List<Pais> list){
        String res = "";
        double min = 100;
        String pais = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNewTasaNatalidad() < min) {
                min = list.get(i).getNewTasaNatalidad();
                pais = list.get(i).getNombre();
            }
        }

        res = "El pais con menos tasa de natalidad es: " + pais;
        return res;
    }

    public String getMinCountryTM(List<Pais> list){
        String res = "";
        double min = 100;
        String pais = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNewTasaMortalidad() < min) {
                min = list.get(i).getNewTasaMortalidad();
                pais = list.get(i).getNombre();
            }
        }

        res = "El pais con menos tasa de mortalidad es: " + pais;
        return res;
    }
}
