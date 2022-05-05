public class Estudiant extends Persona {

    private int nota;

    //constructor
    public Estudiant(String nom, String dni, int nota) {
        super(nom, dni);
        this.nota = nota;
    }

    public void setNota(int nota) throws Exception {
        if (nota < 0 || nota > 10) {
            throw new Exception("no se puede");
        } else {
            this.nota = nota;
        }
    }

        public String getObtenirDades() {
            return super.getObtenirDades() + "Estudiant{" + "nota:" + nota + "}";
        }
    }

