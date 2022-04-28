public class Persona {

    private String nom;
    private String dni;


    //constructor por defecto
    public  Persona(){

    }

    //constructor con los atributos
    public Persona(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    public void setDni(String dni) throws Exception {
        // System.out.println(this.dni);

        if (this.dni != null) {
            // System.out.println("no puedes poner otro");
            throw new Exception("no puedes poner otro");
        } else {
            this.dni = dni;
        }
        throw new Exception();
    }

    public void canviarNom(String nom) throws Exception {
        if (this.nom ==null){
            throw new Exception("No tenim ni el DNI ni sabem el teu NOM");
        } else{
            this.nom = nom;
        }
        throw new Exception();
    }

    public String getObtenirDades() {
        return "Persona{" + "nom:" + this.nom + ", dni:" + this.dni + "}";
    }
}
