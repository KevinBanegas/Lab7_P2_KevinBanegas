package lab7_p2_kevinbanegas;

import java.util.ArrayList;

public class Cargado extends Zombies{
    private int tamaño;
    private int edad;
    private int niveEnojo;
    private ArrayList<String> personas = new ArrayList();

    public Cargado(int tamaño, int edad, int niveEnojo, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.tamaño = tamaño;
        this.edad = edad;
        this.niveEnojo = niveEnojo;
    }

    public Cargado() {
        super();
    }
    
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNiveEnojo() {
        return niveEnojo;
    }

    public void setNiveEnojo(int niveEnojo) {
        this.niveEnojo = niveEnojo;
    }

    public ArrayList<String> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<String> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Cargado{" + "tama\u00f1o=" + tamaño + ", edad=" + edad + ", niveEnojo=" + niveEnojo + ", personas=" + personas + '}';
    }
}
