package Feb28;
public class Armstrong {
    public static void main(String[] args) {
        int i,a,b,c,d,e;
        for(i = 100; i<=500; i++){
            a=i/10;
            b=i%10;
            c=a/10;
            d=a%10;
            b=b*b*b;
            c=c*c*c;
            d=d*d*d;
            e=b+c+d;
            if(i==e)
            {
                System.out.println(i);
                
            }  
        }
}
}