import java.sql.*;

public class TransactionManagement {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "merve0934.");

        con.setAutoCommit(false);

        PreparedStatement stmt=con.prepareStatement("insert into ogrenciler values(?,?,?,?)");

        int id;
        String isim;
        String adres;
        int sinav_notu;
        int i;

        id=320;
        isim="Ali Can" ;
        adres="Ankara";
        sinav_notu=75;

        stmt.setInt(1,id);
        stmt.setString(2,isim);
        stmt.setString(3,adres);
        stmt.setInt(4,sinav_notu);
        i= stmt.executeUpdate();
        System.out.println(i+" records affected");

        id=321;
        isim="Veli Mert" ;
        adres="Trabzon";
        sinav_notu=85;

        stmt.setInt(1,id);
        stmt.setString(2,isim);
        stmt.setString(3,adres);
        stmt.setInt(4,sinav_notu);

        i= stmt.executeUpdate();

        System.out.println(i+" records affected");

        con.commit(); // commit komutuyla database işlemleri yapar. hata almazsa kalıcı olur
        //con.rollback(); //database de işlem yapıp geri alır.

        con.close();
    }
}
