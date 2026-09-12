package Functions;

import java.util.*;

public class Factorial {
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
        }
        int factorial = 1;
        for(int i = n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        printFactorial(n);
    }
}
