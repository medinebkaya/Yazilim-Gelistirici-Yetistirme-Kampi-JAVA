package Youtube24_37.Methods;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }
    public static void sayiBulmaca() {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak =5;
        boolean varMi=false;

        for (int sayi : sayilar) {
            if (sayi==aranacak) {
                varMi=true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayı Mevcuttur");
        }else {
            System.out.println("Sayı Mevcut Değildir");
        }
    }
    public static void mesajVer(int aranacak) {
        System.out.println("Sayı Mevcuttur : "+ aranacak);
    }
}
