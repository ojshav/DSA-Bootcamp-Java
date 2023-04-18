package lect_1.Assignment_1;

import java.util.Scanner;

public class Simple_Intreset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal:");
        double p = input.nextDouble();
        System.out.println("Enter the rate: ");
        float r = input.nextFloat();
        System.out.println("Enter the Time:");
        int t = input.nextInt();
        double si = (p*r*t)/100;
        System.out.println("Simple intrest is : "+ si);
    }
}
