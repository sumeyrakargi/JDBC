import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreFile {

    public static void main(String[] args) throws SQLException, IOException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        PreparedStatement ps=con.prepareStatement("insert into personel (id, isim, maas, fotograf, cv) values(?,?,?,?,?)");

        File f = new File("src/test/java/JDBC cv ornek.txt");
        FileReader fr = new FileReader(f);

        ps.setInt(1,1002);
        ps.setString(2,"Veli Mert");
        ps.setInt(3,85000);
        ps.setString(4,null);

        ps.setCharacterStream(5,fr,(int)f.length());

        int i=ps.executeUpdate();

        System.out.println(i+" records inserted");

        con.close();


}
}
