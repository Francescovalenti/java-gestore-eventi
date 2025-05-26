
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
            while (true) {
                System.out.println("Quanti biglietti vuoi prenotare?");
                int prenotazione = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sei sicuro della scelta?");
                String conferma = scanner.nextLine();

                if (conferma.equalsIgnoreCase("No")) {
                    System.out.println("Ritorna indietro");
                    
                } else if (conferma.equalsIgnoreCase("Si")) {
                    System.out.println("Complimenti, " + prenotazione + " posti prenotati con successo.");
                    break;
                }
                else {
                    System.out.println("Inserire Si o No,altre scelte non sono valide.");
                }
            }
            scanner.close();
        }
    }

}
