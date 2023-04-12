

import java.sql.*;

public class RetrievePrepared {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        PreparedStatement stmt = con.prepareStatement("select *from ogrenciler where id=? and isim=? and sinav_notu=?");

        stmt.setInt(1, 121);
        stmt.setString(2, "Veli Mert");
        stmt.setInt(3, 85);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(4));
        }

        con.close();
    }
}
