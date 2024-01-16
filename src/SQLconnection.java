import java.sql.*;

public class SQLconnection {

    //
    //Class.forName("com.mysql.jdbc.Driver").newInstance();
    public static void testSQL(String dateSQL, double result, String date_d) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://sql11.freesqldatabase.com:3306/litersql", "sql11676696", "qq9MbkhYY7")) {
            PreparedStatement stat = (PreparedStatement) conn.createStatement();
            ResultSet rs = stat.executeQuery(String.format("INSERT INTO literDB (Date, Result, Date_d) VALUES (%s,%f,%s)", dateSQL, result, date_d));
            System.out.println("Данные сохранены.");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database!");
            e.printStackTrace();
        }
    }
    //PreparedStatement statement = con.prepareStatement("");
    //jdbc: mysql://localhost: 3306/mydatabase
    //jdbc:mysql://sql11.freesqldatabase.com:3306/sql11676696
}
