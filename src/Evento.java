import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;
    private DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

    // costruttore con controlli

    public Evento(String titolo, LocalDate data, int postiTotali) {
        if(isTitoloValido(titolo)){
           this.titolo=titolo;
        }
    else{
        throw new RuntimeException("Scrivere titolo");
    }

    if(isDataValida(data)){
    this.data=data;}
    else {
        throw new RuntimeException("la data è gia passata,inserire la data giusta.");
    }

    if(ispostiTotaliValido(postiTotali)){
    this.postiTotali=postiTotali;}
    else {
        throw new RuntimeException("il numero " + postiTotali + "non è valida,deve essere maggiore di 0");
    }
    this.postiPrenotati=0;

    }

    // validatore degli eventi

    public boolean isTitoloValido (String titolo){
        return titolo !=null && !titolo.isBlank();

    }

    public boolean isDataValida(LocalDate data){
        LocalDate date= LocalDate.now();
        return true;
    }

    public boolean ispostiTotaliValido (int postiTotali){
        return postiTotali > 0;
    }
    

    // getter e setter
    public String getTitolo() {
      return titolo;
    }

    public void setTitolo(String titolo) {
           if(isTitoloValido(titolo)){
           this.titolo=titolo;
        }
    else{
        System.out.println("Non lasciare spazio vuoto");
    }
}

    public DateTimeFormatter getDateTimeFormatterData() {
        return dataFormattata;
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