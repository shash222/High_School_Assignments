import java.util.Random;
import java.util.Scanner;
public class SixA{
    public static int cpu=0;
    public static int player=0;

    public static int random(){
        int num;
        Random generator=new Random();
        num=generator.nextInt(6)+1;
        return num;
    }

    public static void main(String[] args){
        int option;
        int num;
        int comp;
        int tot;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to pig");
        do{
            for (int x=0;x<3;x++){
                comp=random();
                cpu+=comp;
                System.out.println("Computer rolled a "+comp);
                if (cpu>=100){
                    break;
                }
            }
            System.out.println("Computer total: "+cpu);
            System.out.println();
            tot=0;
            do{
                num=random();
                System.out.println("You rolled a "+num);
                if (num==1){
                    System.out.println("Sorry but you rolled a one");
                    break;
                }
                else{
                    tot+=num;
                }
                System.out.println("Would you like to roll again? Enter 1 for yes, any other number for no");
                option=in.nextInt();
                if (cpu>=100){
                    break;
                }
            }while(num!=1&&option==1&&player<100);
            System.out.println();
            if(num!=1){
                player+=tot;
            }
            System.out.println("Player total "+player);
            System.out.println("Computer total "+cpu);
            System.out.println();
        }while(cpu<100&&player<100);
        if (cpu>100){
            System.out.println("Sorry, you lost");
        }
        else{
            System.out.println("Congrats, you won!");
        }
        System.out.println("Final Scores: ");
        System.out.println("Computer: "+cpu);
        System.out.println("Player: "+player);
    }
}