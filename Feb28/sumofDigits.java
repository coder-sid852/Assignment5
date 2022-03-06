package Feb28;
import java.util.*;

public class sumofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
     
         int Sum=0;
         
        while(number!=0)
          {
              int rem=number%10;
              
              Sum+=rem;
              number=number/10;
          }
        System.out.println("Sum of digits: "+Sum);
        sc.close();
    }
}

