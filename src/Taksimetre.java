import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        /*
        Km Başı Ücretimiz : 2.20 TL
        Minimum Tutarımız 20 TL olmakla beraber , 20 TL altındaki ücretlerde 20 TL alınacaktır.
        Taksimetremizin açılış ücreti 10 TL dir.
         */

        double ucret, acilisUcreti, indiBindi, kmBasi, gidilenMesafe;
        Scanner input = new Scanner(System.in);

        System.out.println("İndi Bindi Ücretimiz Alınan Karar Gereği 20 Tl Olarak Belirlenmiştir.");
        System.out.print("GİDİLEN MESAFEMİZ (KM) = ");
        gidilenMesafe = input.nextDouble();

        acilisUcreti = 10;
        indiBindi = 20;
        kmBasi = 2.20;
        ucret = (gidilenMesafe*kmBasi)+acilisUcreti;
        ucret = ucret < indiBindi ? 20 : ucret;

        System.out.println("Açılış Ücretimiz = " + acilisUcreti);
        System.out.println("Kilometre Başı Ücretimiz = " + kmBasi);
        System.out.println("Ödeyeceğiniz Tutar = " + ucret);
        


    }
}
