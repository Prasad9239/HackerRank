package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotLeft {

	/*
	 * public static void main(String[] args) { int[] arr={1,2,3,4,5}; int[]
	 * out=new int[arr.length]; List<Integer> list=new ArrayList<>(); for(int
	 * i=0;i<arr.length;i++){ list.add(arr[i]); } Collections.rotate(list,
	 * list.size()-4); for(int i=0;i<list.size();i++){ out[i]=list.get(i); }
	 * 
	 * }
	 */
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		scanner.close();
	}

	private static int[] rotLeft(int[] a, int d) {
		int[] out=new int[a.length]; 
		List<Integer> list=new ArrayList<>(); 
		for(int i=0;i<a.length;i++){ 
			list.add(a[i]); 
			} 
		Collections.rotate(list, list.size()-4); 
		for(int i=0;i<list.size();i++){ 
			out[i]=list.get(i);
		}
		return out;
	}

}
