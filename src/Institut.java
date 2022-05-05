
public class Institut {
    //Atributs
    private String nom;

    public Institut(String nom) {
        this.nom = nom;
    }

    public void canviarNom(String nom){
            this.nom = nom;

    }

    public String imprimirinforacio() {
        return "Institut{" + "nom:" + this.nom + "}";
    }


}
