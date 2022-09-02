package lab7_p2_kevinbanegas;

public class Clasico extends Zombies{
    private int añosExp;
    private Bandera bandera;

    public Clasico(int añosExp, Bandera bandera, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.añosExp = añosExp;
        this.bandera = bandera;
    }

    public Clasico() {
        super();
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public Bandera getBandera() {
        return bandera;
    }

    public void setBandera(Bandera bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return super.toString()+"Clasico{" + "a\u00f1osExp=" + añosExp + ", bandera=" + bandera + '}';
    }
}
