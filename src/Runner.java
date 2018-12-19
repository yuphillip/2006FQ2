import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the vehicle price calculator (including tax).");
        System.out.println("Before that, here are some examples of some cars using NY tax.");
        System.out.println("----------------------------------------------------");
        System.out.println("Lamborghini");
        TaxableItem lambo = new Vehicle(200000,2000,0.0875);
        System.out.println(lambo);
        System.out.println("----------------------------------------------------");
        System.out.println("Toyota w. Changed Markup");
        Vehicle toyota = new Vehicle(1000,50,0.0875);
        toyota.changeMarkup(73.5);
        System.out.println(toyota);
        System.out.println("----------------------------------------------------");
        System.out.println("Now try it yourself!");
        System.out.println("Please type in double :D");
        Scanner in = new Scanner(System.in);
        System.out.println("Input the cost of your car.");
        double cost = in.nextDouble();
        System.out.println("Input the markup your seller will get.");
        double markup = in.nextDouble();
        System.out.println("Input the tax rate, a tax rate of (0.10) means 10% tax.");
        double rate = in.nextDouble();
        TaxableItem jeep = new Vehicle(cost,markup,rate);
        System.out.println(jeep);
        System.out.println("Enjoy your new car!");
    }
}
