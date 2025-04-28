package modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

public class ClientPlanningCollection implements ConstantesErreurs {

    public static void main  (String [] arg ){

        PlanningCollections origine = new PlanningCollections();

        try {
            origine.ajout(new Reservation("Musculation", new Date(24, 10, 2025),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("Python", new Date(17, 10, 2025),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("DANSE", new Date(26, 11, 2030),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("Java", new Date(19, 11, 2030),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("¨Maths", new Date(18, 11, 2030),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("Musculation", new Date(24, 10, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("Musculation", new Date(31, 10, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("Musculation", new Date(6, 11, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("Musculation", new Date(13, 11, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            origine.ajout(new Reservation("Musculation", new Date(20, 11, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));





        }
        catch (ExceptionPlanning exceptionPlanning) {
            System.out.println(ERREURS_PLANNING[exceptionPlanning.getCodeErreur()]);


        }
        System.out.println(origine.toString());
        System.out.println(origine.getReservations((new DateCalendrier (24,10,2025))));
        System.out.println(origine.getReservations("DANSE"));
    }


}
