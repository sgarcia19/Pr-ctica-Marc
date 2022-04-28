import java.sql.Array;
import java.util.ArrayList;

public class Estudiant extends Persona {

    private int nota;

    //constructor
    public Estudiant(String nom, String dni, int nota) {
        super(nom,dni);
        this.nota = nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getObtenirDades(){
        return super.getObtenirDades() +"Estudiant{" + "nota:" + nota + "}";
    }
}
