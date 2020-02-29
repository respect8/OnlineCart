package collections.shoppingcart;

import userInformations.UsersDataBase;

import java.util.List;
import java.util.Scanner;

public class CartUI extends UsersDataBase {

    Cart cart = new Cart();
    private int ch;

    public void storeProductsMenu() {
        System.out.println("1.Add to cart");
        System.out.println("2. Remove from cart");
        System.out.println("0. Exit");
    }

    public void printStartScreen() {
        System.out.println("1. Display store products");
        System.out.println("2. Display cart");
        System.out.println("5. Move to user details and delivery");
        System.out.println("0. Exit");
    }

    public void innerChoice1() {
        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:
                break;
        }
    }

    public void cartMenu() {
        do {
            printStartScreen();
            getUserInput();
            switch (ch) {
                case 1:
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (ch != 0);
    }

    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByProductID(pid);

    }

    private int getUserInput() {
        Scanner in = new Scanner(System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void showCart() {
        cart.printCartItems();
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByProductID(pid);
    }

    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod : products) {
            System.out.println(
                    prod.getProductID() + "- " +
                            prod.getName() + " " +
                            prod.getPrice() + " " +
                            prod.getStock()
            );
        }
    }


}
