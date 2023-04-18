package lect_1.Assignment_1;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input  =new Scanner(System.in);
        System.out.println("Enter a name ");
        String name = input.nextLine();
        System.out.println(name+" "+"Welcome to the Java Bootcamp");
    }
}
