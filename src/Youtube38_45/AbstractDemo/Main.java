package Youtube38_45.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}
