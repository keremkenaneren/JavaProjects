import java.util.Scanner;

public class VucutKitleİndeks {
    public static void main(String[] args) {
        /*
        Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks"
        değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)

         */
        Scanner input = new Scanner(System.in);
        int kilo,boy;

        System.out.print("Kilonuzu girin : ");
        kilo = input.nextInt();

        System.out.print("Boyunuzu girin : ");
        boy = input.nextInt();

        double vki = (boy * boy) / kilo;
        System.out.println("Vücüt Kitle İndeksiniz : " + vki );


    }
}
