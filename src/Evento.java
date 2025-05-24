import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;
    
    
    // costruttore con controlli

public Evento(String titolo, LocalDate data,int postiTotali,int postiPrenotati){
    
    if (data.isBefore(LocalDate.now())){
       throw new IllegalStateException("La data che è stata inserita non è valida, essendo una data gia passata.");
        
       
    }

    if(postiTotali<=0){
        throw new IllegalStateException("Riscrive il numero totale dello stadio,grazie. ");
    }
        

    
    this.titolo= titolo;
    this.data = data;
    this.postiTotali= postiTotali;
    this.postiPrenotati=0;

}
// getter e setter 
public String getTitolo (){
    return titolo;
}

public void setTitolo(String titolo){
    this.titolo=titolo;
}

public LocalDate getData(){
    return data;
}

public void setData(LocalDate data){
    this.data=data;
}

public int getpostiTotali(){
    return postiTotali;
}

public int getpostiPrenotati(){
    return postiPrenotati;
}

public void prenota(){
    if (data.isBefore(LocalDate.now()))
}
}