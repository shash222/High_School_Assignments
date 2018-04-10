import java.util.Scanner;
public class ThreeC{
    public static void main(String[] args){
        int x;
        int amount;
        Scanner in=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        amount=in.nextInt();
        int[] numbers=new int[amount];
        int chosen;
        System.out.println("Enter ten numbers");
        for (x=0;x<amount;x++){
            chosen=in.nextInt();
            numbers[x]=chosen;
        }
        System.out.print("EVEN: ");
        for (x=0;x<amount;x++){
            if (numbers[x]%2==0){
                System.out.print(numbers[x]+" ");
            }
        }
        System.out.println();
        System.out.print("ODD: ");
        for (x=0;x<amount;x++){
            if (numbers[x]%2!=0){
                System.out.print(numbers[x]+" ");
            }
        }
        System.out.println();
    }
}