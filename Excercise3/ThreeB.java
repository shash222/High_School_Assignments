import java.util.Scanner;
public class ThreeB{
    public static void main(String[] args){
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int f=0;
        int total=0;
        char grade;
        String grad;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Grade. Hit 'z' to quit.")
        grad=in.next();
        grade=grade.charAt(0);
        while(grade!='z'||grade!='Z'){
            if (grade=='a'||grade=='A'){
                a++;
                total++;
            }
            else if (grade=='b'||grade=='B'){
                b++;
                total++;
            }
            else if (grade=='c'||grade=='C'){
                c++;
                total++;
            }
            else if (grade=='d'||grade=='D'){
                d++;
                total++;
            }
            else if (grade=='f'||grade=='F'){
                f++;
                total++;
            }
            else{
                System.out.println("Incorrect grade entered");
            }
            System.out.println("Enter Grade. Hit 'z' to quit.");
        }
        System.out.println("Total grades entered: "+total);
        System.out.println("A's in class: "+a);
        System.out.println("B's in class: "+b);
        System.out.println("C's in class: "+c);
        System.out.println("D's in class: "+d);
        System.out.println("F's in class: "+f);
    }
}