import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RowSetExample {

    public RowSetExample() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

            //Creating and Executing RowSet
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");


            rowSet.setCommand("select * from ogrenciler");

            rowSet.execute();

            // Adding Listener and moving RowSet
            rowSet.addRowSetListener(new MyListener());

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Id: " + rowSet.getInt(1));
                System.out.println("Isim: " + rowSet.getString(2));
                System.out.println("Adres: " + rowSet.getString(3));
                System.out.println("Not: " + rowSet.getInt(4));
            }

            rowSet.close();


    }
}
