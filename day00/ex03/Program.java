import java.util.Scanner;

public class Program
{
    static int checkStr(Scanner sc, String src)
    {
        if (src.equals("week"))
            return (sc.nextInt());
        throw new RuntimeException("illegal argument");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int numbers = 0;
        int index = 0;
        int i = 0;
        while (sc.hasNext())
        {
            int e = 0;
            try
            {
                if (i % 2 == 0)
                {
                    String src = sc.next();
                    if (src.equals("42"))
                        break;
                    index = checkStr(sc, src);
                }
                else{
                    for (int j = 0;j < 5; j++)
                    {
                        int a = sc.nextInt();
                        if (a < e || j == 0)
                            e = a;
                    }
                    for(int k = 1;k < index;k++)
                        e *= 10;
                    numbers += e;
                }
            }
            catch(Exception h){
                System.out.println("illegal arguments");
                System.exit(-1);
            }
            i++;
        }
        i = 1;
        while (numbers > 0)
        {
            int h = numbers % 10;
            numbers /= 10;
            System.out.println("week "+i);
            for (int j = 0; j < h;j++)
                System.out.print("=");
            System.out.println(">");
            i++;
        }
    }
}