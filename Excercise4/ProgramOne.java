import java.util.Scanner;
public class PromgramOne{
    public static void main(String[] args){
        String sent;
        boolean pal=true;
        int length;
        int x;
        int y;
        Scanner in=new Scanner(System.in);
        sent=in.nextLine();
        length=sent.length();
        y=length;
        for(x=0;x<length;x++){
            System.out.println(sent.charAt(x)+"   "+sent.charAt(y));
            if (sent.charAt(x)!=sent.charAt(y)){
                pal=false;
            }
            y--;
        }
        if (pal==true){
            System.out.println("Yes, your word is a palindrome");
        }
        else{
            System.out.println("No, sorry your word is not a palindrome");
        }
    }
}