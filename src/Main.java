//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        //ottieni l'anno
        //ottieni il mese
        //ottieni il giorno
        //ottieni il giorno della settimana
        //Stampa i risultati sulla console

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String dataString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(dataString);

        //ottieni l'anno
        int year = data.getYear();

        //ottieni il mese
        Month month = data.getMonth();

        //ottieni il giorno
        int day = data.getDayOfMonth();

        //ottieni il giorno della settimana
        DayOfWeek dayOfWeek = data.getDayOfWeek();

        //Stampa i risultati sulla console
        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }
}