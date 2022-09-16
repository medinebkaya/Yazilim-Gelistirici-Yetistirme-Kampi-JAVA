package YoutubeIlk23Video.miniProje3;

public class Main {
    public static void main(String[] args) {
        //mükemmel sayı bulma
        int sayi=6;
        int total=0;
        for (int i=1; i<sayi; i++){
            if (sayi%i==0){
                total=total+i;
            }
        }
        if (total==sayi){
            System.out.println("Mükemmel sayıdır.");
        }
        else
            System.out.println("Mükemmel sayı değildir.");

    }
}
