package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double n, a=0, b=0, c;
        System.out.println("Input n: ");
        n = num.nextInt();
        for (int x = 1; x<101; x++){
           a=Math.pow(a,n);
        }
        for (int y = 1; y<101; y++) {
            b=Math.pow(b,n);
        }
        for (int z = 1; z<101; z++) {
            c = Math.pow(c, n);
        }
        c=a+b;
            if(n>=1) {
           System.out.print(c);
            }
              else if (n<0) {
            System.out.print("Error!!");
            }
    }
}

