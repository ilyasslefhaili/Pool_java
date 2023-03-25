import java.util.Stack;

class Syncro{
    static Stack<Integer> stack = new Stack<Integer>() ;
    synchronized static void print(String a){
        System.out.println(a);
    }
    private Syncro(){}
}