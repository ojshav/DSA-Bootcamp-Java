package lect_1.Assignment_1;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter a operator:");
        char c = in.next().charAt(0);
        if(c == '+'){
            System.out.println(a+b);
        } else if (c == '-') {
            System.out.println(a-b);
        } else if (c=='*') {
            System.out.println(a*b);
        }
        else if (c=='/'){
            System.out.println(a/b);
        }
    }
}
