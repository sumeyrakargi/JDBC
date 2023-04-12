import java.sql.*;

public class InsertPrepared {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        PreparedStatement stmt=con.prepareStatement("insert into ogrenciler values(?,?,?,?)");

        stmt.setInt(1,220);//1 specifies the first parameter in the query
        stmt.setString(2,"Ali Can");
        stmt.setString(3,"Ankara");
        stmt.setInt(4,75);

        int i=stmt.executeUpdate();

        System.out.println(i+" records inserted");

        con.close();








        con.close();
    }
}