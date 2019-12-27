package com.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Candles {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

       System.out.println(result);

        scanner.close();
    }

	private static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int count=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]==ar[ar.length-1]){
				count++;
			}
		}
		return count;
	}

}
