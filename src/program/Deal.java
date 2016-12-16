package program;

import java.util.Date;

/**
 * Created by yarik on 13.11.2016.
 */
public class Deal {
    private Date date;
    private Party seller;
    private Party buyer;
    private Product[] products;
    //start constructor
    public Deal(Party seller, Party buyer,Product[] products){
        date= new Date();
        this.seller= seller;
        this.buyer = buyer;
        this.products = products;
    }

    public double getSum(){
        double rez = 0;
        for(Product product:products){
            rez +=product.getCost();
        }
        return rez;
    }
    /*
    get the date
    */
    public Date getDate(){
        return date;
    }

    /*
    get the seller
    */
    public Party getSeller(){
        return seller;
    }
    /*
    get the buyer
    */
    public Party getBuyer(){
        return buyer;
    }
    /*
    *get the products
    */
    public Product[] getProducts(){
        return products;
    }
}
