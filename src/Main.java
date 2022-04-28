public class Main {
    public static void main (String []args) throws Exception {

        Persona per = new Persona("xavi", "55555");
        Persona per2 = new Persona();

        System.out.println(per.getObtenirDades());
        System.out.println(per2.getObtenirDades());

        per.setDni("11111");
        per2.setDni("22222");
        per.canviarNom("Lidia");
        per2.canviarNom("null");

        //System.out.println (per.getDni("55555"));
        Estudiant est = new Estudiant("Christian", "66666666", 9);
        //est.setNota();
        System.out.println(est.getObtenirDades());

        Professor prof = new Professor("David", "888888888",3000);
        Professor prof1= new Professor("Xavi","858585",0);

        prof.canviarSou(3002);
        prof1.canviarSou(1500);

        System.out.println(prof.getobtenirDades());
        System.out.println(prof1.getobtenirDades());
    }
}
