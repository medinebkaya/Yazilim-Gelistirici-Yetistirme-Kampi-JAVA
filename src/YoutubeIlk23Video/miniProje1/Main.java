package YoutubeIlk23Video.miniProje1;

public class Main {
    public static void main(String[] args) {
        //SAYI ASAL MI?
        int number=19;
        boolean asal=true;
        for (int i=2; i<number; i++){
            if (number%i==0) {
                asal=false;
            }
        }
        if (asal==true)
            System.out.println("Sayı asaldır");
        else if (asal==false)
            System.out.println("Sayı asal değildir.");
    }
}
