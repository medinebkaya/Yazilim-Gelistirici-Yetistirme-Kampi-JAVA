package Youtube38_45.PolymorphismDemo;

public class EmailLogger extends BaseLogger {
    public void log(String message){
        System.out.println("Logged to email"+ message);

    }
}
