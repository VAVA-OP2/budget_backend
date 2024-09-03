import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // PostgreSQL-yhteysparametrit
        String url = "jdbc:postgresql://localhost:5432/tietokannan_nimi";
        String user = "kayttajan_nimi";
        String password = "salasana";

        // Yhteyden luominen
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Yhteys onnistui!");
        } catch (SQLException e) {
            System.err.println("Yhteyden luominen epäonnistui: " + e.getMessage());
        }
    }
}
