public class program {

  public static void main(String[] args) {
  	int number = 479598 ;// u can change the value
    int a = 0;
    while (number > 0){
      a += number % 10;
      number /= 10;
    }
    System.out.println(a);
  }
  
}