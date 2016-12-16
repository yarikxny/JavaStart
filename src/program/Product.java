package program;

/**
 * Created by yarik on 13.11.2016.
 */
public abstract class Product implements IProduct {
    private String name;
    private double price;
    private int quantity;


    /**
     * Get discount
     */
    protected int calcDiscount(){
        if (quantity > 10) {
            return 10;
        }else{
            return 0;
        }
    }


    /**
    method getCost
    */
    public double getCost(){ return quantity * price;}


    /***
    return the name
    */
    public String getName(){
        return name;
    }
    /**
    * param name
    *           the name to set
    */
    public void setName(String newVal){
        this.name = newVal;
    }

    /**
     * @return the price
     */
    public double getPrice(){
        return price;
    }

    /**
     * param price
     *            the price to set
     */
    public void setPrice(double newPriceVal){
        this.price = newPriceVal;
    }

    /**
     * @return the quantity
     */
    public int getQuantity(){
        return quantity;
    }
    /**
     * param quantity
     *              the param to set
     */
    public void setQuantity(int newQuantityVal){
        this.quantity = newQuantityVal;
    }
}
