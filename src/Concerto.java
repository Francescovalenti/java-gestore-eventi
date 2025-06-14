import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concerto extends Evento {
    private float prezzo;
    private LocalDateTime dataOrarioEvento;

    public Concerto(String titolo, LocalDate data, int postiTotali, float Prezzo, LocalDateTime dataOrarioEvento) {
        super(titolo, data, postiTotali);

        setPrezzo(Prezzo);
        setdataOrarioEvento(dataOrarioEvento);

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

    public LocalDateTime getdataOrarioEvento() {
        return this.dataOrarioEvento;
    }

    public void setdataOrarioEvento(LocalDateTime dataOrarioEvento) {
        if (dataOrarioEvento == null || dataOrarioEvento.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("La Data e ora non può essere vuota o passati.");
        } else {
            this.dataOrarioEvento = dataOrarioEvento;
        }
    }

    // Definisci il modello di formattazione
    public  String getPrezzoFormattato() {
        
        DecimalFormat df = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(Locale.ITALY));
        // Formatta il prezzo
        String prezzoFormattato = df.format(this.prezzo);
        return prezzoFormattato;

    }

    private LocalDateTime parseDataOra(String dataOrarioEvento) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    return LocalDateTime.parse(dataOrarioEvento, formatter);
}

    public String getDataOrarioFormattato() {

        // Formattazione in formato "yyyy-MM-dd HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm");
       String dataOraEventoFormattato = dataOrarioEvento.format(formatter);
        return dataOraEventoFormattato;
    }

    @Override
    public String toString() {
        return super.toString() + getDataOrarioFormattato() + "" + getTitolo() + "" + getPrezzoFormattato();
    }
}



