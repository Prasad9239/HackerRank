package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

	private static void miniMaxSum(int[] arr) {
		int[] out=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int min=0;
			for(int j=0;j<arr.length;j++){
				if(!(i==j)){
					min=min+arr[j];
				}
			}
			out[i]=min;
		}
		Arrays.sort(out);
		System.out.println(out[0]+" "+out[arr.length-1]);
		
	}

}
