import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class RetrieveImage {

    public static void main(String[] args) throws SQLException, IOException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

            PreparedStatement ps=con.prepareStatement("select * from personel");

            ResultSet rs=ps.executeQuery();

            rs.next();//now on 1st row

            Blob b=rs.getBlob(4);

            byte barr[]=new byte[(int)b.length()]; // an array is created but contains no data
            barr=b.getBytes(1,(int)b.length());

            FileOutputStream fout=new FileOutputStream("src/test/java/110317613-aarn-giri-3tyzjgsbwbk-unsplash.webp");
            fout.write(barr);
            fout.close();

            System.out.println("OK :)");

            con.close();

    }
}
