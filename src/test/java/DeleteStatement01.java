
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement01 {

    public static void main(String[] args) throws SQLException {

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01","root","merve0934.");

        Statement stmt=con.createStatement();

        //int result=stmt.executeUpdate("delete from ogrenciler where id=120");

       // int result=stmt.executeUpdate("delete from ogrenciler where id in (122,123)");

        //int result=stmt.executeUpdate("delete from ogrenciler where isim='Yavuz Bal'");

int result= stmt.executeUpdate("update ogrenciler set isim='Merve' where id=121");

        System.out.println(result+" records affected");

        con.close();







    }




}
