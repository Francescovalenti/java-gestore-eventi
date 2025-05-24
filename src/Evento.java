
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String titolo;
    private LocalDate data;
    private float postiTotali;
    private int postiPrenotati;

    // costruttore con controlli

    public Evento(String titolo, LocalDate data, float postiTotali) {

        if (data.isBefore(LocalDate.now())) {
            throw new IllegalStateException("La data che è stata inserita non è valida, essendo una data gia passata.");

        }

        if (postiTotali <= 0) {
            throw new IllegalStateException("Riscrive il numero totale dello stadio,grazie. ");
        }

        this.titolo = titolo;
        this.data = data;
        this.postiTotali = postiTotali;
        this.postiPrenotati = 0;

    }


    // getter e setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getpostiTotali() {
        return postiTotali;
    }

    public int getpostiPrenotati() {
        return postiPrenotati;
    }

    // inserimento metodo per prenotare
    public void prenota() {
        if (data.isBefore(LocalDate.now())) {
            System.out.println("Impossibile prenotare: evento gia passato");
        } else if (postiPrenotati >= postiTotali) {
            System.out.println("Posti esauriti");
        } else {
            postiPrenotati++;
            System.out.println("Complimenti,posti prenotati con successo.");

        }
    }

    // inserimento metodo per disdire
    public void disdici() {
        if (data.isBefore(LocalDate.now())) {
            System.out.println("Impossibile disdire: evento gia passato");
        } else if (postiPrenotati == 0) {
            System.out.println("Nessuna prenotazione da disdire.");
        } else {
            postiPrenotati--;
            System.out.println("Disdetta eseguita con successo.");

        }

    }
  // metodo toString per main
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormattata = data.format(formatter);
        return "Evento " + titolo + " con capienza di " + postiTotali + " che si svolgerà la data: " + dataFormattata
                + " dove hai acquistato " + postiPrenotati + " biglietti";

    }
}