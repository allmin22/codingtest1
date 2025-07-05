package palindrome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int res = 1;
        int j = word.length()-1;
        for (int i=0; i<word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(j-i)) {
                res = 0; 
                break;
            }
        }

        System.out.println(res);
        scan.close();
    }
}