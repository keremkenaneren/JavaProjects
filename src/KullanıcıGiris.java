import java.util.Scanner;

public class KullanıcıGiris {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = input.next();

        System.out.print("Şifrenizi giriniz : ");
        password = input.next();

        if(username.equals("keremkenan") && password.equals("123456")){
            System.out.println(".....Giriş başarıyla yapıldı.....");

        }
        else {
            System.out.println("Hatalı giriş !!!");
        }


    }
}
