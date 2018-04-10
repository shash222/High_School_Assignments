/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Books;
public class Books{
    String title;
    boolean borrowed=true;

    //Creates a new Book
    public Book(String bookTitle){
        title=bookTitle;
    }

    //Marks the book as rented
    public void borrowed(){
        borrowed=false;
    }

    //Marks the book as not rented
    public void returned(){
        available=true;
    }

    //Returns true if the book is rented, false otherwise
    public boolean isBorrowed(){
        return (available);
    }

    //allows library program to get title of books
    public String getTitle(){
        return (title);
    }
}
