package lab7_p2_kevinbanegas;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministradorPlantas {

    File file = null;
    ArrayList<Plantas> plantas = new ArrayList();
    
    public AdministradorPlantas(String path) {
        file = new File(path);
    }
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<Plantas> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Plantas> plantas) {
        this.plantas = plantas;
    }

    @Override
    public String toString() {
        return "AdministradorPlantas{" + "file=" + file + ", plantas=" + plantas + '}';
    }

    public void cargarFile() {
        Scanner sc = null;
        plantas = new ArrayList();
        try {
            sc = new Scanner(file);
            String plantas = sc.toString();
            System.out.println(plantas);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
