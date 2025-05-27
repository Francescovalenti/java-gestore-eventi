import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {
    private float Prezzo;
    private LocalTime orarioEvento;

    public Concerto (String titolo,LocalDate data,int prezziTotali,float Prezzo,LocalTime orarioEvento){ 
        super(titolo,data,prezziTotali);
        this.Prezzo=Prezzo;
        this.orarioEvento=orarioEvento;

}




    public float getPrezzo() {
        return this.Prezzo;
    }

    public void setPrezzo(float Prezzo) {
        this.Prezzo = Prezzo;
    }

    public LocalTime getOrarioEvento() {
        return this.orarioEvento;
    }

    public void setOrarioEvento(LocalTime orarioEvento) {
        this.orarioEvento = orarioEvento;
    }
}
