import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrepared {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        PreparedStatement stmt = con.prepareStatement("update ogrenciler set isim=? where id=?");


        stmt.setString(1, "Merve");
        stmt.setInt(2, 220);


        int i = stmt.executeUpdate();

        System.out.println(i + " records updated");

        con.close();
    }
}