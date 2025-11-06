package controller;
import model.Product;
import view.ProductView;
import java.util.List;
import java.util.HashSet;
import model.Cart;
public class ProductController {
    private ProductView view;
    private List<Product> products;

    private HashSet<Cart> cart = new HashSet<>();

    public ProductController(List<Product> products, ProductView view){
        this.products = products;
        this.view = view;
    }

    public void showProducts(){
        view.displayProductDetails(products);
    }

    public void addToCart(int productId){
        for(Product pr : products){
            if(pr.getId()==productId){
                cart.add(new Cart(pr.getName(),pr.getPrice()));
                System.out.println(pr.getName() + " added to cart.");
            }
        }

    }

    public void viewCart(){
        System.out.println("Cart Details:-------------------");
        double totalPrice = 0.0; 
        for(Cart cr : cart){
            System.out.println("Name of the product: "+cr.getName());
            System.out.println("Price of the Product: "+cr.getPrice());
            totalPrice += cr.getPrice();
        }

        System.out.println("The total price of Cart is : $"+totalPrice);
    }
}
