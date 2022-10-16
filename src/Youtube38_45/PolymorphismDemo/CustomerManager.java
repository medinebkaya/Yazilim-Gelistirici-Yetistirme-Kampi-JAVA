package Youtube38_45.PolymorphismDemo;

public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("Müşteri eklendi.");
        DatabaseLogger logger=new DatabaseLogger();
        logger.log("Log mesajı");
    }
}
