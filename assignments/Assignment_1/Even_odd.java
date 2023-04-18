package lect_1.Assignment_1;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println(num+" "+ "is an Even Number");
        }
        else {
            System.out.println(num+" "+ "is a Odd Number");
        }
    }
}
