package sugar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int count = 0;
        while (n >= 5) {
            n -= 5;
            count++; 
        }
        
        int size = count;
        if (n != 0) {
            for (int i=0; i<=size; i++) {
                while (n >= 3) {
                    n -= 3;
                    count++;
                }
                if (n == 0) {
                    break;
                }
                n += 5;
                count--;
            }
        }

        scan.close();

        if (n != 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(count);
        
    }
}