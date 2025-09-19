import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Baglanti {
    private String kullanici_adi = "root";
    private String kullanici_sifre = "";
    private String db_ismi = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection con = null;

    public Baglanti() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useSSL=false&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı: " + e.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, kullanici_adi, kullanici_sifre);
            System.out.println("Bağlantı başarılı.");
        } catch (SQLException e) {
            System.out.println("Bağlantı başarısız: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Baglanti();
    }
}
