
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Costruzione del costruttore Evento
        try {
            System.out.println("Inserisci il nome dell'evento");
            String Titolo = scanner.nextLine();
            if (Titolo == null || Titolo.trim().isEmpty()) {
                throw new IllegalArgumentException("Errore: il titolo è obbligatorio.");
            }

            System.out.println("Inserisci la data dell'evento (esempio dd/MM/yyyy)");
            String dataString = scanner.nextLine();
            LocalDate data;
            try {
                data = LocalDate.parse(dataString, formatter);
                if (data.isBefore(LocalDate.now())) {
                    throw new IllegalArgumentException("Errore: la data è nel passato. Deve essere oggi o futura.");
                }
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException("Errore: formato data non valido. Usa dd/MM/yyyy.");
            }

            System.out.println("Inserisci il numero di capienza dove si svolgerà l'evento scelto da te");
            int postiTotali;
            try {
                postiTotali = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                throw new IllegalArgumentException("Errore: devi inserire un numero intero per la capienza.");
            }

            Evento mioEvento = new Evento(Titolo, data, postiTotali);

            System.out.println("Il titolo dell'evento è: " + mioEvento.toString());

            // sistema per prenotare
            System.out.println("Vuoi acquistare dei biglietti? (Si/No)");
            String prenotazioni = scanner.nextLine();

            if (prenotazioni.equalsIgnoreCase("Si")) {
                int prenotazione = 0;

                while (true) {
                    int disponibilità = mioEvento.getPostiTotali() - mioEvento.getPostiPrenotati();
                    System.out.println("I posti disponibili sono " + disponibilità);
                    System.out.println("Quanti biglietti vuoi prenotare?");
                    prenotazione = Integer.parseInt(scanner.nextLine());

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
                        int postiRimasti = mioEvento.getPostiTotali() - mioEvento.getPostiPrenotati();
                        System.out
                                .println("Complimenti, " + prenotazione + " posti prenotati con successo. Sono rimasti "
                                        + postiRimasti + " posti");
                        break;
                    } else {
                        System.out.println("Inserire Si o No, altre scelte non sono valide.");
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

                    int prenotati = mioEvento.getPostiPrenotati();

                    if (disdette > prenotati) {
                        System.out.println("Errore: non puoi disdire più biglietti (" + disdette
                                + ") di quanti ne hai prenotati (" + prenotati + ").");
                        continue;
                    }

                    if (confermaDisdetta.equalsIgnoreCase("No")) {
                        System.out.println("Ritorna indietro");
                    } else if (confermaDisdetta.equalsIgnoreCase("Si")) {
                        for (int i = 0; i < disdette; i++) {
                            mioEvento.disdici();
                        }
                        int postiRimasti = mioEvento.getPostiTotali() - mioEvento.getPostiPrenotati();
                        System.out.println("Hai disdetto " + disdette + " biglietti. Ora ci sono " + postiRimasti
                                + " posti disponibili.");
                        break;
                    } else {
                        System.out.println("Inserire Si o No, altre scelte non sono valide.");
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Errore di input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
