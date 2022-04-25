import java.util.Date;

public class ProfessorSubstitut extends Professor{
    public Date datainici;
    public Date dataFi;

    //constructor
    public ProfessorSubstitut(String dni, String nom, int sou, Date datainici, Date dataFi) {
        super(dni, nom, sou);
        this.datainici = datainici;
        this.dataFi = dataFi;
    }

    public void assignarSubsitucio(Date datainici, Date dataFi){
       this.datainici= datainici;
       this.dataFi= dataFi;
    }





}
