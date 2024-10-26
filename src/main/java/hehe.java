import java.sql.Connection;
import java.sql.DriverManager;

public class hehe {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_internships";
        String user = "root";
        String password = "Aasth@1234";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
