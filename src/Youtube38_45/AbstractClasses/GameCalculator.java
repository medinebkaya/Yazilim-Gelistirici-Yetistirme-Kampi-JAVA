package Youtube38_45.AbstractClasses;
// abstract sınıflar new'lenemez.
public abstract class GameCalculator {
    public abstract void hesapla();
    //kim inherit ediyorsa hesapla'yı içermek zorunda
    // ama hesapla'yı override etmek zorunda
    //yani metot içeriğini kendi yazmalı.
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
