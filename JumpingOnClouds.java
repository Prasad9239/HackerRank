package com.hackerrank;

import java.util.Scanner;

public class JumpingOnClouds {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);

        scanner.close();
    }

	private static int jumpingOnClouds(int[] c) {
		int count = -1;
		int n=c.length;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && c[i+2]==0) i++;
        }
		return count;

	}
}
