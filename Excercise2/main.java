import java.util.Scanner;
public class main{
    public static void main(String[] args){
        long option;
        boolean stop=false;
        System.out.println("Welcome to the program.");
        do{
            System.out.println("Which one would you like to use? Enter the corresponding number. \n1. Rectangle Maker\n2. Payment Plan\n3. Calculator\nEnter 1234567890 at any time to quit the program.");
            Scanner in=new Scanner(System.in);
            option=in.nextLong();
            if (option==1){
                long h;//height for loop counterd
                long w;//width for loop counter
                long height=0;
                long width=0;
                System.out.println("This program will create a box of your desired dimensions.");
                System.out.println("Enter height: ");
                height=in.nextLong();
                System.out.println("Enter width: ");
                width=in.nextLong();
                while(height<0||width<0){
                    System.out.println("Enter height: ");
                    height=in.nextLong();
                    System.out.println("Enter width: ");
                    width=in.nextLong();
                    for (h=0;h<height;h++){
                        for (w=0;w<width;w++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    if (height<0||width<0){
                        System.out.println("One or both of the dimensions entered are invalid.");
                    }
                }
            }
            else if (option==2){
                double payment;
                double payment1;
                double remainingpayment;
                double cost;
                System.out.println("This program will show you our payment plans. ");
                System.out.println("Enter cost: ");
                cost=in.nextLong();
                if (cost==1234567890){
                    stop=true;
                    break;
                }
                else{
                    payment1=cost*.15;
                    remainingpayment=((cost-payment1)/4)*1.05;
                    System.out.println("Plan 1");
                    
                    System.out.println("    Payment 1: $"+payment1);
                    System.out.println("    Remaining 4 Payments: $"+remainingpayment);
                    payment1=cost*.2;
                    remainingpayment=((cost-payment1)/9)*1.08;
                    System.out.println("Plan 2");
                    System.out.println("    Payment 1: $"+payment1);
                    System.out.println("    Remaining 9 Payments: $"+remainingpayment);
                    payment1=cost*.1;
                    remainingpayment=((cost-payment1)/11)*1.10;
                    System.out.println("Plan 3:");
                    System.out.println("    Payment 1: $"+payment1);
                    System.out.println("    Remaining 11 Payments: $"+remainingpayment);
                    do{
                        System.out.println("Enter Payment Option");
                        payment=in.nextLong();
                        if (payment==1234567890){
                            stop=true;
                            break;
                        }
                        else if(payment==1){
                            System.out.println("Payments Due:");
                            System.out.println("Payment 1: $"+payment1);
                            System.out.println("Remaining 4 Payments: $"+remainingpayment);
                        }
                        else if(payment==2){
                            System.out.println("Payments Due:");
                            System.out.println("Payment 1: $"+payment1);
                            System.out.println("Remaining 9 Payments: $"+remainingpayment);
                        }
                        else if(payment==3){
                            System.out.println("Payments Due:");
                            System.out.println("Payment 1: $"+payment1);
                            System.out.println("Remaining 11 Payments: $"+remainingpayment);
                        }
                        else{
                            System.out.println("Incorrect value entered.");
                        }
                    }while(payment!=1234567890||payment!=1||payment!=2||payment!=3);
                }
            }
            else if (option==3){
                long oper;
                long num1;
                long num2;
                long answer=1;
                System.out.println("This is the calculator program.\nYou can find the factorial of any number, or the sum, difference, product or quotient of two numbers");
                System.out.println("Choose the corresponding number of your desired operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Factorial");
                oper=in.nextLong();
                do{
                    if (oper==1234567890){
                        stop=true;
                        break;
                    }
                    else if(oper==1){
                        System.out.println("Enter first number: ");
                        num1=in.nextLong();
                        if (num1==1234567890){
                            stop=true;
                            break;
                        }
                        System.out.println("Enter second number: ");
                        num2=in.nextLong();
                        if (num2==1234567890){
                            stop=true;
                            break;
                        }
                        answer=(num1+num2);
                        System.out.println("Answer: "+answer);
                    }
                    else if(oper==2){
                        System.out.println("Enter first number: ");
                        num1=in.nextLong();
                        if (num1==1234567890){
                            stop=true;
                            break;
                        }
                        System.out.println("Enter second number: ");
                        num2=in.nextLong();
                        if (num2==1234567890){
                            stop=true;
                            break;
                        }
                        answer=(num1-num2);
                        System.out.println("Answer: "+answer);
                    }
                    else if(oper==3){
                        System.out.println("Enter first number: ");
                        num1=in.nextLong();
                        if (num1==1234567890){
                            stop=true;
                            break;
                        }
                        System.out.println("Enter second number: ");
                        num2=in.nextLong();
                        if (num2==1234567890){
                            stop=true;
                            break;
                        }
                        answer=(num1*num2);
                        System.out.println("Answer: "+answer);
                    }
                    else if(oper==4){
                        System.out.println("Enter first number: ");
                        num1=in.nextLong();
                        if (num1==1234567890){
                            stop=true;
                            break;
                        }
                        do{
                            System.out.println("Enter second number: ");
                            num2=in.nextLong();
                        }while(num2==0);
                        if (num2==1234567890){
                            stop=true;
                            break;
                        }
                        answer=(num1/num2);
                        System.out.println("Answer: "+answer);
                    }
                    else if(oper==5){
                        System.out.println("Enter number: ");
                        num1=in.nextLong();
                        if (num1==1234567890){
                            stop=true;
                            break;
                        }
                        else{
                            long factorial;
                            if (num1==0){
                                System.out.println("Answer: 1");
                            }
                            else{
                                for (factorial=num1;factorial>0;factorial--){
                                    answer*=factorial;
                                }
                            }
                        }
                        System.out.println("Answer: "+answer);
                    }
                    else{
                        System.out.println("Incorrect value entered");
                    }
                }while(oper!=1234567890||oper!=1||oper!=2||oper!=3||oper!=4||oper!=5);
            }
            else if (option==1234567890){
                stop=true;
            }
            else{
                System.out.println("Incorrect Number Entered");
            }
        }while(stop==false);
    }
}