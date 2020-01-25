package collections.shoppingcart;

import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class UI {

    Cart cart = new Cart();
    private int ch=0;

    public void startScreen(){
        System.out.println("1. Display store products");
        System.out.println("2. Display cart");
        System.out.println("0. Exit");
    }
    public void storeProductsMenu(){
        System.out.println("1.Add to cart");
        System.out.println("2. Remove from cart");
        System.out.println("0. Exit");
    }
    private void addProductToCart(){
        int pid=getUserInput();
        cart.addProductToCartByProductID(pid);

    }
    private int getUserInput(){
        Scanner in = new Scanner(System.in);
        ch=Integer.parseInt(in.nextLine());
        return ch;
    }
    private void showCart(){
        cart.printCartItems();
    }
    private void removeProductFromCart(){
        int pid=getUserInput();
        cart.removeProductByProductID(pid);
    }
    private void displayStoreProducts(){
        List<Product> products = new Products().getProducts();
        for (Product prod:products){
            System.out.println(
                    prod.getProductID()+"- "+
                            prod.getName()+ " "+
                            prod.getPrice()+ " "+
                            prod.getStock()
            );
        }
    }
    private void innerChoice1(){
        switch(ch){
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            case 0:
                break;
        }
    }




}
