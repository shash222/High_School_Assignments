package account;

public class Account {
    String name;
    int number;
    double balance;
    String type;
    double total;
    boolean status;
    
    public Account (String nam, int num, double bal, String typ){
        name=nam;
        number=num;
        balance=bal;
        type=typ;
    }
    
    public void Print(){
        System.out.println("Account Holder: "+name);
        System.out.println("    Account Number: "+number);
        System.out.println("    Account Balance: $"+balance);
        System.out.println("    Account Type: "+type);
    }
    
    public void deposit(double z){
        balance+=z;
        total+=z;
        System.out.println("Thank you for choosing our bank\nHave a nice day!");
    }

    public void withdraw(double z){
        balance-=z;
        total-=z;
        System.out.println("Thank you for choosing our bank\nHave a nice day!");
    }

    public void total(){
        System.out.println("Total bank's holdings: $"+total);
    }
    
    public double getBal(){
        return (balance);
    }
    
    public void add(){
        System.out.println("You are witdrawing more than you have in your account.\nFor this, you will incur a $35 debt");
        balance-=35;
    }
    
    public boolean isOverDrawn(){
        if (getBal()<0)
        {
            status=true;
        }
        else
        {
            status=false;
            System.out.println("This account is not overdrawn");
        }
        return (status);
    }
}
