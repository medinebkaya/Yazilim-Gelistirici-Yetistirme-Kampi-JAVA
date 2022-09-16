package YoutubeIlk23Video.conditionals;

public class Main {
    public static void main(String[] args) {
        //conditionals-koşullar
        int sayi;
        sayi=20;
        if (sayi<20){
            System.out.println("sayı 20'den küçüktür");
        }
        else if (sayi==20){
            System.out.println("Sayı 20'ye eşittir.");
        }
        else{
            System.out.println("Sayı 20`den küçük değildir.");
        }

        //switch case
        char grade='A';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Çok güzel");
                break;
            case 'C':
                System.out.println("İyi");
                break;
            case 'D':
                System.out.println("Kötü");
                break;
            case 'F':
                System.out.println("Çok kötü");
                break;
            default:
                System.out.println("Geçersiz not");
        }
    }
}
