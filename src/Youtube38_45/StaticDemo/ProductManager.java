package Youtube38_45.StaticDemo;

public class ProductManager {
    public void add(Product product){
        ProductValidator validator=new ProductValidator();
        if (validator.isValid(product)){
            System.out.println("Eklendi.");
        }
        else
            System.out.println("Ürün bilgileri geçersizdir.");

        ProductValidator productValidator=new ProductValidator();
        productValidator.bisey();

    }
}
