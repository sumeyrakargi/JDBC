import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.*;

public class RetrieveFile {

    public static void main(String[] args) throws SQLException, IOException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

            PreparedStatement ps=con.prepareStatement("select * from personel where id = 1002");

            ResultSet rs=ps.executeQuery();

            rs.next(); // now on 1st row

            Clob c=rs.getClob(5);

            Reader r=c.getCharacterStream();

            // FileWriter fw=new FileWriter("c:\\retrivefile.txt");

            FileWriter fw=new FileWriter("src/test/java/JDBC cv ornek.txt");

            int i;
            while((i=r.read())!=-1)
                fw.write((char)i);

            fw.close();
            con.close();

            System.out.println("Success :)");


    }
}
