package Youtube38_45.Interfaces;
// data access layer = dal
public class MySqlCustomerDal implements ICustomerDal, IRepository{

    @Override
    public void add() {
        System.out.println("MySql eklendi.");
    }
}
