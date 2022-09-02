package lab7_p2_kevinbanegas;

public class Explosiva extends Plantas{
    private int magnitud;

    public Explosiva(int magnitud, String nombre, int ataque, int vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.magnitud = magnitud;
    }

    public Explosiva() {
        super();
    }

    public int getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(int magnitud) {
        this.magnitud = magnitud;
    }
    
    
    
}
