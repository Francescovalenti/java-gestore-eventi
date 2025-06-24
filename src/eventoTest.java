import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class eventoTest {
  public static void main(String[] args) throws Exception {
   
// LocalDate data = LocalDate.of(2025, 9, 27);
// LocalTime orario = LocalTime.of(21, 0);
// Concerto mioConcerto = new Concerto("Oasis", data, 100, 50.00f, orario);

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
    // Scanner scanner = new Scanner(System.in);
    //     DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //     DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    //     System.out.print("Titolo del programma eventi: ");
    //     String titoloProgramma = scanner.nextLine();
    //     ProgrammaEventi programma = new ProgrammaEventi(titoloProgramma);

    //     boolean continua = true;

    //     while (continua) {
    //         System.out.print("\nVuoi inserire un evento o un concerto? (evento/concerto): ");
    //         String tipo = scanner.nextLine().toLowerCase();

    //         try {
    //             System.out.print("Titolo: ");
    //             String titolo = scanner.nextLine();

    //             System.out.print("Data (formato dd/MM/yyyy): ");
    //             LocalDate data = LocalDate.parse(scanner.nextLine(), dateFormatter);

    //             System.out.print("Posti totali: ");
    //             int postiTotali = Integer.parseInt(scanner.nextLine());

    //             if (tipo.equals("evento")) {
    //                 Evento evento = new Evento(titolo, data, postiTotali);
    //                 programma.aggiungiEvento(evento);
    //                 System.out.println("✅ Evento aggiunto.");
    //             } else if (tipo.equals("concerto")) {
    //                 System.out.print("Orario (formato HH:mm): ");
    //                 LocalTime orario = LocalTime.parse(scanner.nextLine(), timeFormatter);

    //                 System.out.print("Prezzo: ");
    //                 float prezzo = Float.parseFloat(scanner.nextLine());

    //                 Concerto concerto = new Concerto(titolo, data, postiTotali, prezzo, orario);
    //                 programma.aggiungiEvento(concerto);
    //                 System.out.println("✅ Concerto aggiunto.");
    //             } else {
    //                 System.out.println("❌ Tipo non riconosciuto.");
    //             }

    //         } catch (Exception e) {
    //             System.out.println("❌ Errore: " + e.getMessage());
    //         }

    //         System.out.print("Vuoi aggiungere un altro evento? (si/no): ");
    //         String risposta = scanner.nextLine().toLowerCase();
    //         continua = risposta.equals("si") || risposta.equals("sì");
    //     }

    //     System.out.println("\n📅 Programma completo:");
    //     System.out.println(programma.eventoConData());

    //     scanner.close();
    // }
  }
}




  

