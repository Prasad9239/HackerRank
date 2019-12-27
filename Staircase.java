package com.hackerrank;

import java.util.Scanner;

public class Staircase {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

	private static void staircase(int n) {
		for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(!(j>i)){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

		
	}

}
