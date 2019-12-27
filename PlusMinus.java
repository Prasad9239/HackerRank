package com.hackerrank;

import java.util.Scanner;

public class PlusMinus {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

	private static void plusMinus(int[] arr) {
		int size=arr.length;
		int plus=0,minus=0,zero=0;
		for(int i=0;i<size;i++){
			if(arr[i]>0){
				plus++;
			}else if(arr[i]<0){
				minus++;
			}else{
				zero++;
			}
		}
		double plusratio=(double)plus/size;
		double minusratio=(double)minus/size;
		double zeroratio=(double)zero/size;
		System.out.println(plusratio);
		System.out.println(minusratio);
		System.out.println(zeroratio);
		
	}
}
