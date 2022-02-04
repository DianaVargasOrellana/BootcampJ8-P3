package models;

public class Pais {
    private String nombre;
    private String continente;
    private int poblacion;
    public  Pais (String nombre, String continente, int poblacion){
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}
