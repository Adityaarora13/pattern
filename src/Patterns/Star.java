package Patterns;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1,star=1,space=n-1;
        while(row<=n){
            int j=1;
            while (j<=space){
                System.out.print("  ");j++;
            }
            int i=1;
            while (i<=star){
                System.out.print("* ");i++;
            }
            space--;
            star++;
            row++;
            System.out.println();
        }
    }
}
