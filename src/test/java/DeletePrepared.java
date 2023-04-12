import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePrepared {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        PreparedStatement stmt = con.prepareStatement("delete from ogrenciler where id=? ");

        stmt.setInt(1, 120);
        int i=stmt.executeUpdate();
        System.out.println(i + "records deleted");
        con.close();













    }


}
