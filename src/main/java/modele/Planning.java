package modele;

import java.util.Arrays;


public class Planning {
    private Reservation [] tableauReservations;
    private final int TAILLE_TAB ;


    public void setTableauReservations(Reservation[] tableauReservations) {
        this.tableauReservations = tableauReservations;
    }



    public Reservation[] getTableauReservations() {
        return tableauReservations;
    }

    public int getTAILLE_TAB() {
        return TAILLE_TAB;
    }

    public Planning(int parTaille) {
        tableauReservations = new Reservation [parTaille];
        TAILLE_TAB = parTaille;
    }

    public boolean ajout(Reservation parReservation) {
        if (parReservation.estValide())
            return false;
        if (tableauReservations[TAILLE_TAB - 1] != null)
            return false;
        for (int i = 0; i < TAILLE_TAB; i++) {
            if (tableauReservations[i] == null) {
                tableauReservations[i] = parReservation;
                return true;
            }
            if (tableauReservations[i].compareTo(parReservation) == 0)
                return false;

            return true;
        }

        return false;
    }

    public String toString() {
        return Arrays.toString(tableauReservations);
    }

    public void ajout (Reservation parRes)throws ExceptionPlanning{
        if(tableauReservations[TAILLE_TAB -1] != null)
            throw new ExceptionPlanning();
        if (! parRes.estValide())
            throw new ExceptionPlanning();
        for (int i = 0; i < Reservation.length; i++) {
            if (tableauReservations[i]!=null && tableauReservations[i].compareTo(parRes)==0)
                throw new ExceptionPlanning();
            if(tableauReservations[i]==null){
                tableauReservations[i] = parRes;
                break;
            }
        }

    }


}
