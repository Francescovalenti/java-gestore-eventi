import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

    // costante
    private final static DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // variabili d' istanza
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;
    

    // costruttore con controlli

    public Evento(String titolo, LocalDate data, int postiTotali) {
         setTitolo(titolo);
         setData(data);
         
         setPostiTotali(postiTotali);
         
        this.postiPrenotati=0;
    }
    

    //  validazione degli eventi

     private boolean isTitoloValido(String titolo) {
        return titolo != null &&  !titolo.isBlank();

     }

    private boolean isDataValida(LocalDate data) {
         return data.isAfter(LocalDate.now()) || data.isEqual(LocalDate.now());
    }

    private boolean isPostiTotaliValido(int postiTotali) {
        return postiTotali > 0;
    }

    // getter e setter
    public String getTitolo() {
        return titolo;
    }

     public void setTitolo(String titolo) {
        if (!isTitoloValido(titolo)) {
            throw new IllegalArgumentException("Campo obbligatorio: il titolo non può essere vuoto.");
        }
         this.titolo = titolo;
     }

    public LocalDate getData () {
        return data;
    }

    public DateTimeFormatter getDateTimeFormatter() {
        return dataFormattata;
    }

    public void setData(LocalDate data) {
        if (!isDataValida(data)) {
            throw new IllegalArgumentException(
                    "La data " + data.format(dataFormattata) + " non è valida. Deve essere oggi o una data futura.");
        }
        this.data = data;
    }

    public int getPostiTotali() {
        return postiTotali;
    }


   public int getPostiPrenotati() {
        return postiPrenotati;
    }

    private void setPostiTotali(int postiTotali) {

        if (isPostiTotaliValido(postiTotali)) {
            this.postiTotali = postiTotali;}
            else {
         throw new IllegalArgumentException("Il numero " + postiTotali + " non è valido. Inserire almeno 1.");
        }
    }

    public int getEventiDisponibili() {

        return getPostiTotali() - getPostiPrenotati(); //;
    }

    // inserimento metodo per prenotare
    public void prenota() throws Exception {
        prenota(1);
    }
    public void prenota(int nPrenotazioni) throws Exception {
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("Impossibile prenotare: l'evento è già passato.");
        }
        else if(postiPrenotati >= postiTotali) {
            throw new Exception("Posti esauriti.");
        }
        postiPrenotati+=nPrenotazioni;
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
            return;
            
        }

    }

    public String getInfoEvento() {

        return "Evento " + titolo + " posti prenotati: " + postiPrenotati + ", data: " + data.format(dataFormattata);

    }

    // metodo toString per main
    @Override
    public String toString() {
        return data.format(dataFormattata) + "-" + titolo.toUpperCase();
    }
}