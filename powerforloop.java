

import java.util.Scanner ;
class Main {
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter base");
    int base = sc.nextInt(); 
    System.out.println("Enter exponent");
   int  exponent = sc.nextInt(); ;

    long result = 1;

   for (; exponent != 0; --exponent) {
      result *= base;
    }

    System.out.println("Answer = " + result);
  }
}
