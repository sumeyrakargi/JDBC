
import java.sql.*;


public class MyConnection1 {

    public static void main(String[] args) throws SQLException {

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01","root","merve0934.");

        Statement stmt=con.createStatement();

        ResultSet rs=stmt.executeQuery("select *from ogrenciler");

        while(rs.next()) {

            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }

        stmt.close();
        rs.close();
        con.close();





















    }
}
