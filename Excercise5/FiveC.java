import java.util.Scanner;
public class FiveC{
    public static double CalcAverage(int mid, int finalgrade){
        double avg=(mid+finalgrade)/2;
        return avg;
    }
    
    public static char GradeConvert(double avg){
        char letter='A';
        if (avg>=0&&avg<=64){
            letter='F';            
        }
        else if (avg>=65&&avg<=69){
            letter='D';            
        }
        else if (avg>=70&&avg<=79){
            letter='C';            
        }
        else if (avg>=80&&avg<=89){
            letter='B';
        }
        else if (avg>=90&&avg<=100){
            letter='A';
        }
        return letter;
    }
    
    public static void PrintRecord(String code, String name, double avg, char grade){
        System.out.println("Course: "+code);
        System.out.print("Student: "+name+"        Numeric Average: "+avg+"       Letter Grade: "+grade);
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String code, student="";
        int mid, fin, number;
        double avg;
        char lettergrade;
        System.out.println("Enter class code: ");
        code=in.nextLine();
        System.out.println("How many students' grades do you want to enter?");
        number=in.nextInt();
        double[] grades=new double[number];
        String[] name=new String[number];
        char[] letter=new char[number];
        for (int x=0;x<number;x++){
            System.out.println("Enter student name: ");
            student=in.next();
            System.out.println("Enter "+student+"'s midterm grade");
            mid=in.nextInt();
            System.out.println("Enter "+student+"'s final grade");
            fin=in.nextInt();
            avg=CalcAverage(mid,fin);
            lettergrade=GradeConvert(avg);
            grades[x]=avg;
            name[x]=student;
            letter[x]=lettergrade;
        }
        for (int x=0;x<number;x++){
            System.out.println("Student: "+student);
            PrintRecord(code,name[x],grades[x],letter[x]);
        }
    }
}