package Youtube38_45.Interfaces;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle veritabanına eklendi.");
    }
}
