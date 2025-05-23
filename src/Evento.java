import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;
    
    
    

public Evento(String titolo, LocalDate data,int postiTotali,int postiPrenotati){
    
    if (data.isBefore(LocalDate.now())){
       throw new IllegalStateException("La data che è stata inserita non è valida, essendo una data gia passata.");
        
       
    }

    if(postiTotali<=0){
        throw new IllegalStateException("Riscrive il numero totale dello stadio,grazie. ");
    }
        
}
    
    this.titolo= titolo;
    this.data = data;
    this.postiTotali= postiTotali;
    this.postiPrenotati=0;

}