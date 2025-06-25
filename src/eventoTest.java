import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
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

  //       Scanner scanner = new Scanner(System.in);
  //       ProgrammaEventi programma = new ProgrammaEventi("Programma Estate 2025");
  //       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  //       boolean isValid = true;

  //       System.out.println("Benvenuto nella gestione del Programma Eventi!");

  //       while (isValid) {
  //           System.out.println("\nScegli un'opzione:");
  //           System.out.println("1 - Aggiungi evento");
  //           System.out.println("2 - Mostra eventi ordinati per data");
  //           System.out.println("3 - Cerca eventi per data");
  //           System.out.println("4 - Numero eventi presenti");
  //           System.out.println("5 - Svuota tutti gli eventi");
  //           System.out.println("6 - Esci");

  //           int scelta;
  //           try {
  //               scelta = scanner.nextInt();
  //               scanner.nextLine(); // pulisce il buffer
  //           } catch (InputMismatchException e) {
  //               System.out.println("Errore: inserisci un numero valido.");
  //               scanner.nextLine();
  //               continue;
  //           }

  //           if (scelta == 1) {
  //               System.out.println("Inserisci il titolo dell'evento:");
  //               String titolo = scanner.nextLine();

  //               System.out.println("Inserisci la data dell'evento (formato dd/MM/yyyy):");
  //               String dataStr = scanner.nextLine();
  //               LocalDate data;
  //               try {
  //                   data = LocalDate.parse(dataStr, formatter);
  //               } catch (DateTimeParseException e) {
  //                   System.out.println("Data non valida. Riprova.");
  //                   continue;
  //               }

  //               System.out.println("Inserisci il numero di posti totali:");
  //               int postiTotali;
  //               try {
  //                   postiTotali = scanner.nextInt();
  //                   scanner.nextLine();
  //               } catch (InputMismatchException e) {
  //                   System.out.println("Numero non valido.");
  //                   scanner.nextLine();
  //                   continue;
  //               }

  //               try {
  //                   Evento evento = new Evento(titolo, data, postiTotali);
  //                   programma.aggiungiEvento(evento);
  //                   System.out.println("Evento aggiunto con successo!");
  //               } catch (IllegalArgumentException e) {
  //                   System.out.println("Errore: " + e.getMessage());
  //               }

  //           } else if (scelta == 2) {
  //               System.out.println("\nEventi ordinati per data:");
  //               System.out.println(programma.eventoConData());

  //           } else if (scelta == 3) {
  //               System.out.println("Inserisci la data da cercare (dd/MM/yyyy):");
  //               String dataStr = scanner.nextLine();
  //               try {
  //                   LocalDate data = LocalDate.parse(dataStr, formatter);
  //                   List<Evento> trovati = programma.eventiInData(data);
  //                   if (trovati.isEmpty()) {
  //                       System.out.println("Nessun evento trovato in questa data.");
  //                   } else {
  //                       System.out.println("Eventi trovati:");
  //                       for (Evento ev : trovati) {
  //                           System.out.println(ev);
  //                       }
  //                   }
  //               } catch (DateTimeParseException e) {
  //                   System.out.println("Formato data non valido.");
  //               }

  //           } else if (scelta == 4) {
  //               System.out.println("Numero totale di eventi: " + programma.numeroEventi());

  //           } else if (scelta == 5) {
  //               System.out.println("Sei sicuro di voler svuotare tutti gli eventi? (si/no)");
  //               String conferma = scanner.nextLine();
  //               if (conferma.equalsIgnoreCase("si")) {
  //                   programma.svuotaEventi();
  //                   System.out.println("Tutti gli eventi sono stati rimossi.");
  //               } else {
  //                   System.out.println("Operazione annullata.");
  //               }

  //           } else if (scelta == 6) {
  //               System.out.println("Uscita dal programma. Grazie!");
  //               continua = false;

  //           } else {
  //               System.out.println("Scelta non valida. Riprova.");
  //           }
  //       }

  //       scanner.close();
  //   }



  // }
}
}



  

