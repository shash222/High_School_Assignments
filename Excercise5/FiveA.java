import java.util.Scanner;
public class FiveA{
    public static double DollarEuro(double value){
        double convert=value*.88;
        return convert;
    }
    
    public static double DollarYen(double value){
        double convert=value*109.53;
        return convert;
    }
    
    public static double DollarRupee(double value){
        double convert=value*66.45;
        return convert;
    }
    
    public static void main(String[] args){
        int choice;
        double value;
        double convert;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the Money Coverter\nEnter amount you would like to convert (dollars)");
        value=in.nextDouble();
        System.out.println("What would you like to convert it to?\n1. Euros\n2. Yen\n3. Rupee\n4. Quit");
        choice=in.nextInt();
        do{
            if (choice==1){
                convert=DollarEuro(value);
                System.out.println(value+" Dollars = "+convert+" Euros");
            }
            else if (choice==2){
                convert=DollarYen(value);
                System.out.println(value+" Dollars = "+convert+" Yen");
            }
            else if (choice==3){
                convert=DollarRupee(value);
                System.out.println(value+" Dollars = "+convert+" Rupees");
            }
            else if (choice==4){
                break;
            }
            else{
                System.out.println("Incorrect value entered. Please enter correct value");
            }
        }while(choice>4||choice<1);
        System.out.println("Have a nice day!");
    }
}