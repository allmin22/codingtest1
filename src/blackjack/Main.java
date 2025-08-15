package blackjack;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, m;
        n = scan.nextInt();
        m = scan.nextInt();
        int[] num = new int[n];
        for (int i=0; i<n; i++) {
            num[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=j+1; k<n; k++) {
                    if ((num[i]+num[j]+num[k]) <= m) {
                        if ((num[i]+num[j]+num[k]) > sum) {
                            sum = num[i]+num[j]+num[k];
                        }
                    }
                }
            }
        }

        System.out.println(sum);
        scan.close();
    }
}