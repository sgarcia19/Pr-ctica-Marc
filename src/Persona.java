import groovy.console.ui.SystemOutputInterceptor;

public class Persona {

    private String dni;
    private String nom;

    //constructor
    public Persona (String dni,String nom){
        this.dni = dni;
        this.nom = nom;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public void canviarNom(String nom){
        this.nom=nom;
    }

    public void obtenirDades(){

    }

}
