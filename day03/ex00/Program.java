import java.io.*;
import java.util.*;

public class Program{
    public static void main(String [] args)
    {
        if (args.length != 1){
            System.err.println("error");
            System.exit(1);
        }
        String str = args[0].substring(2);
        Hen hen = new Hen();
        Egg egg = new Egg();
        egg.start();
        hen.start();
        String [] a = str.split("=");
        int count = Integer.parseInt(a[1]);
        for(int i = 0; i < count; i++)
            System.out.println("Human");
        System.exit(0);
    }
}