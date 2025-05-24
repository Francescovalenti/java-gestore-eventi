import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    // creazione dei dati dell'evento    
    Scanner scanner = new Scanner(System.in); 

    System.out.println("Benvenuto, inserisci i dati per l'evento che vuoi acquistare");
    String titolo = scanner.nextLine();
    

    System.out.println("Inserisci la data dell'evento");

    System.out.print("Anno (esempio 2025): ");
    int anno= scanner.nextInt();
    System.out.print("Inserisci mese (1-12): ");
    int mese= scanner.nextInt();
    System.out.print("Inserisci giorno (1-31): ");
    int giorno = scanner.nextInt();
    LocalDate data = LocalDate.of(anno, mese, giorno);
    
    System.out.println("Inserisci i posti totali del evento");
    int postiTotali=scanner.nextInt();

    // Costruzione del costruttore Evento
    Evento mioEvento = new Evento("Oasislive25",LocalDate.of(2025  , 9, 27), 10); 
    System.out.println("Complimenti hai creato l'evento");
    System.out.println(mioEvento.toString());
    scanner.nextLine();
    // sistema per prenotare
    
    System.out.println("Vuoi acquistare dei biglietti? (Si/No)");
    String prenotazioni= scanner.nextLine();
    if (prenotazioni.equalsIgnoreCase("Si")){    
        boolean inputValido = false;
        while (!inputValido){
        
        System.out.println("Quanti prenotazioni vuoi acquistare?");
      
        int prenotazione= scanner.nextInt();
        scanner.nextLine();
        if(prenotazione == 0){
            System.out.println("Non hai fatto nessuna prenotazione");
            inputValido=true;
        }
            else if(prenotazione < 0){
                System.out.println("Il numero delle prenotazioni non può essere negativo");
                
            }
            else if(prenotazione > (mioEvento.getpostiTotali() - mioEvento.getpostiPrenotati()))
           {
            System.out.println("Non ci sono posti disponibili per la sua richiesta");
           }
           else {
        
        for (int i=0;i < prenotazione; i++){
            mioEvento.prenota();
            break;
        }
        System.out.println("Complimenti, " + prenotazione + " posti prenotati con successo.");
        inputValido=true;
    }
}
    }
}
}


