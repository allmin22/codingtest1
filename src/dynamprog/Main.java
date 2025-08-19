package dynamprog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int testcase = scan.nextInt();

        int[] dp = new int[12];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i=4; i<12; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; 
        }

        for (int i=0; i<testcase; i++) {
            int n = scan.nextInt();
            System.out.println(dp[n]);
        }

        scan.close();
    }
}