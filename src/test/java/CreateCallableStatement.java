import java.lang.reflect.Type;
import java.sql.*;

public class CreateCallableStatement {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        CallableStatement stmt = con.prepareCall("{call sp_ogrenci_bilgi(?,?,?)}");

        stmt.setInt(1, 320);
        stmt.registerOutParameter(2, Types.VARCHAR);
        stmt.registerOutParameter(3, Types.INTEGER);

        stmt.execute();

        System.out.println(stmt.getString(2));

        System.out.println(stmt.getInt(3));

        con.close();
    }
}
