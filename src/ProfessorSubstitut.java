import java.util.Date;

public class ProfessorSubstitut extends Professor{
    public Date datainici;
    public Date dataFi;

    //constructor
    public ProfessorSubstitut(String nom, String dni, int sou, Date datainici, Date dataFi) {
        super(nom, dni, sou);
        this.datainici = datainici;
        this.dataFi = dataFi;
    }

    public void assignarSubsitucio(Date datainici, Date dataFi){
       this.datainici= datainici;
       this.dataFi= dataFi;
    }

    public String getobtenirDades(){
        return super.getObtenirDades()+ "ProfessorSubstitut{" + ", datainici:" + datainici + ", datafi:" + dataFi + "}";
    }



}
