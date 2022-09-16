package YoutubeIlk23Video.miniProje5;

public class Main {
    public static void main(String[] args) {
        int aranacak=5;
        boolean varlik=false;
        int[] sayilar={1,2,5,7,9,0};
        for (int sayi: sayilar){
            if (sayi==aranacak) {
                varlik = true;
                break;
            }
        }
        if (varlik==true){
            System.out.println("Sayı dizinin içinde vardır.");
        }
        else
            System.out.println("Sayı dizinin içinde yoktur.");
    }
}
