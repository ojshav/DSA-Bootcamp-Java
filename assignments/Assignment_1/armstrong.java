package lect_1.Assignment_1;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
         for (int i = num1;i<num2;i++){
             int chck,rem,sum=0;
             chck =i;
             while(chck!=0)
         {
                 rem = chck%10;
                 sum = sum +(rem* rem* rem);
                 chck = chck/10;
             }
if (sum ==i){
    System.out.println(i+" "+"Is a palindrom number");
}
         }
    }
}
