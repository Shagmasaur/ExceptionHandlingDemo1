package Demo1;

import java.util.Scanner;

public class ExceptionDemo
{
    public static void main(String[] args)
    {
        int[] age={60,5,89,100,91,4,78,30,32,45};
        Scanner scanner = new Scanner(System.in);

        try
        {
            for(int i=0; i<= age.length; i++)
            {
                System.out.println(age[i]);
            }
            System.out.println("From try block");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index");
            System.out.println(e);
        }

        finally
        {
            System.out.println("will execute if exception occurs or not");
            scanner.close();
        }

        System.out.println("From main method");


    }

}
