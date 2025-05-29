import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class eventoTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Evento Oasislive25 =new Evento("Oasis",LocalDate.of(2025, 9, 27), 2);
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
        // System.out.print( Oasislive25);
        // Concerto Oasis= new Concerto("Oasis", "27/08/2025", 10, 50.00," 21:00");
        Concerto OasisLive25 = new Concerto("OasisLive25",LocalDate.of(2025, 7, 25),100,50.0f,LocalDateTime.of(2025, 7, 25, 21, 0));

        System.out.println(OasisLive25);

        scanner.close();

    }
}
