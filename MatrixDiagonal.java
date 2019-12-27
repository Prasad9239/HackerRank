package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixDiagonal {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int n=sc.nextInt();
			List<List<Integer>> arr = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				String input =sc.next();
	            String[] arrRowTempItems = input.split(",");

	            List<Integer> arrRowItems = new ArrayList<>();

	            for (int j = 0; j < n; j++) {
	                int arrItem = Integer.parseInt(arrRowTempItems[j]);
	                arrRowItems.add(arrItem);
	            }

	            arr.add(arrRowItems);
	        }
			MatrixDiagonal Result=new MatrixDiagonal();
			int result = Result.diagonalDifference(arr);
			System.out.println(result);
			sc.close();
		}

		private int diagonalDifference(List<List<Integer>> arr) {
			List<Integer> one=arr.get(0);
			int sum1=0,sum2=0;
			for(int i=0;i<one.size();i++){
				sum1=sum1+(arr.get(i)).get(i);
				sum2=sum2+(arr.get(i)).get(one.size()-1-i);
				System.out.println(sum1+" "+sum2);
			}
			
			
			return 0;
		}

}
