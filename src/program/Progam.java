package program;

import java.util.Scanner;

/**
 * Created by yarik on 13.11.2016.
 */
public class Progam {

    private static final int MAX_PRODUCTS = 2;
    private static final int MAX_DEALS = 2;

    private Deal[] deals;
    /**
     * Program's entry point
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        new Progam().allActions();
    }

    private void allActions(){
        input();
        System.out.println("==================");
        output();
    }

    private void output() {
        for (Deal deal : deals) {
            System.out.println("Deal " + deal.getDate());
            System.out.println("    " + deal.getBuyer().getName()
                    + " buys from " + deal.getSeller().getName());

            for (Product product : deal.getProducts()) {
                System.out.println("        " + product.getName() + " "
                        + product.getQuantity() + " x " + product.getPrice()
                        + " = " + product.getCost());
            }

            System.out.println("Sum: " + deal.getSum());
            System.out.println("----------------------------");
        }
    }

    private void input(){
        deals= new Deal[MAX_DEALS];

        for(int i=0;i<deals.length;i++){
            System.out.println((i+1)+" of "+deals.length+": " );
            deals[i]=inputDeal();
        }
    }

    private Deal inputDeal() {
        System.out.println("Input deal ->");

        System.out.print("  Seller -> ");
        Party seller = inputParty();

        System.out.print("  Buyer -> ");
        Party buyer = inputParty();

        Product[] products = new Product[MAX_PRODUCTS];
        for (int i = 0; i < products.length; i++) {
            products[i] = inputProduct();
        }

        Deal deal = new Deal(buyer, seller, products);
        return deal;
    }

    private Product inputProduct() {
        System.out.println("  Input product ->");
        String name = keyboard("    Name");
        String price = keyboard("    Price");
        String quan = keyboard("    Quantity");

        Product product = new Product();
        product.setName(name);
        product.setPrice(Double.valueOf(price));
        product.setQuantity(Integer.valueOf(quan));
        return product;
    }

    private Party inputParty() {
        String partyName = keyboard("Party name");
        Party party = new Party();
        party.setName(partyName);
        return party;
    }

    private String keyboard(String message) {
        System.out.print(message + ": ");
        Scanner scan = new Scanner(System.in);
        String rez = scan.next();
        scan.close();
        return rez;
    }
}
