package maxcount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String capStr = str.toUpperCase();

        scan.close();

    
        int[] alph = new int[26];

        for (int i=0; i<capStr.length(); i++) {
            alph[capStr.charAt(i) - 'A'] ++;
        }

        int max = 0;
        int idx = 0;
        for (int i=0; i<26; i++) {
            if (alph[i] > max) {
                max = alph[i];
                idx = i;
            }
        }

        for (int i=0; i<26; i++) {
            if (alph[i] == max) {
                if (idx != i) {
                    System.out.println("?");
                    return;
                }
            }
        }

        System.out.println((char)(idx + 'A'));
    }
}