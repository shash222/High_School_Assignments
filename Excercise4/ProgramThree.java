import java.util.Scanner;
public class PromgramThree{
    public static void main(String[] args){
        String sent;
        String longest;
        String shortest;
        String[] arr=new String[];
        int x;
        int avg;
        int length;
        int words=1;
        Scanner in=new Scanner(System.in);
        sent=in.nextLine();
        length=in.length();
        arr=sent.split(" ");
        for (x=0;x<length;x++){
            if (sent.charAt(x)==' '){
                words++;
            }
        }
        longest=arr[0];
        shortest=arr[0];
        for (x=1;x<words;x++){
            if(arr[x].length()>longest.length()){
                longest=arr[x];
            }
            if(arr[x].length()<shortest.length()){
                shortest=arr[x];
            }
        }
        avg=words/((length+1)-words);
        System.out.println("Words: "+words);
        System.out.println("Average length: "+avg);
    }
}