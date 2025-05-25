import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;
    


    // costruttore con controlli

    public Evento(String titolo, LocalDate data, int postiTotali) {
        this.titolo = titolo;
        this.data = data;
        this.postiTotali = postiTotali;
        this.postiPrenotati = 0;

    }

    //validatore degli eventi


    public boolean isDatavalida(LocalDate data){
        LocalDate date= LocalDate.now();
        return true;
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
    public void prenota() throws Exception {
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("Impossibile prenotare: l'evento è già passato.");
        }
        if (postiPrenotati >= postiTotali) {
            throw new Exception("Posti esauriti.");
        }
        postiPrenotati++;
        return;
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
        return "Evento " + titolo + " con capienza di " + postiTotali + ", prenotati: " + postiPrenotati +
                ", che si svolgerà la data: " + dataFormattata;

    }
}