import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class eventoTest {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    // Evento Oasislive25 = new Evento("Oasis", LocalDate.of(2025, 9, 27), 2);
    // System.out.println("Inserisci il nome dell'evento");
    // String titolo = scanner.nextLine();
    // System.out.println(Oasislive25);
    // Oasislive25.prenota();
    // System.out.println(Oasislive25.getPostiPrenotati());
    // Oasislive25.prenota();
    // System.err.println(Oasislive25.getPostiPrenotati());
    // Oasislive25.disdici();
    // System.out.println(Oasislive25.getPostiPrenotati());
    // Oasislive25.disdici();
    // Oasislive25.disdici();
    // Oasislive25.disdici();
    // System.out.println(Oasislive25.getPostiPrenotati());
    // System.out.print(Oasislive25);

     Concerto OasisLive251 = new Concerto("OasisLive25", LocalDate.of(2025, 7, 25), 100, 50.0f,
         LocalDateTime.of(2025, 7, 25, 21, 0));

    // System.out.println(OasisLive251);

    // Creazione programma
    ArrayList <Evento> eventi= new ArrayList<>();
    eventi.add(OasisLive251);

    // Aggiunta dell'evento
   
    
    System.out.println(eventi);
    scanner.close();

  }
}
