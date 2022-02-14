package models;

import java.io.Serializable;

public class Pais implements Serializable {
    private String nombre;
    private String continente;
    private int poblacion;

    private double tasaNatalidad;
    private double tasaMortalidad;
    private double newTasaNatalidad;
    private double newTasaMortalidad;

    public  Pais (String nombre, String continente, int poblacion, double newTasaNatalidad, double newTasaMortalidad){
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
        this.newTasaMortalidad = newTasaMortalidad;
        this.newTasaNatalidad = newTasaNatalidad;
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
    public double getTasaNatalidad() {
        return tasaNatalidad;
    }

    public void setTasaNatalidad(double tasaNatalidad) {
        this.tasaNatalidad = tasaNatalidad;
    }

    public double getTasaMortalidad() {
        return tasaMortalidad;
    }

    public void setTasaMortalidad(double tasaMortalidad) {
        this.tasaMortalidad = tasaMortalidad;
    }

    public double getNewTasaNatalidad() {
        return newTasaNatalidad;
    }

    public void setNewTasaNatalidad(double newTasaNatalidad) {
        this.newTasaNatalidad = newTasaNatalidad;
    }

    public double getNewTasaMortalidad() {
        return newTasaMortalidad;
    }

    public void setNewTasaMortalidad(double newTasaMortalidad) {
        this.newTasaMortalidad = newTasaMortalidad;
    }

    public String toString(){
        String res = "";
        res = "Pais: " + getNombre() + " Contienente: " + getContinente() + " Tasa Natalidad: " + getNewTasaNatalidad() + " Tasa Mortalidad: " + getNewTasaMortalidad();
        return res;
    }
}
