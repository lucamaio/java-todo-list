import java.sql.*;

public class TestDBConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ristoranti_db";
        String user = "root";
        String password = ""; // oppure "password" se l'ha impostata

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Connessione al database riuscita!");

            String query = "SELECT * FROM ristoranti"; // Cambiare con il nome della sua tabella
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("📄 Dati estratti:");

            while (rs.next()) {
                int id = rs.getInt("ID_ristorante"); // adattare ai nomi delle colonne reali
                String titolo = rs.getString("nome");
                System.out.println("ID: " + id + " - Nome: " + titolo);
            }

        } catch (SQLException e) {
            System.err.println("❌ Errore nella connessione al database:");
            e.printStackTrace();
        }
    }
}
