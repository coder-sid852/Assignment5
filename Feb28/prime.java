package Feb28;

public class prime {
    public static void main(String[] args) {
        int n = 100;
        int count;
        for (int j = 0; j < n; j++) {
            count=0;
            for(int i = 2; i<=j/2; i++){
                if(j%i == 0){
                count++;
                }
            }
            if(count==0){
            System.out.println(j);
            }
        }
    }
}
