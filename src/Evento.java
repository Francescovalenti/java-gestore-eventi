import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;
    private boolean valido;
    
    

public Evento(String titolo, LocalDate data,int postiTotali,boolean valido){
    this.titolo= titolo;
    this.data = data;
    this.postiTotali= postiTotali;
    this.postiPrenotati=0;

    if (data.isBefore(LocalDate.now())){
        System.out.println("La data che è stata inserita non è valida, essendo una data gia passata.");
        valido=false;
       return; 
    }
        
}
}