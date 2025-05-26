
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Costruzione del costruttore Evento
        System.out.println("Inserisci il nome dell'evento");
        String Titolo = scanner.nextLine();

        System.out.println("Inserisci la data dell'evento (esempio dd/mm/yyyy)");
        String dataString = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataString, formatter);

        System.out.println("Inserisci il numero di capienza dove si svolgerà l'evento scelto da te");
        int postiTotali = scanner.nextInt();
        scanner.nextLine();

        Evento mioEvento = new Evento(Titolo, data, postiTotali);

        // sistema per prenotare
        System.out.println("Vuoi acquistare dei biglietti? (Si/No)");
        String prenotazioni = scanner.nextLine();

        if (prenotazioni.equalsIgnoreCase("Si")) {

            int prenotazione = 0;

            while (true) {
                int disponibilità = mioEvento.getpostiTotali() - mioEvento.getpostiPrenotati();
                System.out.println("I posti disponibili sono " + disponibilità);
                System.out.println("Quanti biglietti vuoi prenotare?");
                prenotazione = scanner.nextInt();
                scanner.nextLine();
                if (prenotazione > disponibilità) {
                    System.out.println("Non ci sono abbastanza posti disponibili.");
                    continue;
                }
                System.out.println("Sei sicuro della scelta?");
                String conferma = scanner.nextLine();

                if (conferma.equalsIgnoreCase("No")) {
                    System.out.println("Ritorna indietro");

                } else if (conferma.equalsIgnoreCase("Si")) {
                    for (int i = 0; i < prenotazione; i++) {
                        mioEvento.prenota();
                    }
                    int postiRimasti = mioEvento.getpostiTotali() - mioEvento.getpostiPrenotati();
                    System.out.println("Complimenti, " + prenotazione + " posti prenotati con successo. Sono rimasti "
                            + postiRimasti + " posti");
                    break;
                } else {
                    System.out.println("Inserire Si o No,altre scelte non sono valide.");
                }
            }

        }
        // sistema per le disdette
        System.out.println("Vuoi disdire la prenotazione?");
        String disdetta = scanner.nextLine();
        if (disdetta.equalsIgnoreCase("Si")) {
            while (true) {
                System.out.println("Quanti biglietti vuoi disdire?");
                int disdette = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sei sicuro della scelta?");
                String confermaDisdetta = scanner.nextLine();

                if (confermaDisdetta.equalsIgnoreCase("No")) {
                    System.out.println("Ritorna indietro");
                } else if (confermaDisdetta.equalsIgnoreCase("Si")) {
                    System.out.println("Hai disdetto" + disdette + " biglietti, ci dispiace, sono rimasti disponibili "
                            + mioEvento.getpostiTotali() + "posti");
                    break;
                } else {
                    System.out.println("Inserire Si o No,altre scelte non sono valide.");
                }

            }
            scanner.close();
        }
    }

}
