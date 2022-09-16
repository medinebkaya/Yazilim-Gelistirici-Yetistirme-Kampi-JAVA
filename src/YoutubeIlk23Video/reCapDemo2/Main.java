package YoutubeIlk23Video.reCapDemo2;

public class Main {
    public static void main(String[] args) {
        double[] myList={1.2, 2.1, 3.2, 4.5 };
        double total=0;
        double max=myList[0];
        for(double number: myList){
            total=total+number;
            if (number>max){
                max=number;
            }
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.println("Sayıların toplamı: "+total);
    }
}
