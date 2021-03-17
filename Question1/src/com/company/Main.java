package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Pattern:");
        int n = sc.nextInt();
        int space = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < space; j++){
                System.out.print("  ");
            }
            space--;
            for(int j = 0; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        space = n;
        char a = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 0; j < space; j++){
                System.out.print("  ");
            }
            space--;
            for(int j = 0; j <= i; j++){
                System.out.print(a++ + " ");
                if(a > 'Z'){
                    a = 'A';
                }
            }
            System.out.println();
        }
    }
}
