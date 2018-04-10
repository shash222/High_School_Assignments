import java.util.Scanner;
public class FiveB{
    public static void fillarray(String title, int[] data, char symbol){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter data");
        for (int x=0;x<data.length;x++){
            data[x]=in.nextInt();
        }
        drawbar(title, data, symbol);
    }

    public static void drawbar(String title, int[] data, char symbol){
        System.out.println(title);
        for (int x=0;x<data.length;x++){
            System.out.print((x+1)+"| ");
            for (int y=0;y<data[x];y++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int amount;
        String title;
        char symbol;
        System.out.println("Enter graph title");
        title=in.nextLine();
        System.out.println("How many values would you like to enter?");
        amount=in.nextInt();
        System.out.println("What symbol would you like to use?");
        symbol=in.next().charAt(0);
        int[] data=new int[amount];
        fillarray(title,data,symbol);
    }
}