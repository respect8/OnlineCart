package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> cartItems = new ArrayList<Product>();

    public void addProductToCartByProductID(int productID) {
        Product product = getProductByProductID(productID);
        addToCart(product);
    }

    private Product getProductByProductID(int productID) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod : products) {
            if (prod.getProductID() == productID) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product product) {
        cartItems.add(product);
    }
    public void removeProductByProductID(int productID) {
        Product prod = getProductByProductID(productID);
        cartItems.remove(prod);
    }
    void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println(prod.getName());
        }
    }

}
