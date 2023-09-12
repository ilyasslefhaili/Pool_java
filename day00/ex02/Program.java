import java.util.Scanner;

public class Program{
    static int sumOfDigit(int number)
    {
        int sum = 0;
        while (number > 0){
          sum += number % 10;
          number /= 10;
        }
        return sum;
    }
    static boolean isprime(int a)
    {
        int i = 2;
        for (;i <= Math.sqrt(a);i++){
            if (a % i == 0)
                return false;
        }
        return true;

    }
    public static void main(String args[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("-> ");
        while (sc.hasNextInt())
        {
            int a = sc.nextInt();
            if (a < 0)
            System.err.println("Invalid arguments.");
            if (isprime(sumOfDigit(a)) == true)
                count++;
            if (a == 42)
                break;
            else
                System.out.print("-> ");
        }
        System.out.println("Count of coffee-request : " + count);
    }
}