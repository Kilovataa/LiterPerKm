import java.sql.*;

public class SQLconnect {

    //
    //Class.forName("com.mysql.jdbc.Driver").newInstance();
    public static void testSQL(double result, String date) {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://sql11.freesqldatabase.com:3306/sql11676696", "sql11676696", "qq9MbkhYY7")) {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Statement stat = conn.createStatement();
            int rs = stat.executeUpdate(String.format("INSERT INTO literDB VALUES (%f, '%s')",  result, date));
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
