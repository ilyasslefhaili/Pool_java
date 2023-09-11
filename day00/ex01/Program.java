import java.util.Scanner;

public class Program{
    static void isprime(int a)
    {
        int i = 2;
        for (;i <= Math.sqrt(a);i++){
            if (a % i == 0){
                System.out.println("false " + (i - 1));
                return ;
            }
        }
        System.out.println("true " + (i - 1));

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("-> ");
        int number = sc.nextInt();
        if (number <= 1){
            System.err.println(" IllegalArgument");
            System.exit(1);
        }
        isprime(number);
        sc.close();
        
    }
}