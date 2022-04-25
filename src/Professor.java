public class Professor extends Persona {
    private int sou;

    //contructor

    public Professor(String dni, String nom, int sou ){
       super(dni,nom);
        this.sou = sou;
    }

    public void canviarSou(int nouSou){
        this.sou = nouSou;
    }

}
