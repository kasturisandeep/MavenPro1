import java.util.*;
import java.lang.Math;

import static java.lang.System.exit;

public class Calculator {

    public static double squareroot_func(double number)
    {
        return Math.sqrt(number);
    }

    public static double factorial_func(double number)
    {
        return (number == 1 || number == 0) ? 1 : number * factorial_func(number - 1);
    }

    public static double log_func(double number)
    {
        return Math.log(number);
    }

    public static double power_func(double number1, double number2)
    {
        return Math.pow(number1, number2);
    }


    public static void main(String[] args)
    {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select an option from the below menu:");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            int opt = sc.nextInt();

            switch(opt)
            {
                case 1:
                    System.out.println("Enter the number: ");
                    double number = sc.nextDouble();
                    System.out.println("The square root of " + number + " is "+  squareroot_func(number));
                    System.out.println();
                    break;

                case 2:
                    int num;
                    System.out.println("Enter the number: ");
                    double number1 = sc.nextDouble();
                    num = (int)Math.floor(number1);
                    if(num == number1)
                    {

                        System.out.println("The factorial of " + num + " is " + factorial_func(number1));
                        System.out.println();
                        break;
                    }
                    else {
                        System.out.println("Enter only positive integers.");
                        System.out.println();
                        break;
                    }

                case 3:
                    System.out.println("Enter the number: ");
                    double number2 = sc.nextDouble();
                    System.out.println("The natural log of " + number2 + " is "+  log_func(number2));
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Enter the base number: ");
                    double number3 = sc.nextDouble();
                    System.out.println("Enter the exponential number: ");
                    double number4 = sc.nextDouble();
                    System.out.println("The power of " + number3 + " to " + number4 + " is "+  power_func(number3, number4));
                    System.out.println();
                    break;

                case 5:
                    exit(0);

                default:
                    System.out.println("Enter the correct option");
                    System.out.println();
            }

        }
    }

}
