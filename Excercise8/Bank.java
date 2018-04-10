/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author 165027
 */
import java.util.Random;
import java.util.Scanner;
import account.Account;
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int accountnum;
        Scanner option=new Scanner(System.in);
        System.out.println("Welcome to the bank");
        Random accnum=new Random();
        accountnum=accnum.nextInt(8999)+1000;
        Account a=new Account("John", accountnum, 0, "checkings");
        Random accnum=new Random();
        accountnum=accnum.nextInt(8999)+1000;
        Account b=new Account("Mike", accountnum, 0, "checkings");
        Random accnum=new Random();
        accountnum=accnum.nextInt(8999)+1000;
        Account c=new Account("Tom", accountnum, 0, "checkings");
        Random accnum=new Random();
        accountnum=accnum.nextInt(8999)+1000;
        Account d=new Account("Joe", accountnum, 0, "savings");
        Random accnum=new Random();
        accountnum=accnum.nextInt(8999)+1000;
        Account e=new Account("Josh", accountnum, 0, "savings");
        String name="";
        boolean debt=false;
        int x=0;
        int y=0;
        double z=0;
        double c1=0;
        double c2=0;
        double c3=0;
        double c4=0;
        double c5=0;
        do{
            System.out.println("\nWhat Would you like to do?");
            System.out.println("Enter 1 to view an account\nEnter 2 to make a deposit\nEnter 3 to make a withdrawal\nEnter 4 to see a list of all checking accounts");
            System.out.println("Enter 5 to see a list of all savings accounts\nEnter 6 to see if an account is overdrawn\nEnter 7 to check the total holdings of the bank\nEnter 8 to close the bank");
            y=option.nextInt();
            option.nextLine();
            if (y==1)
            {
                System.out.println("Whose account would you like to see?");
                System.out.println("Remember, names are case sensitive");
                System.out.println("John\nMike\nTom\nJoe\nJosh\n");
                name=option.nextLine();
                if (name.equals("John"))
                {
                    a.Print();
                }
                else if (name.equals("Mike"))
                {
                    b.Print();
                }
                else if (name.equals("Tom"))
                {
                    c.Print();
                }
                else if (name.equals("Joe"))
                {
                    d.Print();
                }
                else if (name.equals("Josh"))
                {
                    e.Print();
                }
                else
                {
                    System.out.println("Incorrect name entered");
                }
            }
            else if (y==2)
            {
                System.out.println("Whose account do you want deposit money into?");
                System.out.println("Remember, names are case sensitive");
                name=option.nextLine();
                if (name.equals("John"))
                {
                    System.out.println("How much would you like to deposit?");
                    z=option.nextDouble();
                    a.deposit(z);
                }
                else if (name.equals("Mike"))
                {
                    System.out.println("How much would you like to deposit?");
                    z=option.nextDouble();
                    b.deposit(z);
                }
                else if (name.equals("Tom"))
                {
                    System.out.println("How much would you like to deposit?");
                    z=option.nextDouble();
                    c.deposit(z);
                }
                else if (name.equals("Joe"))
                {
                    System.out.println("How much would you like to deposit?");
                    z=option.nextDouble();
                    d.deposit(z);
                }
                else if (name.equals("Josh"))
                {
                    System.out.println("How much would you like to deposit?");
                    z=option.nextDouble();
                    e.deposit(z);
                }
                else
                {
                    System.out.println("Incorrect name entered");
                }
            }
            else if (y==3)
            {
                System.out.println("Whose account do you want withdraw money from?");
                System.out.println("Remember, names are case sensitive");
                name=option.nextLine();
                if (name.equals("John"))
                {
                    System.out.println("How much would you like to withdraw?");
                    z=option.nextDouble();
                    c1=a.getBal();
                    if (c1<0)
                    {
                        System.out.println("Your current balance is: "+a.getBal()+"\nBecause you owe us money, you cannot withdraw anymore until debt is paid off");
                    }
                    else if (c1>=0&&z>c1)
                    {
                        a.add();
                        a.withdraw(z);
                    }
                }
                else if (name.equals("Mike"))
                {
                    System.out.println("How much would you like to withdraw?");
                    c2=b.getBal();
                    z=option.nextDouble();
                    if (c2<0)
                    {
                        System.out.println("Your current balance is: "+b.getBal()+"\nBecause you owe us money, you cannot withdraw anymore until debt is paid off");
                    }
                    else if (c2>=0&&z>c2)
                    {
                        b.add();
                        b.withdraw(z);
                    }
                }
                else if (name.equals("Tom"))
                {
                    System.out.println("How much would you like to withdraw?");
                    z=option.nextDouble();
                    c3=c.getBal();
                    if (c3<0)
                    {
                        System.out.println("Your current balance is: "+c.getBal()+"\nBecause you owe us money, you cannot withdraw anymore until debt is paid off");
                    }
                    else if (c3>=0&&z>c3)
                    {
                        c.add();
                        c.withdraw(z);
                    }
                }
                else if (name.equals("Joe"))
                {
                    System.out.println("How much would you like to withdraw?");
                    z=option.nextDouble();
                    c4=d.getBal();
                    if (z>c4)
                    {
                        System.out.println("Because this is a savings account, you cannot loan money");
                    }
                    else
                    {
                        d.withdraw(z);
                    }
                }
                else if (name.equals("Josh"))
                {
                    System.out.println("How much would you like to withdraw?");
                    z=option.nextDouble();
                    c5=e.getBal();
                    if (z>c5)
                    {
                        System.out.println("Because this is a savings account, you cannot loan money");
                    }
                    else
                    {
                        e.withdraw(z);
                    }
                }
                else
                {
                    System.out.println("Incorrect name entered");
                }
            }
            else if (y==4)
            {
                System.out.println("John");
                System.out.println("Mike");
                System.out.println("Tom");
            }
            else if (y==5)
            {
                System.out.println("Joe");
                System.out.println("Josh");
            }
            else if (y==6)
            {
                System.out.println("Whose account would you like to check?");
                System.out.println("Remember, names are case sensitive");
                name=option.nextLine();
                if (name.equals("John"))
                {
                    debt=a.isOverDrawn();
                    if (debt=true)
                    {
                        System.out.println("This account is overdrawn");
                    }
                    else
                    {
                        System.out.println("This account is not overdrawn");
                    }
                }
                else if (name.equals("Mike"))
                {
                    debt=b.isOverDrawn();
                    if (debt=true)
                    {
                        System.out.println("This account is overdrawn");
                    }
                    else
                    {
                        System.out.println("This account is not overdrawn");
                    }
                }
                else if (name.equals("Tom"))
                {
                    debt=c.isOverDrawn();
                    if (debt=true)
                    {
                        System.out.println("This account is overdrawn");
                    }
                    else
                    {
                        System.out.println("This account is not overdrawn");
                    }
                }
                else if (name.equals("Joe"))
                {
                    System.out.println("This account is a savings account, and cannot be overdrawn");
                }
                else if (name.equals("Josh"))
                {
                    System.out.println("This account is a savings account, and cannot be overdrawn");
                }
                else
                {
                    System.out.println("Incorrect name entered");
                }
            }
            else if (y==7)
            {
                a.total();
            }
            else if (y==8)
            {
                break;
            }
            else
            {
                System.out.println("Incorrect value entered");
            }
        }while (x==0||y==8);
    }
    
}