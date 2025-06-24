import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class eventoTest {
  public static void main(String[] args) throws Exception {
   
// LocalDate data = LocalDate.of(2025, 9, 27);
// LocalTime orario = LocalTime.of(21, 0);
// Concerto mioConcerto = new Concerto("Concerto Rock", data, 100, 50.00f, orario);

//      System.out.println(mioConcerto);

   
//         ProgrammaEventi programma = new ProgrammaEventi("Programma Estate 2025");

//         Evento evento1 = new Evento("Concerto ", LocalDate.of(2025, 7, 15), 100);
//         Evento evento2 = new Evento("Fiera Del Libro", LocalDate.of(2025, 8, 1), 50);

//         programma.aggiungiEvento(evento1);
//         programma.aggiungiEvento(evento2);

//         System.out.println(programma.eventoConData());
    


    

  // scelta tra evento e concerto
      
    //     Scanner scanner = new Scanner(System.in);
    //     DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //     DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    //     try {
    //         System.out.print("Vuoi creare un evento o un concerto? (evento/concerto): ");
    //         String scelta = scanner.nextLine().toLowerCase();

    //         System.out.print("Titolo: ");
    //         String titolo = scanner.nextLine();

    //         System.out.print("Data (formato dd/MM/yyyy): ");
    //         String dataString = scanner.nextLine();
    //         LocalDate data = LocalDate.parse(dataString, dateFormatter);

    //         System.out.print("Posti totali: ");
    //         int postiTotali = Integer.parseInt(scanner.nextLine());

    //         Evento eventoGenerico;

    //         if (scelta.equals("evento")) {
    //             eventoGenerico = new Evento(titolo, data, postiTotali);
    //         } else if (scelta.equals("concerto")) {
    //             System.out.print("Orario del concerto (formato HH:mm): ");
    //             LocalTime orario = LocalTime.parse(scanner.nextLine(), timeFormatter);

    //             System.out.print("Prezzo del biglietto: ");
    //             float prezzo = Float.parseFloat(scanner.nextLine());

    //             eventoGenerico = new Concerto(titolo, data, postiTotali, prezzo, orario);
    //         } else {
    //             System.out.println("❌ Scelta non valida.");
    //             return;
    //         }

    //         System.out.println("\n✅ Creato con successo: " + eventoGenerico);

    //         // Prenotazioni
    //         System.out.print("\nVuoi acquistare dei biglietti? (Si/No): ");
    //         String rispostaPrenota = scanner.nextLine();

    //         if (rispostaPrenota.equalsIgnoreCase("Si")) {
    //             System.out.print("Quanti biglietti vuoi prenotare? ");
    //             int numero = Integer.parseInt(scanner.nextLine());

    //             int disponibili = eventoGenerico.getPostiTotali() - eventoGenerico.getPostiPrenotati();

    //             if (numero > disponibili) {
    //                 System.out.println("❌ Non ci sono abbastanza posti. Disponibili: " + disponibili);
    //             } else {
    //                 for (int i = 0; i < numero; i++) {
    //                     eventoGenerico.prenota();
    //                 }
    //                 System.out.println("✅ Hai prenotato " + numero + " biglietti.");
    //                 System.out.println("Posti disponibili: " + (eventoGenerico.getPostiTotali() - eventoGenerico.getPostiPrenotati()));
    //             }
    //         }

    //         // Disdette
    //         System.out.print("\nVuoi disdire dei biglietti? (Si/No): ");
    //         String rispostaDisdici = scanner.nextLine();

    //         if (rispostaDisdici.equalsIgnoreCase("Si")) {
    //             System.out.print("Quanti biglietti vuoi disdire? ");
    //             int numero = Integer.parseInt(scanner.nextLine());

    //             int prenotati = eventoGenerico.getPostiPrenotati();

    //             if (numero > prenotati) {
    //                 System.out.println("❌ Non puoi disdire più biglietti di quanti ne hai prenotati. Prenotati: " + prenotati);
    //             } else {
    //                 for (int i = 0; i < numero; i++) {
    //                     eventoGenerico.disdici();
    //                 }
    //                 System.out.println("✅ Hai disdetto " + numero + " biglietti.");
    //                 System.out.println("Posti disponibili: " + (eventoGenerico.getPostiTotali() - eventoGenerico.getPostiPrenotati()));
    //             }
    //         }

    //     } catch (Exception e) {
    //         System.out.println("❌ Errore: " + e.getMessage());
    //     } finally {
    //         scanner.close();
    //     }
    // }
      // main con ProgrammaEventi
//      Scanner scanner = new Scanner(System.in);
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//         System.out.println("Benvenuto nel gestore di Programma Eventi!");
//         System.out.print("Inserisci il titolo del programma: ");
//         String titoloProgramma = scanner.nextLine();

//         ProgrammaEventi programma = new ProgrammaEventi(titoloProgramma);

//         boolean continua = true;
//         while (continua) {
//             System.out.println("\n--- MENU ---");
//             System.out.println("1. Aggiungi evento");
//             System.out.println("2. Mostra eventi in una data");
//             System.out.println("3. Numero totale eventi");
//             System.out.println("4. Mostra tutti gli eventi ordinati per data");
//             System.out.println("5. Svuota il programma eventi");
//             System.out.println("6. Esci");
//             System.out.print("Scelta: ");
//             String scelta = scanner.nextLine();

//             switch (scelta) {
//                 case "1":
//                     System.out.print("Titolo dell'evento: ");
//                     String titoloEvento = scanner.nextLine();

//                     System.out.print("Data evento (dd/MM/yyyy): ");
//                     String dataStr = scanner.nextLine();
//                     try {
//                         LocalDate data = LocalDate.parse(dataStr, formatter);

//                         System.out.print("Numero posti totali: ");
//                         int posti = Integer.parseInt(scanner.nextLine());

//                         Evento nuovoEvento = new Evento(titoloEvento, data, posti);
//                         programma.aggiungiEvento(nuovoEvento);
//                         System.out.println("Evento aggiunto con successo.");

//                     } catch (DateTimeParseException e) {
//                         System.out.println("Formato data non valido. Riprova.");
//                     } catch (NumberFormatException e) {
//                         System.out.println("Numero di posti non valido.");
//                     } catch (Exception e) {
//                         System.out.println("Errore: " + e.getMessage());
//                     }
//                     break;

//                 case "2":
//                     System.out.print("Inserisci una data (dd/MM/yyyy): ");
//                     try {
//                         String dataInput = scanner.nextLine();
//                         LocalDate dataRichiesta = LocalDate.parse(dataInput, formatter);
//                         List<Evento> eventiInData = programma.eventiInData(dataRichiesta);
//                         if (eventiInData.isEmpty()) {
//                             System.out.println("Nessun evento trovato in quella data.");
//                         } else {
//                             System.out.println("Eventi in data " + dataInput + ":");
//                             for (Evento e : eventiInData) {
//                                 System.out.println(e);
//                             }
//                         }
//                     } catch (DateTimeParseException e) {
//                         System.out.println("Data non valida.");
//                     }
//                     break;

//                 case "3":
//                     System.out.println("Numero di eventi nel programma: " + programma.numeroEventi());
//                     break;

//                 case "4":
//                     System.out.println("Eventi ordinati per data:");
//                     System.out.println(programma.eventoConData());
//                     break;

//                 case "5":
//                     programma.svuotaEventi();
//                     System.out.println("Programma eventi svuotato.");
//                     break;

//                 case "6":
//                     continua = false;
//                     System.out.println("Uscita dal programma.");
//                     break;

//                 default:
//                     System.out.println("Scelta non valida. Riprova.");
//                     break;
//             }
//         }

//         scanner.close();
//     }
// }

  }
}




  

