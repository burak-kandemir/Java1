import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class KelimeZinciri {

    public static boolean kelimeTDKdaVarMi(String kelime) {
        try {
            String encodedKelime = URLEncoder.encode(kelime, StandardCharsets.UTF_8.toString());
            String apiUrl = "https://sozluk.gov.tr/gts?ara=" + encodedKelime;
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                return response.toString().trim().startsWith("[");
            }
        } catch (IOException e) {
            System.err.println("API isteği sırasında bir hata oluştu: " + e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oynayacak kişi sayısını girin: ");
        int oyuncuSayisi = scanner.nextInt();
        scanner.nextLine();

        List<String> oyuncular = new ArrayList<>();
        for (int i = 0; i < oyuncuSayisi; i++) {
            System.out.print((i + 1) + ". oyuncunun adını girin: ");
            oyuncular.add(scanner.nextLine());
        }
        System.out.print("Her tur için süre limitini saniye cinsinden girin: ");
        long sureLimiti = scanner.nextLong() * 1000;
        scanner.nextLine();

        Set<String> kullanilmisKelimeler = new HashSet<>();
        String sonKelime = "elma";
        int gecerliOyuncuIndex = 0;

        System.out.println("\nKelime Zinciri Oyununa Başlıyoruz!");
        System.out.println("İlk kelime: " + sonKelime);
        System.out.println("-------------------------------------");

        while (oyuncular.size() > 1) {
            String gecerliOyuncu = oyuncular.get(gecerliOyuncuIndex);
            char sonHarf = sonKelime.charAt(sonKelime.length() - 1);

            System.out.printf("\nSıra %s'de! Kelime '%s' harfiyle başlamalı.\n", gecerliOyuncu, sonHarf);
            System.out.printf("Kelime girmek için %d saniyen var.\n", sureLimiti / 1000);

            long baslangicZamani = System.currentTimeMillis();
            String yeniKelime = null;

            while (System.currentTimeMillis() - baslangicZamani < sureLimiti) {
                System.out.print("Yeni kelime: ");
                if (scanner.hasNextLine()) {
                    yeniKelime = scanner.nextLine().toLowerCase();
                    if (!yeniKelime.isEmpty()) {
                        break;
                    }
                }
            }
            if (yeniKelime == null || yeniKelime.isEmpty() || System.currentTimeMillis() - baslangicZamani >= sureLimiti) {
                System.out.printf("Süre doldu, %s elendi!\n", gecerliOyuncu);
                oyuncular.remove(gecerliOyuncuIndex);
                if (oyuncular.size() > 1) {
                    gecerliOyuncuIndex %= oyuncular.size();
                }
                continue;
            }
            if (yeniKelime.charAt(0) != sonHarf) {
                System.out.printf("Kelimeniz '%s' ile başlamalıydı, %s elendi!\n", sonHarf, gecerliOyuncu);
                oyuncular.remove(gecerliOyuncuIndex);
            } else if (kullanilmisKelimeler.contains(yeniKelime)) {
                System.out.printf("Bu kelime zaten kullanıldı, %s elendi!\n", gecerliOyuncu);
                oyuncular.remove(gecerliOyuncuIndex);
            } else if (!kelimeTDKdaVarMi(yeniKelime)) {
                System.out.printf("Girdiğiniz kelime TDK sözlüğünde bulunmuyor, %s elendi!\n", gecerliOyuncu);
                oyuncular.remove(gecerliOyuncuIndex);
            } else {

                System.out.println("Doğru!");
                sonKelime = yeniKelime;
                kullanilmisKelimeler.add(yeniKelime);
                gecerliOyuncuIndex = (gecerliOyuncuIndex + 1) % oyuncular.size();
            }
        }
        if (oyuncular.size() == 1) {
            System.out.println("\nOyun bitti! Kazanan: " + oyuncular.get(0));
        } else {
            System.out.println("\nOyun berabere bitti (Tüm oyuncular elendi).");
        }
        scanner.close();
    }
}