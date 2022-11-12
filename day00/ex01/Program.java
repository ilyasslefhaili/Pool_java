import java.util.Scanner;

public class Program{
    static void isprime(int a)
    {
        if (a <= 1)
            System.exit(-1);
        int e = a/2;
        int nee = 0;
        for (int i = 2; i <= Math.sqrt(a) + 1; i++)
        {
            nee++;
            if (a % i == 0)
            {
                System.out.println("true "+nee);
                return;
            }
        }
        System.out.println("true "+nee);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter a number : ");
            int a = sc.nextInt();
            isprime(a);
        }
        catch(Exception e){
            System.out.println("Illegal Argument");
            System.exit(-1);
        }
    }
}