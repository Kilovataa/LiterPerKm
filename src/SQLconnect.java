import java.sql.*;


public class SQLconnect {
    private static String url = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11676696";
    private static String user = "sql11676696";
    private static String password = "qq9MbkhYY7";

    public static void sendDataToDB(double result, String date) {

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
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

    public static void showLastCalculate() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement st = conn.createStatement();
            String sql = ("SELECT Result, Date FROM literDB ORDER BY id DESC LIMIT 1;");
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                double result = rs.getDouble("Result");
                String str1 = rs.getString("Date");
                System.out.println("Последние показания:\n" +
                        "Дата: " + str1 + ", Расход: " + result + "л/100км\n\n" + BodyProgramm.infoText);
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database!");
            e.printStackTrace();
        }
    }
    public static void showAverageCalculate() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement st = conn.createStatement();
            String sql = ("SELECT AVG(Result) FROM literDB;");
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                double result = Math.round(rs.getDouble(1) * 100.0) / 100.0;
                System.out.println("Средний расход топлива за всё время: " + result + "л/100км\n\n" + BodyProgramm.infoText);
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database!");
            e.printStackTrace();
        }
    }
}

