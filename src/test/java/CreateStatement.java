import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        Statement stmt = con.createStatement();

        int result = stmt.executeUpdate("insert into ogrenciler values(221,'Hakan','Istanbul',100)");

        System.out.println(result + " records affected");

        con.close();
    }
}
