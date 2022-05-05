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
        if (this.dni == null) { // si la pesona no te dni....
            // assignem el dni que estem passant
            this.dni = dni;
        } else { // si la persona SÍ té dni
            // no hem de deixar que canvii i ha de sortir una excepcio
            throw new Exception("No es pot canviar el dni");
        }
    }

    public void canviarNom(String nom) throws Exception {
        if (this.nom != null){
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
