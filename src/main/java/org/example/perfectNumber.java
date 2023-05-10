package org.example;
import java.util.*;
public class perfectNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            if (isPerfect(x)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    public static boolean isPerfect(int x) {
        if (x == 0) {
            return true;
        }

        int sum = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }

        return sum == x;
    }
}
