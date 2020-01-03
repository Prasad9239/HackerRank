package com.hackerrank;

import java.util.Scanner;

public class CountingValleys {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);
        scanner.close();
    }

	private static int countingValleys(int n, String s) {
		int v = 0;     
        int lvl = 0;
		for(char c : s.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;
            
            if(lvl == 0 && c == 'U')
                ++v;
        }
        System.out.println(v);
		return v;

	}
}
