package stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        Stack stack = new Stack(size);

        for (int i=0; i<size; i++) {
            String op = scan.next();
            if (op.equals("push")) {
                int data = scan.nextInt();
                stack.push(data);
            } 
            else if (op.equals("pop")) {
                int data = stack.pop();
                System.out.println(data);
            }
            else if (op.equals("size")) {
                int data = stack.size();
                System.out.println(data);
            }
            else if (op.equals("empty")) {
                if(stack.empty()) System.out.println("1");
                else System.out.println("0");
            }
            else if (op.equals("top")) {
                int data = stack.top();
                System.out.println(data);
            }
        }
        scan.close();
    }

    public static class Stack {
        private int max;
        private int[] data;
        private int top = 0;

        Stack(int size) {
            max = size;
            data = new int[size];
        }

        public void push(int val) {
            if(full()) return;
            data[top++] = val;
        }

        public int pop() {
            if(empty()) return -1;
            int val = data[--top];
            return val;
        }

        public boolean empty() {
            return top == 0;
        }

        public boolean full() {
            return top == max;
        }

        public int size() {
            int size = top;
            return size;
        }

        public int top() {
            if(empty()) return -1;
            int val = data[top-1];
            return val;
        }
    }
}
