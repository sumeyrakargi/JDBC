import java.io.IOException;
import java.sql.*;

public class Rsmd {

    public static void main(String[] args) throws SQLException, IOException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        PreparedStatement stmt=con.prepareStatement("select * from ogrenciler");
        ResultSet rs = stmt.executeQuery();

			/*
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ogrenciler");
			*/

        ResultSetMetaData rsmd = rs.getMetaData();

        System.out.println("Toplam Kolon Sayisi: " + rsmd.getColumnCount());
        System.out.println("Ilk Kolonun Adi: " + rsmd.getColumnName(1));
        System.out.println("Ilk Kolonun Veri Tipi: " + rsmd.getColumnTypeName(1));

        con.close();








    }


}
