package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products=new ArrayList<Product>();

    public Products (){
        this.initStoreItems();
    }

    public void initStoreItems() {
        String [] productNames={"Soap","Pen","fork"};
        Double [] productPrice={3d,2d,4d};
        Integer [] stock={42,35,80};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
