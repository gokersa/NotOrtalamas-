import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {


        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz:");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik notunuz:");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya notunuz:");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print("Türkçe notunuz:");
        turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih notunuz:");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik notunuz:");
        muzik = inp.nextInt();
        System.out.println(muzik);

        int toplam = (mat +fizik+kimya+turkce+tarih);
        double sonuc = toplam/6;
        System.out.println("Ortalamanız:" + sonuc);

        // If kullanmadan koşul oluşturma
        String str = (sonuc >= 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.print(str);


    }
}

