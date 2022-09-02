package lab7_p2_kevinbanegas;

public class Zombies {
    private String nombre;
    private double ataque;
    private double vida;

    public Zombies(String nombre, int ataque, int vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public Zombies() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return super.toString()+"Zombies{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + '}';
    }
    
    
}
