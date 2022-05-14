

import java.util.Scanner ;
class Main {
  public static void main(String[] args) {
	    int num,t,s,rem;
             	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number1 ");
                 int  low=sc.nextInt();
        System.out.println("Enter any number2 ");
                 int  high=sc.nextInt();
                 
                 
	     while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
             
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}