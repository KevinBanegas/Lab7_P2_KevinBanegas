package lab7_p2_kevinbanegas;

public class Disparo extends Plantas{
    
    private String nomProj;
    private String color;

    public Disparo(String nomProj, String color, String nombre, int ataque, int vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.nomProj = nomProj;
        this.color = color;
    }

    public Disparo() {
        super();
    }
    
    public String getNomProj() {
        return nomProj;
    }

    public void setNomProj(String nomProj) {
        this.nomProj = nomProj;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Disparo{" + "nomProj=" + nomProj + ", color=" + color + '}';
    }
    
    
}
