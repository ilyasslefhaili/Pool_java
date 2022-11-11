public class program {

  public static void main(String[] args) {
  	int number = 479598;
    String str = Integer.toString(number);
    int a = 0;
    for (int i = 0;i < str.length();i++)
      a += Character.getNumericValue(str.charAt(i));
    System.out.println(a);
  }
  
}