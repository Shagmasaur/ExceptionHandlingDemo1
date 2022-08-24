package Demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSample
{
    public static void main(String[] args)
    {
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");

        while (flag) {

            try
            {
                int number = scanner.nextInt();
                System.out.println(number);
                flag=false;

            }

            catch (InputMismatchException e)
            {
                System.out.println(e);
                System.out.println("Enter integer value");
                scanner.nextLine();
            }
        }
    }
}
