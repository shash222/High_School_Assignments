import java.util.Random;
import java.util.Scanner;
public class SixB{
    public static void main(String[] args){
        Random generator=new Random();
        Scanner in=new Scanner(System.in);
        int choice;
        int win=0;
        int lose=0;
        int tries=0;
        int num;
        for (int x=0;x<10;x++){
            do{
                System.out.println("Enter guess number");
                choice=in.nextInt();
                if (choice-num>3||choice-num<-3){
                    System.out.println("Cold");
                }
                else if (choice-num==2||choice-num==-2){
                    System.out.println("Warm");
                }
                if (choice-num==1||choice-num==-1){
                    System.out.println("Hot");
                }
                tries++;
            }while(choice!=num&&tries<3);
            if (tries<=3){
                System.out.println("Congrats! You won round "+(x+1)+" out of 10 rounds");
            }
            else{
                System.out.println("Sorry, you lose round "+(x+a)+" out of 10 rounds");
            }
        }
        System.out.println("Final Stats: ");
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+lose);
        if (win<8){
            System.out.prinln("Level: Amateur");
        }
        else if (win==8){
            System.out.prinln("Level: Advanced");
        }
        else if (win==9){
            System.out.prinln("Level: Professional");
        }
        else if (win==10){
            System.out.prinln("Level: Hacker");
        }
    }
}