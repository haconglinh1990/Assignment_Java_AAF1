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
public class Product {
    private int idProduct;
    private String category;
    private String name;
    private int price;
    private int numberItem;
    private String maker;

    public Product(int idProduct, String category, String name, int price, int numberItem, String maker) {
        this.idProduct = idProduct;
        this.category = category;
        this.name = name;
        this.price = price;
        this.numberItem = numberItem;
        this.maker = maker;
    }



    public Product() {
    }
    
    public ArrayList<Product> searchProductByName(String keyName){
        ArrayList<Product> arrayListProduct = new ArrayList<>();
        
        
        return arrayListProduct;
    }
    
    public ArrayList<Product> searchProductByPrice(int minPrice, int maxPrice){
        ArrayList<Product> arrayListProduct = new ArrayList<>();
        
        
        return arrayListProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberItem() {
        return numberItem;
    }

    public void setNumberItem(int numberItem) {
        this.numberItem = numberItem;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    
    public ArrayList<Product> searchProductByMaker(String keyMaker){
        ArrayList<Product> arrayListProduct = new ArrayList<>();
        
        
        return arrayListProduct;
    }
    


          
}
