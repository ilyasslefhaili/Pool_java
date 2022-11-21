import java.util.HashMap;
import java.util.Vector;

class ParseFile{

    static HashMap<String , String> fileInMap(Vector<String> vec)
    {
        HashMap<String, String> vtoM = new HashMap<String, String>();
        for (int i = 0;i < vec.size(); i++)
        {
            String [] rSplit;
            rSplit = vec.get(i).split(",");
            vtoM.put(rSplit[0], rSplit[1]);
        }
        return vtoM;
    }
}