//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

        public class Takvim {

            public static void main(String[] args) {
                // Şu anki tarih ve saat
                LocalDateTime simdi = LocalDateTime.now();
                LocalDate tarih = simdi.toLocalDate();
                LocalTime saat = simdi.toLocalTime();

                // Gün, ay, yıl bilgileri
                int gun = tarih.getDayOfMonth();
                int ay = tarih.getMonthValue();
                String ayAdi = tarih.getMonth().getDisplayName(TextStyle.FULL, new Locale("tr", "TR"));
                int yil = tarih.getYear();

                // Hafta günü bilgisi
                String haftaGunu = tarih.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("tr", "TR"));
                // Saat bilgisi
                int saatBilgisi = saat.getHour();
                int dakika = saat.getMinute();
                int saniye = saat.getSecond();

                // Bilgileri ekrana yazdır
                System.out.println("📅 Tarih Bilgisi:");
                System.out.println("Gün        : " + gun);
                System.out.println("Ay         : " + ay + " (" + ayAdi + ")");
                System.out.println("Yıl        : " + yil);
                System.out.println("Hafta Günü : " + haftaGunu);

                System.out.println("\n⏰ Saat Bilgisi:");
                System.out.printf("Saat: %02d:%02d:%02d\n", saatBilgisi, dakika, saniye);
            }
        }


