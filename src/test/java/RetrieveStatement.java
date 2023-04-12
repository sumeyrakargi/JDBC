import java.sql.*;

public class RetrieveStatement {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        Statement stmt=con.createStatement();

        ResultSet rs=stmt.executeQuery("select *from ogrenciler");

        ResultSetMetaData rsmd =rs.getMetaData();

        System.out.println("toplam kolon sayısı: "+ rsmd.getColumnCount());
        System.out.println("ilk kolon adı: "+ rsmd.getColumnName(1));
        System.out.println("ilk kolon veri tipi: "+ rsmd.getColumnTypeName(1));


        con.close();

    }


}
