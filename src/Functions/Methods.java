package Functions;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        /*
        Fonksiyonları daha iyi kavramak için aklıma gelen
        birkaç örneği yaptım.Bazıları kullanışlı , bazıları çok gereksiz
        ama amaç öğrenmek.
         */
    }

    // Pi sayısını gösteren method
    public static void showPi() {
        Double pi = 3.141592653589793238462643383;
        System.out.println("Pi Sayısı : " + pi);
    }

    // Toplama methodu
    static int topla(int x, int y) {

        return x + y;
    }

    // Çıkarma methodu
    static int cikar(int x, int y) {
        return x + y;
    }

    // Çarpma methodu
    static int carp(int x, int y) {
        return x * y;
    }

    // Bölme methodu
    static double bol(double x, double y) {
        return x / y;
    }

    // Üçgenin alanını hesaplayan method
    static double ucgenAlani(double taban, double yukseklik) {
        double tabYuk = (taban * yukseklik) / 2;
        return tabYuk;
    }

    // Faktoriyel bulan method
    static void faktoriyel(int x) {

        int faktoriyel = 1;

        int sayi = x;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
    }
    //Şifre degistiren method
    static void sifreKoy(){
        Scanner input = new Scanner(System.in);
        System.out.print("Yeni sifre : ");
        String sifre = input.next();

        System.out.println("Sifre degistirildi");
    }

    // Kullanıcı giriş methodu
    static void kullaniciGiris(){
        String username,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = input.next();

        System.out.print("Şifrenizi giriniz : ");
        password = input.next();

        if(username.equals("keremkenan") && password.equals("123456")){
            System.out.println(".....Giriş başarıyla yapıldı.....");
            // equals() metodu eşitmi ? diye bakar
        }
        else {
            System.out.println("Hatalı giriş !!!");
        }
    }
    // Vücut kitle endeksi hesaplayan method
    static void vucutKitleEndex(){
        Scanner input = new Scanner(System.in);
        int kilo,boy;

        System.out.print("Kilonuzu girin : ");
        kilo = input.nextInt();

        System.out.print("Boyunuzu girin : ");
        boy = input.nextInt();

        double vki = (boy * boy) / kilo;
        System.out.println("Vücüt Kitle İndeksiniz : " + vki );
    }

    // mesaj gönderen method
    static void message(String message){
        System.out.println("Mesage :" + message);
    }



}
