package lab7_p2_kevinbanegas;

public class Bandera {
    private String color;
    private String dirImagen;

    public Bandera(String color, String dirImagen) {
        this.color = color;
        this.dirImagen = dirImagen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDirImagen() {
        return dirImagen;
    }

    public void setDirImagen(String dirImagen) {
        this.dirImagen = dirImagen;
    }

    @Override
    public String toString() {
        return "Bandera{" + "color=" + color + ", dirImagen=" + dirImagen + '}';
    }
    
    
}
