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
int gcd=1;

    for(int i = 1; i <= n1 && i <= n2; ++i) {
      
      if(n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    int lcm = (n1 * n2) / gcd;
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  }
}
