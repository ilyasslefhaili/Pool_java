import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Vector;

public class Program{
    public static void main(String [] args)
    {
        try{
            FileInputStream file = new FileInputStream("signature.txt");
            Vector<String> l = readSignature.fileInVector(file);
            HashMap<String, String> m = ParseFile.fileInMap(l);
            System.out.println(m);
            
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }     
    }
}