package Demo1;

public class QuickCheck
{
    public static void main(String[] args) {
        try {
            int num1=0;
            int num2=20/num1;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by 0");
        }
        finally
        {
            System.out.println("Inside finally");
        }
        System.out.println("THis will be printed");
    }

}
