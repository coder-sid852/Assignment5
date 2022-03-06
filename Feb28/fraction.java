package Feb28;

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int dr= sc.nextInt();
        int a, b, gcd, temp;
        if(nr>dr){
            a= nr;
            b=dr;
        }else{
            b=nr;
            a=dr;
        }
        while(b!=0){
            temp=b;
            b= a%b;
            a=temp;
        }
        gcd=a;
        System.out.println("The lowest form : "+nr/gcd+"/"+dr/gcd);
        sc.close();
        
    }
}
