package lect_1.Assignment_1;

import java.util.Scanner;

public class Largst_no {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b){
            System.out.println(a+" "+"is larger than"+" "+b);
        } else if (b>a) {
            System.out.println(b+" "+"is larger than"+" "+a);
        }
        else{
            System.out.println("Both number are same");
        }
    }
}
