

import java.util.ArrayList;
import java.util.List;

public class ProgrammaEventi {
    private String titolo;
    private List<Evento>eventi;

    //costruttore
    public ProgrammaEventi(String titolo){
        this.titolo=titolo;
        this.eventi=new ArrayList<>();
    }
    public void  aggiungiEvento(Evento evento){
        eventi.add(evento);
    }
 }
