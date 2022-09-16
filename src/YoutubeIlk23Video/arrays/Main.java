package YoutubeIlk23Video.arrays;

public class Main {
    public static void main(String[] args) {
        //Arrays
        String ogrenci3 = "Medine";
        String ogrenci4 = "Ayşe";
        String ogrenci2 = "Habibe";
        String ogrenci1 = "Sibel";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Medine";
        ogrenciler[1] = "Sibel";
        ogrenciler[2] = "Ayşe";
        ogrenciler[3] = "Habibe";

        for(int sayac=0;sayac< ogrenciler.length;sayac++){
            System.out.println(ogrenciler[sayac]);
        }

        System.out.println("-----------------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
