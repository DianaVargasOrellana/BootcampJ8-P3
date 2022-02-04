import models.Fibonacci;
import models.ListaPaises;
import models.Pais;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        ArrayList<Integer> fibonacci = f.fibonacci(9);
        System.out.println("-------------------");
        System.out.println(f.top(fibonacci));
        System.out.println(f.last(fibonacci));
        System.out.println("-------------------");
        Pais p1 = new Pais("Francia", "Europa", 2500);
        Pais p2 = new Pais("Bolivia", "Sudamerica", 2500);
        Pais p3 = new Pais("España", "Europa", 2500);
        Pais p4 = new Pais("China", "Asia", 2500);
        Pais p5 = new Pais("Canada", "Norteamerica", 2500);
        Pais p6 = new Pais("Nigeria", "Africa", 2500);
        Pais p7 = new Pais("Costa Rica", "Centroamerica", 2500);

        HashMap<String, Pais>  lista1 = new HashMap<>();
        lista1.put("FRA", p1);
        lista1.put("BOl", p2);
        lista1.put("ESP", p3);
        HashMap<String, Pais>  lista2 = new HashMap<>();
        lista2.put("CHI", p4);
        lista2.put("CAN", p5);
        lista2.put("NIG", p6);
        lista2.put("COS", p7);
        ListaPaises listaPaises = new ListaPaises();
        listaPaises.ordenar(lista1,lista2);


    }
}
