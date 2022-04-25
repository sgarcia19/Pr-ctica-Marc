public class Estudiant extends Persona {

    private int nota;

    //constructor
    public Estudiant(String dni, String nom, int nota) {
        super(dni,nom);
        this.nota = nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void obtenirDades(){

    }
}
