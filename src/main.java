import ServerSide.DatabaseMenager;
import Shared.*;

public class main {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/to-list";
        String user = "root";
        String password = ""; // o "laPasswordCheHaImpostato"

        DatabaseMenager config = new DatabaseMenager("C:\\Users\\Antonella\\Documents\\MEGA\\Università\\2° Anno 2024-25\\Programmazione ad Oggetti\\Progetto To-do-LIst\\to-do-list\\src\\config.xml");

        System.out.println("Porta server: " + config.getPortaServer());
        System.out.println("Connessione DB: " + config.getDbUrl());
    }
}
