import java.util.Scanner;
public class Main 
{  
public static void main(String[] args)   
{  
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter first number");
int n1 = sc.nextInt();
 System.out.println("Enter Second number");
int n2 = sc.nextInt();
    n1 = ( n1 > 0) ? n1 : -n1;
    n2 = ( n2 > 0) ? n2 : -n2;

    while(n1 != n2) {
        
      if(n1 > n2) {
        n1 -= n2;
      }
      
      else {
        n2 -= n1;
      }
    }
    
    System.out.println("GCD: " + n1);
  }
    
}
