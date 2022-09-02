package lab7_p2_kevinbanegas;

public class Defensa extends Plantas{
    private int altura;
    private int nivDureza;
    private int peso;

    public Defensa(int altura, int nivDureza, int peso, String nombre, int ataque, int vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.altura = altura;
        this.nivDureza = nivDureza;
        this.peso = peso;
    }

    public Defensa() {
        super();
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNivDureza() {
        return nivDureza;
    }

    public void setNivDureza(int nivDureza) {
        this.nivDureza = nivDureza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"Defensa{" + "altura=" + altura + ", nivDureza=" + nivDureza + ", peso=" + peso + '}';
    }
    
    
}
