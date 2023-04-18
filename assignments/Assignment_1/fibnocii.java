package lect_1.Assignment_1;

import java.util.Scanner;

public class fibnocii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f0 = 0;
        int f1 = 1;
        int f2;
        System.out.println("Enter the n value");
        int n = in.nextInt();
        System.out.println(f0);
        System.out.println(f1);
      for (int i=2;i<n;++i){
            f2 = f0+f1;
          System.out.println(f2);
          f0 = f1;
          f1 = f2;
      }


    }
}
