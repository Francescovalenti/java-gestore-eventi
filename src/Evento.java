import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    // variabili d' istanza
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;
    private DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // costruttore con controlli

    public Evento(String titolo, LocalDate data, int postiTotali) {
        if (isTitoloValido(titolo)) {
            this.titolo = titolo;
        } else {
            throw new RuntimeException("Campo obbligatorio");
        }

        if (isDataValida(data)) {
            this.data = data;
        } else {
            throw new RuntimeException("La data inserita"+ data.format(dataFormattata) + "non è valida , inserire una data che parte da oggi in poi");
            }
        

        if (ispostiTotaliValido(postiTotali)) {
            this.postiTotali = postiTotali;
        } else {
            throw new RuntimeException("il numero " + postiTotali + "non corretto.Inserire almeno 1 quantità");
        }
        this.postiPrenotati = 0;

    }

    // validatore degli eventi

    public boolean isTitoloValido(String titolo) {
        return titolo != null && !titolo.isBlank();

    }

    public boolean isDataValida(LocalDate data) {
        LocalDate date = LocalDate.now();
        return true;
    }

    public boolean ispostiTotaliValido(int postiTotali) {
        return postiTotali > 0;
    }

    // getter e setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if (isTitoloValido(titolo)) {
            this.titolo = titolo;
        } else {
            System.out.println("Campo Obbligatorio");
        }
    }

    public DateTimeFormatter getDateTimeFormatterData() {
        return dataFormattata;
    }

    public void setData(LocalDate data) {
        if (isDataValida(data)) {
            this.data = data;
        } else {
            System.out.println("Data errata, inserire la data corretta");
        }
    }

    public int getpostiTotali() {
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
        return "Evento " + titolo + " con capienza di " + postiTotali + ", posti prenotati: " + postiPrenotati +
                ", che si svolgerà la data: " + dataFormattata;

    }
}