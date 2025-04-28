package modele;

public class ExceptionPlageHoraire extends Exception{

    private int chCodeErreur ;

    public ExceptionPlageHoraire(int parCodeError){
        this.chCodeErreur = parCodeError;

    }
    public int getChCodeErreur(){
        return chCodeErreur;
    }
}
