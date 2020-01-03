package com.hackerrank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        scanner.close();
    }

	private static int sockMerchant(int n, int[] ar) {
		int temp=0;
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=i+1;j<n;j++){
				if(ar[i]==ar[j]){
					count++;
				}
			}
			if(count%2 !=0){
				temp++;
			}
		}
		System.out.println(temp);
		
		return temp;
	}

}
