import view.ProductView;
import controller.ProductController;
import model.Product;
import java.util.List;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        List<Product> products = Arrays.asList(new Product(1,"Laptop", 1000.0, "High performance laptop"),
                                               new Product(2,"Smartphone", 500.0, "Latest model smartphone"),
                                               new Product(3,"Headphones", 150.0, "Noise cancelling headphones"),
                                               new Product(4,"Earphone", 15.0, "Bass Boosted and Noise cancelling earphones"));
        System.out.println("E-Commerce Application Started");
        ProductView productView = new ProductView();

        ProductController productController = new ProductController(products, productView);
        productController.showProducts();

        productController.addToCart(1);
        productController.addToCart(5);
        productController.viewCart();



    }
}
