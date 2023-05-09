package org.example;
import java.util.*;
public class reverseNumberSum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int revA = reverse_digit(a);
        int revB = reverse_digit(b);
        int sum = revA+revB;
        int revSum = reverse_digit(sum);
        System.out.println(sum);


    }
    public static int reverse_digit(int n)
    {
        // Code here
        int revNum = 0;
        while(n>0){
            revNum = revNum*10+n%10;
            n=n/10;
        }
        return revNum;
    }
}
