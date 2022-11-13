import java.util.Scanner;

public class Program{
    static int sumOfDigit(int number)
    {
        String str = Integer.toString(number);
        int a = 0;
        for (int i = 0;i < str.length();i++)
          a += Character.getNumericValue(str.charAt(i));
        return (a);
    }
    static boolean isprime(int e)
    {
        int a = sumOfDigit(e);
        if (a <= 1)
            System.exit(-1);
        int nee = 0;
        for (int i = 2; i <= Math.sqrt(a) + 1; i++)
        {
            nee++;
            if (a % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("->");
            while (sc.hasNextInt())
            {
                int a = sc.nextInt();
                if (isprime(a) == true)
                    count++;
                if (a == 42)
                    break;
                else
                    System.out.print("->");
            }
        }catch(Exception e)
        {
            System.out.println("invalid argument");
        }
        System.out.println("Count of coffee-request -" + count);
    }
}