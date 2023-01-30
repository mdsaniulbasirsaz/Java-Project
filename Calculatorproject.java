/* Md Saniul Basir Saz
   Departmnet of Computer Science and Engineering 
   Jashore University of Science and Technology -JUST
   Student Id: 200103
   Date: 30/01/2023
   Second Year ,First Semester
   Time: 9:25 PM
 */
import java.util.Scanner;
import java.lang.Math;

public class Calculatorproject{

    public static void main(String[] args) {
        
        Scanner scc = new Scanner(System.in);

        System.out.println("                                        -----------------------------------------                                 ");
        System.out.println("                                                    Basic Calculator");
        System.out.println("                                        -----------------------------------------                                 ");

        System.out.println("Here Are Your Options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Module");
        System.out.println("6. Square Root");
        System.out.println("7. Square");
        System.out.println("8. Absulate Value");
        System.out.println("9. Factorial");

        System.out.println("\nWhat Would You Like To Do?:");
        int choice = scc.nextInt();

        if(choice==1)
        {
            addition();
        }
        else if(choice==2)
        {
            subtraction();
        }
        else if(choice==3)
        {
            multiplication();
        }
        else if(choice==4)
        {
            divisions();
        }
        else if(choice==5)
        {
            module();
        }
        else if(choice==6)
        {
            squareRoot();
        }
        else if(choice==7)
        {
            square();
        }
        else if(choice==8)
        {
            absvalue();
        }
        else if(choice==9)
        {
            factorial();
        }
        else
        {
            System.out.println("Invalid Your Choice....[Please Try Again]");
        }


    }
    public static void addition()
    {
        System.out.println("Choice Your Option:");
        System.out.println("\n1. Sum of Two numbers");
        System.out.println("2. Sum of Three Numbers");
        System.out.println("3. Sum of Multiple Numbers");
    
        Scanner scc=new Scanner(System.in);
        int n=scc.nextInt();
        if(n==1)
        {
            System.out.println("\nEnter Your First Number:");
            int a=scc.nextInt();
            System.out.println("Enter Your Second Number:");
            int b=scc.nextInt();
            System.out.println("Sum = "+(a+b));
        }
        else if(n==2)
        {
            System.out.println("\nEnter Your First Number:");
            int a=scc.nextInt();
            System.out.println("Enter Your Second Number");
            int b=scc.nextInt();
            System.out.println("Enter Your Third Number");
            int c=scc.nextInt();
            System.out.println("Sum = " +(a+b+c));

        }
        else if(n==3)
        {
            System.out.println("\nEnter Your Any Positive Number:");
            int a=scc.nextInt();
            int s=0;
            for(int i=0;i<=a;i++)
            {
                s+=i;
            }

            System.out.println("Sum = " +(s));
        }

    }
    public static void subtraction()
    {
        Scanner scc=new Scanner(System.in);
        System.out.println("\nEnter Your First Number:");
        int a=scc.nextInt();
        System.out.println("Enter Your Second Number:");
        int b=scc.nextInt();
        System.out.println("Your Ans = "+(a-b));
    }
    public static void multiplication()
    {
        System.out.println("\nChoice Your Option:");
        System.out.println("1. Multiplication of Two Number");
        System.out.println("2. Multiplication of N Number");
        Scanner scc=new Scanner(System.in);
        int n=scc.nextInt();
        if(n==1)
        {
            System.out.println("\nEnter Your First Number:");
            int a=scc.nextInt();
            System.out.println("Enter Your Second Number:");
            int b=scc.nextInt();
            System.out.print("Your Ans = "+(a*b));
        }
        if(n==2)
        {
            System.out.println("[System Pending .... Please Wait ...]");
        }
    }
    //Divisions
    public static void divisions()
    {
      Scanner scc=new Scanner(System.in);
      System.out.println("\nEnter Your First Number:");
      float a=scc.nextFloat();
      System.out.println("Enter Your Second Number:");
      float b=scc.nextFloat();
      float c=a/b;
      System.out.println("Your Ans = "+ c);
    }
    //Module
    public static void module()
    {
        Scanner scc=new Scanner(System.in);
        System.out.println("\nEnter Your First Number:");
        int a=scc.nextInt();
        System.out.println("Enter Your Second Number:");
        int b=scc.nextInt();
        int c=a%b;
        System.out.println("Your Ans = "+ c);
    }
    //Square Root
    public static void squareRoot()
    {
        Scanner scc=new Scanner(System.in);
        System.out.println("\nEnter Your Number:");
        double a=scc.nextDouble();
        System.out.println("Your Ans = "+ Math.sqrt(a));

    }

    //Square
    public static void square()
    {
        Scanner scc = new Scanner(System.in);
        System.out.println("\nEnter Your Number:");
        double a=scc.nextDouble();
        System.out.println("Your Ans = "+Math.pow(a,2));
    }

    //Absulate Value
    public static void absvalue()
    {
        Scanner scc = new Scanner(System.in);
        System.out.println("\nEnter Your First Number:");
        double a=scc.nextDouble();
        System.out.println("Enter Your Second Number:");
        double b=scc.nextDouble();
        System.out.println("Your Ans = "+ (Math.abs(a)+Math.abs(b)));   
    }

    //factorial
    public static void factorial()
    {
        Scanner scc = new Scanner(System.in);
        System.out.println("\nEnter Your Any Positive Number:");
        int n=scc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Your Ans = "+ fact);
        
    }

}
