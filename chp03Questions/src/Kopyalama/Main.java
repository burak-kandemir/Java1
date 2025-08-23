package Kopyalama;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {

        Path kaynak = Paths.get("kaynak.txt").toAbsolutePath();
        Path hedef  = Paths.get("hedef.txt").toAbsolutePath();

        System.out.println("Working dir : " + System.getProperty("user.dir"));
        System.out.println("Kaynak (abs): " + kaynak);
        System.out.println("Hedef  (abs): " + hedef);

        try {

            if (!Files.exists(kaynak)) {
                Files.write(kaynak,
                        ("Merhaba tatlım 💕\nBu dosya otomatik oluşturuldu.\n").getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                System.out.println("Not: 'kaynak.txt' otomatik oluşturuldu.");
            }

            Files.copy(kaynak, hedef, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("✅ Dosya başarıyla kopyalandı!");
        } catch (IOException e) {
            System.out.println("❌ Hata: " + e.getClass().getSimpleName() + " -> " + e.getMessage());
            e.printStackTrace();
        }
    }
}