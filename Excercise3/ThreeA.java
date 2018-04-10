import java.util.Scanner;
public class ThreeA{
    public static void main(String[] args){
        int total=0;
        int row;//row number
        int opt;//option desired
        int veh=0;//vehicle counter
        int fee=0;//LEVEL 2
        char [] spot=new char[9];
        Scanner in=new Scanner(System.in);
        for (row=0;row<9;row++){
            spot[row]='E';
        }
        System.out.println();
        System.out.println("Welcome to the Parking Garage.There is a $25 parker's fee.\nWould you like to: \n1. View Garage\n2. Park Car\n3. Remove Car");
        opt=in.nextInt();
        do{
            System.out.println(opt);
            if (opt==1){
                for (row=0;row<9;row++){
                    System.out.print(spot[row]+" ");
                }
                System.out.println();
            }
            else if (opt==2){
                System.out.println("What row would you like to park in?(1-9)");
                row=in.nextInt()-1;
                if (spot[row]=='O'){
                    System.out.println("Sorry but this spot is already occupied");
                }
                else{
                    System.out.println("Your spot is now occupied");
                    spot[row]='O';
                    veh++;
                }
            }
            else if (opt==3){
                System.out.println("What row would you like to remove your car from?(1-9)");
                row=in.nextInt()-1;
                if (spot[row]=='E'){
                    System.out.println("No vehicles in this spot.");
                }
                else{
                    System.out.println("Your spot has now been emptied.\nPlease pay your $25 parking fee.\nThank you for using the Parking Garage.");
                    spot[row]='E';
                    veh--;
                    total+=25;//LEVEL 2
                }
            }
            else if (opt==4){
                if (veh>0){
                    System.out.println("Cannot close garage, there are still cars in the lot. ");
                }
                else{
                    System.out.println("The garage has been closed.");
                }
            }
            else{
                System.out.println("Incorrect option entered. What would you like to do?\nWould you like to: \n1. View Garage\n2. Park Car\n3. Remove Car\nEnter 4 to close the garage");
           }
            System.out.println("What would you like to do next?\nWould you like to: \n1. View Garage\n2. Park Car\n3. Remove Car\nEnter 4 to close the garage");
            opt=in.nextInt();
       }while(opt!=4||veh!=0);
       System.out.println("Total Earned: "+total);//LEVEL 2
    }
}