package Mar2;

import java.util.Scanner;

public class Truncate {
        public static String truncateSentence(String s, int k) {
            
            String[] arr = s.split(" ");
            StringBuilder sb = new StringBuilder();
    
            for (int i = 0; i < k; i++) {
                sb.append(arr[i] + " ");
            }
            return sb.toString().trim();
    
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int k = sc.nextInt();
            String str1 = truncateSentence(s, k);
            System.out.println(str1);
            sc.close();
        }
    
    
}
