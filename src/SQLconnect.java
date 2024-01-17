import java.sql.*;


public class SQLconnect {
    public static void testSQL(double result, String date) {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://sql11.freesqldatabase.com:3306/sql11676696", "sql11676696", "qq9MbkhYY7")) {
            PreparedStatement rs = conn.prepareStatement(("INSERT INTO literDB (Result, Date) VALUES (?, ?)"));
            rs.setDouble(1, result);
            rs.setDate(2, Date.valueOf(date));
            rs.executeUpdate();
            System.out.println("Данные сохранены.\n");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database!");
            e.printStackTrace();
        }
    }
}
