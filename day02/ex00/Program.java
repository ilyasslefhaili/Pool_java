import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import javax.naming.spi.DirStateFactory.Result;

public class Program{
    static String hex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte aByte : bytes) {
            result.append(String.format("%02x", aByte));
            result.append(" ");
        }
        return result.toString().substring(0, result.length() - 1);
    }
    public static void main(String [] args)
    {
        try{
            FileInputStream file = new FileInputStream("signature.txt");
            Vector<String> l = readSignature.fileInVector(file);
            HashMap<String, String> m = ParseFile.fileInMap(l);
            FileOutputStream fos = new FileOutputStream("Result.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("PROCESSED");
            System.out.print("->");
            while (sc.hasNext())
            {
                System.out.println("PROCESSED");
                System.out.print("->");
                String filetoread = sc.next();
                if (filetoread.equals("42"))
                    break;
                FileInputStream target = new FileInputStream(filetoread);
                byte [] b = new byte[4];
                target.read(b);
                String str = hex(b);
                byte [] a = m.get(str).getBytes();
                fos.write(a);
                fos.write('\n');
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }     
    }
}