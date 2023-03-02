import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("***************************************************************");   
        
        Food.hamburger();
        Food.salad();
        Food.fries();
        Food.soda();
        System.out.print("Your order comes to $" + computeTotal());
    }

    private static float computeTotal() {
        Food.totalPrice = Food.hbprice + Food.slprice + Food.fprice + Food.sprice;
        return (float) Food.totalPrice;
    }

}
