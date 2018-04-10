import java.util.Scanner;
public class Library{
    public static void main(String[] args){
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Others
 */
import Books.Books;
import java.util.Scanner;
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //defines variables
        Scanner in=new Scanner(System.in);
        int option, o, x=0;
        String book="";
        int y;
        o=0;
        //catalog
        Books a=new Books("Google");
        Books b=new Books("Microsoft");
        Books c=new Books("Oracle");
        Books d=new Books("Apple");
        Books e=new Books("Sun Microsystems");
        System.out.println("Welcome to the public library?");
        //keeps library open until its closed
        while (x==0){
        do
        {
            //Greeting/asks consumer what he/she wants to do
            System.out.println("\nWhat would you like to do?");
            System.out.println("Enter 1 to see the catalog\nEnter 2 to borrow a book\nEnter 3 to returned a book\nEnter 4 to see a list of all available books\nEnter 5 to see a list of all unavailable books\nEnter 6 to close the library");
            option=in.nextInt();
            //Shows consumer the catalog
            if (option==1)
            {
                System.out.println(a.getTitle());
                System.out.println(b.getTitle());
                System.out.println(c.getTitle());
                System.out.println(d.getTitle());
                System.out.println(e.getTitle());
            }
            //Asks consumer what book to check out
            else if (option==2)
            {
                System.out.println("Which book would you like to borrow");
                in.nextLine();
                book=in.nextLine();
                if (book.equals("Google")||book.equals("google"))//works whether first letter is capital or not
                {
                    if (a.isBorrowed()==false)
                    {
                        System.out.println("This book has now been checked out");
                        a.borrowed();
                    }
                    else
                    {
                        System.out.println("This book is currently unavailable");
                    }
                }
                else if (book.equals("Microsoft")||book.equals("microsoft"))//works whether first letter is capital or not
                {
                    if (b.isBorrowed()==false)
                    {
                        System.out.println("This book has now been checked out");
                        b.borrowed();
                    }
                    else
                    {
                        System.out.println("This book is currently unavailable");
                    }
                }
                else if (book.equals("Oracle")||book.equals("oracle"))//works whether first letter is capital or not
                {
                    if (c.isBorrowed()==false)
                    {
                        System.out.println("This book has now been checked out");
                        c.borrowed();
                    }
                    else
                    {
                        System.out.println("This book is currently unavailable");
                    }
                }
                else if (book.equals("Apple")||book.equals("apple"))//works whether first letter is capital or not
                {
                    if (d.isBorrowed()==false)
                    {
                        System.out.println("This book has now been checked out");
                        d.borrowed();
                    }
                    else
                    {
                        System.out.println("This book is currently unavailable");
                    }
                }
                else if (book.equals("Sun Microsystems")||book.equals("sun microsystems")||book.equals("Sun microsystems")||book.equals("sun Microsystems"))//works whether first letter is capital or not
                {
                    if (e.isBorrowed()==false)
                    {
                        System.out.println("This book has now been checked out");
                        e.borrowed();
                    }
                    else
                    {
                        System.out.println("This book is currently unavailable");
                    }
                }
                else
                {
                    System.out.println("Sorry but this book is not in our catalog");
                }

            }
            //allows consumer to returned book
            else if (option==3)
            {
                System.out.println("Which book would you like to return?");
                in.nextLine();
                book=in.nextLine();
                if (book.equals("Google")||book.equals("google"))//works whether first letter is capital or not
                {
                    if (a.isBorrowed()==false)
                    {
                        System.out.println("Thank you for returning the book");
                        a.returned();
                    }
                    else
                    {
                        System.out.println("This book is already in");
                    }
                }
                else if (book.equals("Microsoft")||book.equals("microsoft"))//works whether first letter is capital or not
                {
                    if (b.isBorrowed()==false)
                    {
                        System.out.println("Thank you for returning the book");
                        b.returned();
                    }
                    else
                    {
                        System.out.println("This book is already in");
                    }
                }
                else if (book.equals("Oracle")||book.equals("oracle"))//works whether first letter is capital or not
                {
                    if (c.isBorrowed()==false)
                    {
                        System.out.println("Thank you for returning the book");
                        c.returned();
                    }
                    else
                    {
                        System.out.println("This book is already in");
                    }
                }
                else if (book.equals("Apple")||book.equals("apple"))//works whether first letter is capital or not
                {
                    if (d.isBorrowed()==false)
                    {
                        System.out.println("Thank you for returning the book");
                        d.returned();
                    }
                    else
                    {
                        System.out.println("This book is already in");
                    }
                }
                else if (book.equals("Sun Microsystems")||book.equals("sun microsystems")||book.equals("Sun microsystems")||book.equals("sun Microsystems"))//works whether first letter is capital or not
                {
                    if (e.isBorrowed()==false)
                    {
                        System.out.println("Thank you for returneding the book");
                        e.returned();
                    }
                    else
                    {
                        System.out.println("This book is already in");
                    }
                }
                else
                {
                    System.out.println("Sorry but this book is not in our catalog");
                }
            }
            //shows consumer available books
            else if (option==4)
            {
               System.out.println("Currently available books: ");
               if (a.isBorrowed()==false)
               {
                   System.out.println(a.getTitle());
               }
               if (b.isBorrowed()==false)
               {
                   System.out.println(b.getTitle());
               }
               if (c.isBorrowed()==false)
               {
                   System.out.println(c.getTitle());
               }
               if (d.isBorrowed()==false)
               {
                   System.out.println(d.getTitle());
               }
               if (e.isBorrowed()==false)
               {
                   System.out.println(e.getTitle());
               }
               //Tells user if all of the books are currently checked in
               if (a.isBorrowed()==false&&b.isBorrowed()==false&&c.isBorrowed()==false&&d.isBorrowed()==false&&e.isBorrowed()==false)
               {
                   System.out.println("No book currently available");
               }
            }
            //shows consumer unavailable books
            else if (option==5)
            {
                System.out.println("Currently unavailable books: ");
                if (a.isBorrowed()==false)
                {
                    System.out.println(a.getTitle());
                }
                if (b.isBorrowed()==false)
                {
                    System.out.println(b.getTitle());
                }
                if (c.isBorrowed()==false)
                {
                    System.out.println(c.getTitle());
                }
                if (d.isBorrowed()==false)
                {
                    System.out.println(d.getTitle());
                }
                if (e.isBorrowed()==false)
                {
                    System.out.println(e.getTitle());
                }
               //Tells user if none of the books are currently checked in
                if (a.isBorrowed()==false&&b.isBorrowed()==false&&c.isBorrowed()==false&&d.isBorrowed()==false&&e.isBorrowed()==false)
                {
                    System.out.println("All of our books are currently available");
                }
            }
            //closes library
            else if (option==6)
            {
                break;
            }
            //Failsafe if incorrect value is entered
            else
            {
                System.out.println("Incorrect value entered");
                System.out.println("Would you like to try again?\nEnter 1 for yes, or any other number for no");
                o=in.nextInt();
            }
        }while (o==1||option!=6);//keeps library open until "6" is entered
        System.out.println("The library has how been closed");
        break;
        }
    }
    
}
    }
}