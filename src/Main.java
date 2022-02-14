import models.Fibonacci;
import models.ListaPaises;
import models.Pais;
import models.Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Pais p1 = new Pais("Francia", "Europa", 2500, 2.5, 6.9);
        Pais p2 = new Pais("Bolivia", "Sudamerica", 2500, 2.8, 7.8);
        Pais p3 = new Pais("España", "Europa", 2500, 3.3, 9.9);
        Pais p4 = new Pais("China", "Asia", 2500, 1.1, 11.1);
        Pais p5 = new Pais("Canada", "Norteamerica", 2500, 2.8, 8.8);
        Pais p6 = new Pais("Nigeria", "Africa", 2500, 2.5, 7.6);
        Pais p7 = new Pais("Costa Rica", "Centroamerica", 2500, 2.8, 8.9);

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
        List<Pais> listaPaisesOrdenada =listaPaises.ordenar(lista1,lista2);

        Reader r = new Reader();
        //r.readFile("src/LecturaTasa.txt");
        r.setRateinCountry(p1,"src/LecturaTasa.txt");
        try{
            FileWriter fileWriter = new FileWriter("results.txt");
            for (Pais p: listaPaisesOrdenada){
                fileWriter.write(p.toString());
                fileWriter.write("\n");
            }
            fileWriter.write(listaPaises.getMaxCountryTN(listaPaisesOrdenada));
            fileWriter.write("\n");
            fileWriter.write(listaPaises.getMaxCountryTM(listaPaisesOrdenada));
            fileWriter.write("\n");
            fileWriter.write(listaPaises.getMinCountryTN(listaPaisesOrdenada));
            fileWriter.write("\n");
            fileWriter.write(listaPaises.getMinCountryTM(listaPaisesOrdenada));
            fileWriter.write("\n");
            fileWriter.close();
        } catch(FileNotFoundException f){
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
