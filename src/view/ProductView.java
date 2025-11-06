package view;
import model.Product;
import java.util.List;

public class ProductView {
    
    public void displayProductDetails(List<Product> products){
        System.out.println("Product Details:-------------------");
        for(Product pr : products){
            System.out.println("Product ID: " + pr.getId());
            System.out.println("Product Name: " + pr.getName());
            System.out.println("Price: $" + pr.getPrice());
            System.out.println("Description: " + pr.getDescription());
            System.out.println("---------------------------");
        }
    }
}
