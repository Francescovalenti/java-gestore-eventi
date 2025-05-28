import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concerto extends Evento {
    private double Prezzo;
    private LocalTime dataOrarioEvento;

    public Concerto(String titolo, LocalDate data, int prezziTotali, float Prezzo, LocalTime orarioEvento) {
        super(titolo, data, prezziTotali);
        // this.Prezzo = Prezzo;
        // this.dataOrarioEvento = orarioEvento;
        setData(data);
        setOrarioEvento(orarioEvento);

    }

    public double getPrezzo() {
        return this.Prezzo;
    }

    public void setPrezzo(double Prezzo) {
        this.Prezzo = Prezzo;

    }

    public LocalTime getdataOrarioEvento() {
        return this.dataOrarioEvento;
    }

    public void setOrarioEvento(LocalTime dataorarioEvento) {
        if (dataorarioEvento == null)
        this.dataOrarioEvento = orarioEvento;
    }

  

    // Definisci il modello di formattazione
    public static String prezzoFormattato() {
          double prezzo = 12345.6789;
        DecimalFormat df = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(Locale.ITALY));
        // Formatta il prezzo
        String prezzoFormattato = df.format(prezzo);
        return prezzoFormattato;

    }

    public  String dataOrarioFormattato() {
         LocalDateTime dataOra = LocalDateTime.now();

        // Formattazione in formato "yyyy-MM-dd HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataOraFormattata = dataOra.format(formatter);
        return dataOraFormattata;
    }
       
    

    @Override
    public String toString() {
        return getdataOrarioEvento() + "-" + getTitolo() + "-" + getPrezzo();
    }
}
