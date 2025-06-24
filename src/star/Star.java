package star;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        Star mymain = new Star();
        mymain.run();
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        makeStar(num);
        scan.close();
    }

    public void makeStar(int size) {
        int space = size-1;
        int star = 1;
        for (int i=0; i<size; i++) {
            for (int j=0; j<space; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<star; j++) {
                System.out.print("*");
            }
            space--;
            star += 2;
            System.out.println();
        }
        
        space = 1;
        star = star - 4;
        for (int i=0; i<size-1; i++) {
            for (int j=0; j<space; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<star; j++) {
                System.out.print("*");
            }
            space++;
            star -= 2;
            System.out.println();
        }
    }

}