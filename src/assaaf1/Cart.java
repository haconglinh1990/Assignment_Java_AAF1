/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assaaf1;

import java.util.ArrayList;

/**
 *
 * @author haconglinh1990
 */
public class Cart {
    private final ArrayList<Product> cart;

    public Cart() {
        cart = new ArrayList<>();
    }
    
    public void addProductToCart(Product product){
        cart.add(product);
    }
    
    public void removeProductFromCart(int position){
        cart.remove(position);
    }
    
    public int numberProductInCart(){
        int number;
        number = cart.size();
        
        return number;
    }
    
    public int totalPrice(){
        int totalPrice = 0;
        for (Product product : cart) {
            totalPrice = product.getPrice()*product.getNumberItem() + totalPrice;
           
        }
        
        return totalPrice;
    
    }
    
    public void updateToDB(){
        
    }
}
