package ServerSide;

import Shared.Richiesta;
import Shared.Risposta;

public class GestoreRichiesta {

    public static Risposta process(Richiesta richiesta) {
        String tipo = richiesta.getTipo();

        switch (tipo) {
            case "PING":
                return new Risposta("OK", "PONG");

            case "LOGIN":
                // logica login
                return new Risposta("OK", "Accesso riuscito");

            case "AGGIUNGI_ATTIVITA":
                // logica creazione attività
                return new Risposta("OK", "Attività creata");

            default:
                return new Risposta("ERRORE", "Richiesta non riconosciuta");
        }
    }
}
