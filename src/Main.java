import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Costruzione del istanza Evento
        try {
            // Titolo
            System.out.println("Inserisci il nome dell'evento");
            String titolo = scanner.nextLine();
            if (titolo == null || titolo.trim().isEmpty()) {
                throw new IllegalArgumentException("Il titolo è obbligatorio.");
            }

            // Data
            System.out.println("Inserisci la data dell'evento (esempio dd/MM/yyyy)");
            String dataString = scanner.nextLine();
            LocalDate data;
            try {
                data = LocalDate.parse(dataString, formatter);
                if (data.isBefore(LocalDate.now())) {
                    throw new IllegalArgumentException("Errore: la data è nel passato.");
                }
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException("Errore: formato data non valido. Usa dd/MM/yyyy.");
            }

            // Capienza

            System.out.println("Inserisci il numero massimo di posti per l'evento");
            int postiTotali;
            try {
                postiTotali = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                throw new IllegalArgumentException("Errore: inserisci un numero intero valido.");
            }

            Evento mioEvento = new Evento(titolo, data, postiTotali);
            System.out.println("Evento creato: " + mioEvento + ", posti totali: " + postiTotali);

            // Sistema per prenotare
            System.out.println("Vuoi acquistare dei biglietti? (Si/No)");
            String rispostaPrenota = scanner.nextLine();

            if (rispostaPrenota.equalsIgnoreCase("Si")) {
                while (true) {
                    int disponibili = mioEvento.getPostiTotali() - mioEvento.getPostiPrenotati();
                    System.out.println("Posti disponibili: " + disponibili);
                    System.out.println("Quanti biglietti vuoi prenotare?");
                    int prenotazione = Integer.parseInt(scanner.nextLine());

                    if (prenotazione > disponibili) {
                        System.out.println("Non ci sono abbastanza posti disponibili.");
                        continue;
                    }

                    System.out.println("Confermi la prenotazione? (Si/No)");
                    String conferma = scanner.nextLine();

                    if (conferma.equalsIgnoreCase("Si")) {
                        for (int i = 0; i < prenotazione; i++) {
                            mioEvento.prenota();
                        }
                        int postiRimasti = mioEvento.getPostiTotali() - mioEvento.getPostiPrenotati();
                        System.out.println("Complimenti, hai acquistato " + prenotazione
                                + " biglietti con successo, per l' " + mioEvento.infoEvento()
                                + ". Sono rimasti " + postiRimasti + " posti");
                        break;
                    } else if (conferma.equalsIgnoreCase("No")) {
                        System.out.println("Prenotazione annullata.");
                        break;
                    } else {
                        System.out.println("Inserisci 'Si' o 'No'.");
                    }
                }
            } else if (rispostaPrenota.equalsIgnoreCase("No")) {
                System.out.println("Nessun biglietto acquistato.");
            } else {
                System.out.println("Risposta non valida.");
                return;
            }

            // sistema per le disdette
            if (mioEvento.getPostiPrenotati() > 0) {
                System.out.println("Vuoi disdire dei biglietti? (Si/No)");
                String rispostaDisdetta = scanner.nextLine();

                if (rispostaDisdetta.equalsIgnoreCase("Si")) {
                    while (true) {
                        System.out.println("Quanti biglietti vuoi disdire?");
                        int disdette = Integer.parseInt(scanner.nextLine());

                        if (disdette > mioEvento.getPostiPrenotati()) {
                            System.out.println("Errore: non puoi disdire più biglietti di quelli prenotati.");
                            continue;
                        }

                        System.out.println("Confermi la disdetta? (Si/No)");
                        String confermaDisdetta = scanner.nextLine();

                        if (confermaDisdetta.equalsIgnoreCase("Si")) {
                            for (int i = 0; i < disdette; i++) {
                                mioEvento.disdici();
                            }
                            int postiRimasti = mioEvento.getPostiTotali() - mioEvento.getPostiPrenotati();
                            System.out.println("Hai disdetto " + disdette + " biglietti. Ora ci sono " + postiRimasti
                                    + " posti disponibili.");
                            break;
                        } else if (confermaDisdetta.equalsIgnoreCase("No")) {
                            System.out.println("Disdetta annullata.");
                            break;
                        } else {
                            System.out.println("Inserisci 'Si' o 'No'.");
                        }
                    }
                } else {
                    System.out.println("Nessuna disdetta effettuata.");
                }
            }
            // else {
            // System.out.println("Non ci sono prenotazioni attive, quindi non puoi
            // disdire.");
            // }

        } catch (IllegalArgumentException e) {
            System.out.println("Errore di input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
