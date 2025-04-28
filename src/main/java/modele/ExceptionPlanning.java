package modele;

public class ExceptionPlanning  extends Exception{
    private int chCodeErreur;

    public ExceptionPlanning(int chCodeErreur) {

        this.chCodeErreur = chCodeErreur;
    }

    public int getChCodeErreur() {
        return chCodeErreur;
    }
}
/**public class clientPlanning {
    public static void main(String[] args) {
        try{
            Planning.planning =....
            Reservation.reservation =........
            planning.ajout(reservation);
        }
    }
}*/
