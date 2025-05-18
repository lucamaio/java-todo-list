package Shared;
import java.time.LocalDate;         // Importo le classi che mi consentono di operare sulle date
import java.time.LocalDateTime;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class Attivita {

    private String titolo, descrizione;
    private int id;
    private LocalDate dataScadenza;
    private LocalDateTime dataCreazione;
    // private TipoAttivita tipo;

    private Maneger maneger;
    private User user;

    public Attivita(String titolo, String descrizione,LocalDate dataScadenza, Maneger maneger, User user) {
        setId();
        setDataCreazione(dataCreazione);
        setTitolo(titolo);
        setDescrizione(descrizione);   
        setDataScadenza(dataScadenza);
        setManeger(maneger);
        setUser(user);
    }

    public Attivita(int id, String titolo, String descrizione, LocalDate dataScadenza, Maneger maneger, User user) {
        setId(id);
        setDataCreazione();
        setTitolo(titolo);
        setDescrizione(descrizione);
        setDataScadenza(dataScadenza);
        setManeger(maneger);
        setUser(user);
    }

    // Metodi Get e set

    private String getTitolo() {
        return titolo;
    }

    private void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    private String getDescrizione() {
        return descrizione;
    }

    private void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    private int getId() {
        return id;
    }

    private void setId(){
        this.id=1;
    }

    private void setId(int id) {
        this.id = id;
    }


    private LocalDate getDataScadenza() {
        return dataScadenza;
    }

    private void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    private LocalDateTime getDataCreazione() {
        return dataCreazione;
    }

    private void setDataCreazione(LocalDateTime dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    private void setDataCreazione() {
        this.dataCreazione = LocalDateTime.now();
    }
    
    private void setManeger(Maneger maneger){
        this.maneger=maneger;
    }

    public Maneger getManeger(){
        return maneger;
    }

    private void setUser(User user){
        this.user=user;
    }

    public User getUser(){
        return user;
    }

    public String getInfo(){
        String info="Attività numero: "+this.getId()+" Data Creazione: "+this.getDataCreazione()+"\n";
        info+="Titolo: "+this.getTitolo()+"\n";
        info+="Descrizione: "+this.getDescrizione()+"\n";
        info+="Data Scadenza: "+this.getDataScadenza()+"\n";
        info+=maneger.getInfo();
        return info;
    }
}
