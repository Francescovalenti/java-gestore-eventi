
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProgrammaEventi {
    private String titolo;
    private List<Evento> eventi;

    // costruttore
    public ProgrammaEventi(String titolo) {
        this.titolo = titolo;
        this.eventi = new ArrayList<>();
    }

    // Metodo per aggiungere un evento alla lista
    public void aggiungiEvento(Evento evento) {
        eventi.add(evento);
    }

    // metodo che restituisce una lista con tutti gli eventi di quella data
    public List<Evento> eventiInData(LocalDate data) {
        List<Evento> eventiInData = new ArrayList<>();
        for (Evento musica : eventi) {
            if (musica.getData().equals(data)) {
                eventiInData.add(musica);
            }
        }
        return eventiInData;
    }

    // Metodo per restituire il numero di eventi
    public int numeroEventi() {
        return eventi.size();
    }

    // Metodo per svotare gli eventi
    public void svuotaEventi() {
        eventi.clear();
    }

    // Metodi getter e setter
    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public List<Evento> getEventi() {
        return this.eventi;
    }

    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    // Metodo di string per mostrare titolo e evento mostrati in ordine di data

    public String eventoConData() {
        return titolo + "\n" + eventi.stream().sorted(Comparator.comparing(Evento::getData)).map(Evento::toString)
                .collect(Collectors.joining("\n"));
    }
}
