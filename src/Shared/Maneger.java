package Shared;
import java.time.LocalDate; 

public class Maneger implements Utente {
    private int id;
    private String username;

    // costruttore
    public Maneger(String username) {
        setId();
        setUsername(username);
    }
    

    // Metodi get
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    // metodi Set
    private void setId(){
        this.id=0;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    // metodo getRuolo
    public String getRuolo(){
        return "manger";
    }
    // Metodo assegna attivita

    public void assegnaAttivita(String titolo, String descrizione, LocalDate data_scadenza, User utente){
        Attivita newAttivita= new Attivita(titolo, descrizione,data_scadenza, this, utente);
        utente.aggiungiAttività(newAttivita);
        System.out.println("Attività assegnata a " + utente.getUsername());
    }
    public void visualizzaAttivita(){
        System.out.println("Da definire");
    }

    public String getInfo(){
        String info = null;
        info="Manager: "+getUsername()+"\n";
        return info;
    }
}
