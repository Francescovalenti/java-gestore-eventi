import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concerto extends Evento {
    private float prezzo;
    private LocalTime OrarioConcerto;

    public Concerto(String titolo, LocalDate data, int postiTotali, float Prezzo, LocalTime OrarioConcerto) {
        super(titolo, data, postiTotali);

        setPrezzo(Prezzo);
        setOrarioConcerto(OrarioConcerto);

    }

   
    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float Prezzo) {
        if (Prezzo < 0) {
            throw new IllegalArgumentException("Il prezzo non puo essere 0 oppure inferiore a 0");
        } else {
            this.prezzo = Prezzo;
        }
    }

    public LocalTime getdataOrarioConcerto() {
        return this.OrarioConcerto;
    }

    public void setOrarioConcerto(LocalTime OrarioConcerto) {
        if (OrarioConcerto == null || OrarioConcerto.isBefore(LocalTime.now())) {
            throw new IllegalArgumentException("L'ora non può essere vuota o passata.");
        } else {
            this.OrarioConcerto = OrarioConcerto;
        }
    }

    // Definisce il modello di formattazione
    public  String getPrezzoFormattato() {
        
        DecimalFormat df = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(Locale.ITALY));
        // Formatta il prezzo
        String prezzoFormattato = df.format(this.prezzo);
        return prezzoFormattato;

    }

    private LocalTime parseaOra(String OrarioEvento) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm",Locale.getDefault());
    return LocalTime.parse(OrarioEvento, formatter);
}

    public String getOrarioFormattato() {

        // Formattazione in formato " HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm", Locale.getDefault());
       String oraEventoFormattato = OrarioConcerto.format(formatter);
        return oraEventoFormattato;
    }

    @Override
    public String toString() {
        return  getData().format(getDateTimeFormatter()) + " "  + getOrarioFormattato()  + " " + getTitolo().toUpperCase() + "  "  + getPrezzoFormattato();
    }
}



