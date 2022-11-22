import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Vector;

class readSignature{
    static String readLine(Scanner sc)
    {
        return (sc.nextLine());
    }
    static Vector<String> fileInVector(FileInputStream file)
    {
        Vector<String> fileInVec = new Vector<String>();
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            fileInVec.add(readLine(sc));
        return fileInVec;
    }
}