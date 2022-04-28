public class Professor extends Persona {
    private int sou;

    //contructor

    public Professor(String nom, String dni, int sou ){
       super(nom,dni);
        this.sou = sou;
    }

    public void canviarSou(int nouSou)throws Exception {

        if (this.sou < 0 || this.sou > 3000) {
            throw new Exception("no puedes cobrar tanto, no eres un ministro");
        } else {
            this.sou = nouSou;
        }

    }
    public String getobtenirDades(){
        return super.getObtenirDades()+"Professor{" +  "sou: " + this.sou +"}";
    }

}
