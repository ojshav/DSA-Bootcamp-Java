package lect_1.Assignment_1;

import java.util.Scanner;

public class Currncy_converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the money in indain Rupees");
        int inr  = in.nextInt();
        float dollar = (float) (inr * 0.012);
        System.out.println(dollar+" "+"Is the money in dollar");
    }
}
