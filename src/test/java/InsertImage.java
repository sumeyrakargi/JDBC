
import java.io.FileInputStream;

import java.io.IOException;
import java.sql.*;

public class InsertImage {

    public static void main(String[] args) throws SQLException, IOException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

            PreparedStatement ps=con.prepareStatement("insert into personel values(?,?,?,?,?)");
        FileInputStream fin=new FileInputStream("src/test/java/110317613-aarn-giri-3tyzjgsbwbk-unsplash.webp");
            ps.setInt(1,1001);
            ps.setString(2,"Ali Can");
            ps.setInt(3,7000);

            ps.setBinaryStream(4,fin,fin.available());

            ps.setString(5,null);

            int i=ps.executeUpdate();

        System.out.println(i+" records inserted");




            con.close();

        }
    }

