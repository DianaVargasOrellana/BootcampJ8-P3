package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {


    public void readFile(String path) {
        try{
            File readRate = new File(path);
            FileReader fileReader = new FileReader(readRate);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineofFile;
            while ((lineofFile= bufferedReader.readLine())!= null){
                System.out.println(lineofFile);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void setRateinCountry(Pais p, String path){
        String word = p.getNombre();
        String line = findWord(path, word);
        Pattern pat = Pattern.compile("\\d+(.\\d+)?");


        String[] listLine = line.split("[=, ]");
        Stream<String> listpercent = Arrays.stream(listLine).filter(n ->{
            Matcher mat = pat.matcher(n);
            return  mat.matches();

        } );
        List<String> listpercent2 = listpercent.collect(Collectors.toList());
        double tn = Double.valueOf( listpercent2.get(0));
        p.setTasaNatalidad(tn);
        double tm = Double.valueOf( listpercent2.get(1));
        p.setTasaMortalidad(tm);

    }

    private String findWord(String path, String palabra){
        String res = "";
        try {
                BufferedReader br=new BufferedReader(new FileReader(path));
                String linea="";
                boolean encontrado = false;
                while ((linea= br.readLine())!=null) {

                    if(linea.contains(palabra)) {
                      //  System.out.println(linea);
                        res += linea;
                        encontrado = true;
                        break;
                    }
                }

                if(!encontrado) System.out.println("El usuario no existe");

        } catch (IOException e) {

            System.out.println("Error");
        }
        return res;
    }
}