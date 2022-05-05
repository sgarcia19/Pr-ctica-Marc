public class Main {
    public static void main(String[] args) throws Exception {
        try {
            //-----Institut-----//

            Institut inst = new Institut("La guineueta");
            inst.canviarNom("INS La Guineueta");
            System.out.println(inst.imprimirinforacio());

            //-----Persona-----//

            Persona per = new Persona("Xavi", "55555");
            Persona per2 = new Persona();

            //System.out.println(per.getObtenirDades());
            //System.out.println(per2.getObtenirDades());
            //-----DNI----//

            //per.setDni("11111");
            //per.canviarNom("Lidia");

            per2.setDni("22222");
            System.out.println("****");
            System.out.println(per2.getObtenirDades());

           // per2.setDni("333333"); error
            System.out.println("****");
            System.out.println(per2.getObtenirDades());

            //per2.canviarNom(null);


            //-----Estudiant-----//

            Estudiant est = new Estudiant("Christian", "66666666", 9);
            Estudiant est2= new Estudiant("Edinson", "4356782",2);
            est2.setNota(5);
            System.out.println(est.getObtenirDades());
            System.out.println(est2.getObtenirDades());
            //est2.setNota(-1); //error



            //-----Professor-----//


            Professor prof = new Professor("David", "888888888", 3000);
            Professor prof1 = new Professor("Xavi", "858585", 2222);

            //prof.canviarSou(3002); error
            prof1.canviarSou(1580);

            System.out.println(prof.getobtenirDades());
            System.out.println(prof1.getobtenirDades());

           // ProfessorSubstitut profsub= new ProfessorSubstitut("Eric","65892547",1500,2022-05-04,31-06-2022); continuar aquí!!!


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}