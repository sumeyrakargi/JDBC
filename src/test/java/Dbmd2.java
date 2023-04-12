import java.sql.*;

public class Dbmd2 {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        DatabaseMetaData dbmd = con.getMetaData();

        String table[] = {"TABLE"};

        ResultSet rs = dbmd.getTables(null, null, null, table);

        while (rs.next()) {
            System.out.println(rs.getString(1)+" "+rs.getString(3)+" "+rs.getString(4));
        }
        con.close();


    }
}