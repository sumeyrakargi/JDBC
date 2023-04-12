import java.sql.*;

public class BatchProcessing {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        con.setAutoCommit(false);

     Statement stmt = con.createStatement();

        stmt.addBatch("insert into ogrenciler values(420,'Ali Can','Ankara',75)");
        stmt.addBatch("insert into ogrenciler values(421,'Veli Mert','Trabzon',85)");

        int [] i=stmt.executeBatch();


        System.out.println(i[0]+" records inserted");
        System.out.println(i[1]+" records inserted");

        con.commit();
        //con.rollback();

        con.close();
    }
}
