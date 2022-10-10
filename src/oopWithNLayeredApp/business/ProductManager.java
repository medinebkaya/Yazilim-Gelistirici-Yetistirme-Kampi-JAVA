package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception { //metodun hata fırlatabileceğini baştan belirtir.
        //iş kuralları- business rules
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz."); //hata fırlatma
        }

        JdbcProductDao productDao=new JdbcProductDao();
        productDao.add(product);

        for (Logger logger: loggers){
            logger.log(product.getName());
        }
    }
}
