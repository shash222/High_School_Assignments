/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coingame;
/**
 *
 * @author 174036
 */
import java.util.Scanner;
import coin.Coin;

public class CoinGame{
    public static void main(String[] args){
        double total=0;
        int round=0;
        int quarterheads=0;
        int quartertails=0;
        Coin quarter=new Coin();
        Coin dime=new Coin();
        Coin nickle=new Coin();
        System.out.println("Current Sides: ");
        System.out.println("   Quarter: "+quarter.initialSide());
        System.out.println("   Dime: "+dime.initialSide());
        System.out.println("   Nickle: "+nickle.initialSide());
        do{
            round++;
            System.out.println("Flip "+round);
            if (quarter.getSideUp().equals("Heads")){
                System.out.println("   Quarter: Heads");
                quarterheads++;
                quartertails=0;
                total+=.25;
            }
            else{
                System.out.println("   Quarter: Tails");
                quartertails++;
                quarterhead=0;
            }
            System.out.println("Total: "+total);
            if (dime.getSideUp().equals("Heads")){
                System.out.println("   Dime: Heads");
                total+=.10;
            }
            else{
                System.out.println("   Dime: Tails");
            }
            System.out.println("Total: "+total);
            if (nickle.getSideUp().equals("Heads")){
                System.out.println("   Nickle: Heads");
                total+=.05;
            }
            else{
                System.out.println("   Nickle: Tails");
            }
            if (quarterheads==3){
                System.out.println("You flipped three heads for the quarter in a row, so an additional $0.30 will be added");
                total+=.30;
            }
            if (quartertails==3){
                System.out.println("You flipped three tails for the quarter in a row, so an additional $0.30 will be subtracted");
                total-=.30;
            }
            System.out.println("Final Total: "+total);
            System.out.println();
        }while (total<=1.00);
        if (total>1.00){
            System.out.println("Sorry, you lose");
        }
        else{
            System.out.println("Congrats! You win!");
        }
    }
}