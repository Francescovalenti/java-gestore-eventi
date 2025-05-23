import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;
    
    

public Evento(String titolo, LocalDate data,int postiTotali,int postiPrenotati){
    this.postiPrenotati=0;
}
}