import java.util.Scanner;
public class main{
    public static void main(String[] args){
        String[] names=new String[5];
        String[] town=new String[5];
        String[] team=new String[5];
        String name;
        int space;
        int length;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 5 school teams");
        for (int x=0;x<5;x++){
            name=in.nextLine();
            names[x]=name;
            space=name.indexOf(" ");
            length=name.length();
            town[x]=name.substring(0,space);
            team[x]=name.substring(space+1,length);
        }
        for (int x=4;x>=0;x--){
            System.out.println(town[x]);
        }
        for (int x=4;x>=0;x--){
            System.out.println(team[x]);
        }
    }
}