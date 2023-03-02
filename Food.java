import java.util.Scanner;

public class Food extends Main{

    String item;
    double price;
    double fats;
    double carbohydrates;
    double fibers;
    static double totalPrice;
    static double hbprice;
    static double slprice;
    static double fprice;
    static double sprice;


    static Scanner input = new Scanner(System.in);
    static int num;

    public Food(String iname, double iprice, double ifats, double icarbs, double ifibers){

        item = iname;
        price = iprice;
        fats = ifats;
        carbohydrates = icarbs;
        fibers = ifibers;
    }

    public static void hamburger(){

        System.out.print("Enter number of hamburgers:");
        num = input.nextInt();
        Food hb = new Food("hamburger", 1.85, 9.0, 33.0, 1.0 );
        System.out.println("Each of the" + " " + hb.item + " " + 
            "has" + " "+ hb.fats + "g" + " " + "of fats," + " " +
            hb.carbohydrates + "g" +  " "+ "of carbs," + " "+  
            hb.fibers + "g" + " " + "and" + " " + "of fiber. \n" );
        hbprice = num * 1.85;
    }

    public static void salad(){
        
        System.out.print("Enter number of salads:");
        num = input.nextInt();
        Food salad = new Food("salad", 2.00, 1.0, 11.0, 5.0 );
        System.out.println("Each of the" + " " + salad.item + " " + 
        "has" + " "+ salad.fats + "g" + " " + "of fats," + " " + 
        salad.carbohydrates + "g" +  " "+ "of carbs," + " "+  
        salad.fibers + "g" + " " + "and" + " " + "of fiber. \n" );
        slprice = num * 2.00;

    }

    public static void fries(){
        System.out.print("Enter number of fries:");
        num = input.nextInt();
        Food fries = new Food("fries", 1.30, 11.0, 36.0, 4.0 );
        System.out.println("Each of the" + " " + fries.item + " " + 
        "has" + " "+ fries.fats + "g" + " " + "of fats," + " " + 
        fries.carbohydrates + "g" +  " "+ "of carbs," + " "+  
        fries.fibers + "g" + " " + "and" + " " + "of fiber. \n" );
        fprice = num * 1.30;
    }

    public static void soda(){
        System.out.print("Enter number of soda:");
        num = input.nextInt();
        Food soda = new Food("soda", 0.95, 0.0, 38.0, 0.0 );
        System.out.println("Each of the" + " " + soda.item + " " + 
        "has" + " "+ soda.fats + "g" + " " + "of fats," + " " + 
        soda.carbohydrates + "g" +  " "+ "of carbs," + " "+  
        soda.fibers + "g" + " " + "and" + " " + "of fiber. \n" );
        sprice = num * 0.95;

    }


}