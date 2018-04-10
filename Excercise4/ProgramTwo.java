import java.util.Scanner;
public class ProgramTwo{
    public static void main(String[] args){
        int length;
        int space=1;
        int letters;
        String sent;
        String word;
        String[] words;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Sentence");
        sent=in.nextLine();
        length=sent.length();
        words=sent.split(" ");
        for (int x=0;x<length;x++){
            if (sent.charAt(x)==' '){
                space++;
            }
        }
        for (int x=0;x<space;x++){
            word=words[x];
            letters=word.length();
            words[x]=word.charAt(0)+"PIG"+word.substring(1,(letters));
            System.out.println(words[x]);
        }
    }
}