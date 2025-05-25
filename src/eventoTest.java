import java.time.LocalDate;

public class eventoTest {
 public static void main(String[] args) throws Exception{
    Evento Oasislive25 =new Evento("Oasislive25",LocalDate.of(2025, 9, 27), 80000);
    System.out.println(Oasislive25);
    Oasislive25.prenota();
    System.out.println(Oasislive25.getpostiPrenotati());
    Oasislive25.prenota();
    System.err.println(Oasislive25.getpostiPrenotati());
    Oasislive25.disdici();
    System.out.println(Oasislive25.getpostiPrenotati());
    Oasislive25.disdici();
    System.out.println(Oasislive25.getpostiPrenotati());
    System.out.print( Oasislive25);
 }
}
