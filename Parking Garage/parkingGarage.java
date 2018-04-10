import java.util.Scanner;
public class parkingGarage{
    public static void main(String[] args){
        int row=0;
        int column=0;
        int preventskip=0;
        int spotrow;
        int spotcol;
        int choice=0;
        int cars=0;
        boolean empty=true;
        boolean correct=true;
        char columnletter;
        char[][] spot=new char[5][5];
        String[][] nam=new String[5][5];
        String name;
        String redo="";
        String finish="";
        Scanner in=new Scanner(System.in);
        for (spotrow=0;spotrow<5;spotrow++){
            for (spotcol=0;spotcol<5;spotcol++){
                spot[spotrow][spotcol]='E';
            }
        }
        do{
            System.out.println("Welcome to the Parking Garage");
            System.out.println("Enter full name");
            name=in.nextLine().toUpperCase();
            do{
                System.out.println("Would you like to: \n1: View the garage\n2: Park your car\n3: Leave the parking garage\nEnter the number that corresponds to your decision");
                choice=in.nextInt();
                if (choice==1){
                    System.out.println();
                    System.out.println("   A  B  C  D  E");
                    System.out.print("  ---------------");
                    System.out.println();
                    for (spotrow=0;spotrow<5;spotrow++){
                        System.out.print(spotrow+1+": ");
                        for (spotcol=0;spotcol<5;spotcol++){
                            System.out.print(spot[spotrow][spotcol]+"  ");
                        }  
                        System.out.println();
                        System.out.println();
                    }
                }  
                else if (choice==2){
                    System.out.println("Enter number row");
                    row=in.nextInt();
                    if (row!=1&&row!=2&&row!=3&&row!=4&&row!=5){
                        System.out.println("Incorrect row value entered");
                        correct=false;
                    }
                    System.out.println("Enter letter column");
                    columnletter=in.next().charAt(0);
                    if (columnletter!='A'&&columnletter!='B'&&columnletter!='C'&&columnletter!='D'&&columnletter!='E'&&columnletter!='a'&&columnletter!='b'&&columnletter!='c'&&columnletter!='d'&&columnletter!='e'&&correct==true){
                        System.out.println("Incorrect letter value entered");
                        correct=false;
                    }
                    else if (columnletter=='A'||columnletter=='a'){
                        column=0;
                    }
                    else if (columnletter=='B'||columnletter=='b'){
                        column=1;
                    }
                    else if (columnletter=='C'||columnletter=='c'){
                        column=2;
                    }
                    else if (columnletter=='D'||columnletter=='d'){
                        column=3;
                    }
                    else if (columnletter=='E'||columnletter=='e'){
                        column=4;
                    }
                    if (spot[row-1][column]=='E'){
                        spot[row-1][column]='R';
                        nam[row-1][column]=name;
                        System.out.println("Your spot has been reserved. Thank you");
                        cars++;
                    }
                    else{
                        System.out.println("The spot has already been reserved by "+nam[row-1][column]+". Sorry for the inconvenience");
                    }
                }
                else if (choice==3){
                    System.out.println("Enter number row");
                    row=in.nextInt();
                    if (row!=1&&row!=2&&row!=3&&row!=4&&row!=5){
                        System.out.println("Incorrect row value entered");
                        correct=false;
                    }
                    System.out.println("Enter letter column");
                    columnletter=in.next().charAt(0);
                    if (columnletter!='A'&&columnletter!='B'&&columnletter!='C'&&columnletter!='D'&&columnletter!='E'&&columnletter!='a'&&columnletter!='b'&&columnletter!='c'&&columnletter!='d'&&columnletter!='e'&&correct==true){
                        System.out.println("Incorrect letter value entered");
                        correct=false;
                    }
                    else if (columnletter=='A'||columnletter=='a'){
                        column=0;
                    }
                    else if (columnletter=='B'||columnletter=='b'){
                        column=1;
                    }
                    else if (columnletter=='C'||columnletter=='c'){
                        column=2;
                    }
                    else if (columnletter=='D'||columnletter=='d'){
                        column=3;
                    }
                    else if (columnletter=='E'||columnletter=='e'){
                        column=4;
                    }
                    if (spot[row-1][column]=='R'&&nam[row-1][column].equals(name)){
                        spot[row-1][column]='E';
                        nam[row-1][column]="";
                        System.out.println("Your spot has been emptied. Thank you");
                        cars--;
                    }
                    else{
                        if (nam[row-1][column]!=null){
                            System.out.println("The owner's name is: "+nam[row-1][column]);
                            System.out.println("Your name is: "+name);
                        }
                        System.out.println("Either this spot is already empty or you are not the owner of this car.");
                    }
                }
                else{
                    System.out.println("Incorrect value entered");
                }
                System.out.println("Are you finished? Enter 'yes' for yes, or anything else for no.");
                redo=in.next().toUpperCase();
                if (redo.equals("YES")){
                    System.out.println("Thank you for visiting.");
                }
            }while(!redo.equals("YES"));
            preventskip++;
            System.out.println("Would you like to close the garage? Enter 'yes' for yes, or anything else for no.");
            in.nextLine();
            finish=in.nextLine().toUpperCase();
            if (cars!=0){
                System.out.println("Cannot close garage, there are cars still in the parking lot.");
            }
            System.out.println();
        }while(!finish.equals("YES")||cars!=0);
        System.out.println("The garage has been closed.");
    }
}