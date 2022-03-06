package Feb28;

import java.util.*;

public class evenoddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
     
         int evenSum=0;
         int oddSum=0;
         
        while(number!=0)
          {
              int rem=number%10;
              
              if(rem%2==0)
              {
                  evenSum=evenSum+rem;
              }
              else
              {
                  oddSum=oddSum+rem;
              }
              
              number=number/10;
          }
        System.out.println("Sum of even digits: "+ evenSum);
        System.out.println("Sum of odd digits: "+ oddSum);
        sc.close();
    }
}

