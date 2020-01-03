package com.hackerrank;

import java.util.Scanner;

public class RepeatedString {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

        scanner.close();
    }

	private static long repeatedString(String s, long n) {
		
		int len=s.length();
		
		long repeat=n/len;
		long reminder=n%len;
		System.out.println(reminder);
		int i=0; long acount=0;
		while(i<len){
			if(s.charAt(i)=='a'){
				acount++;
				
			}
			i++;
		}
		
		acount=acount*repeat;
		int j=0;
		while(j<reminder){
			if(s.charAt(j)=='a'){
				acount++;
			}
			j++;
		}
		return acount;
	}

}
