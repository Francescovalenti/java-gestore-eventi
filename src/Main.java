import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
      
       

        // Costruzione del costruttore Evento
        Evento mioEvento = new Evento("Oasislive25", LocalDate.of(2025, 9, 27), 80000);
        System.out.println("Evento creato:");
        System.out.println(mioEvento);
        Scanner scanner = new Scanner(System.in);

        // sistema per prenotare

        System.out.println("Vuoi acquistare dei biglietti? (Si/No)");
        String prenotazioni = scanner.nextLine();
        if (prenotazioni.equalsIgnoreCase("Si")) {
            boolean inputValido = false;
            while (!inputValido) {

                System.out.println("Quanti biglietti vuoi prenotare?");

                int prenotazione = scanner.nextInt();
                scanner.nextLine();
                if (prenotazione == 0) {
                    System.out.println("Non hai fatto nessuna prenotazione");
                    inputValido = true;
                } 

                 else if (prenotazione > (mioEvento.getpostiTotali() - mioEvento.getpostiPrenotati())) {
                    System.out.println("Non ci sono posti disponibili per la sua richiesta");
                } else {

                    for (int i = 0; i < prenotazione; i++) {
                        mioEvento.prenota();
                        
                    }
                    System.out.println("Complimenti, " + prenotazione + " posti prenotati con successo.");
                    inputValido = true;
                }
            }
        }
    }
}
