package Feb28;

import java.util.Scanner;

public class tenValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int value = sc.nextInt();
            sum += value;
        }
        System.out.println(sum/10);
        sc.close();
    }
}
