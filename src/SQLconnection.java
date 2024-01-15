import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLconnection {

    //
    //Class.forName("com.mysql.jdbc.Driver").newInstance();
    public static void testSQL() {
        try (Connection con = DriverManager.getConnection("jdbc: mysql://localhost: 3306/litersql", "root", "password")) {
            System.out.println("Database connected!");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database!");
            e.printStackTrace();
        }
    }
    //PreparedStatement statement = con.prepareStatement("");
    //jdbc: mysql://localhost: 3306/mydatabase
    //jdbc:mysql://sql11.freesqldatabase.com:3306/sql11676696
}
