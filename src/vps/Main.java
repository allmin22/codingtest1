package vps;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        String[] word = new String[count];
        for (int i=0; i<count; i++) {
            word[i] = scan.next();
        }
        scan.close();

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<count; i++) {
            int j = 0;
            int flag = 1;
            while(j<word[i].length()) {
                if (word[i].charAt(j) == '(') stack.push('(');
                else if(word[i].charAt(j) == ')') {
                    if (stack.empty()) {
                        flag = 0;
                        break;
                    }
                    stack.pop();
                }
                j++;
            }
            if (flag == 1 && stack.empty()) System.out.println("YES");
            else System.out.println("NO");
            stack.clear();
            flag = 1;
        }
    }
}