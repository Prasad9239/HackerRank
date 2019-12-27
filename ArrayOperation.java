package com.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayOperation {

	public static void main(String[] args) {
		// Sorting without using inbuilt
		int[] array = { 45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8 };
		int length = array.length;
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		// Sorting with inbuilt
		int[] array2 = { 45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8 };
		Arrays.sort(array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println("");
		// Finding duplicates in array
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		for (int i = 0; i < arr.length; i++) {
			int temp1 = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp1++;
				}
			}
			if (temp1 != 1) {
				System.out.println(arr[i] + " " + temp1);
			}
		}
		// Copying array
		int[] array3 = { 45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8 };
		int[] array4 = new int[array3.length];
		for (int i = 0; i < array3.length; i++) {
			array4[i] = array3[i];
		}
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println("");
		
		// Frequency of each element
		int[] arr2 = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int[] fr = new int[arr2.length];
		int visited = -1;
		for (int i = 0; i < arr2.length; i++) {
			int temp3 = 1;
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] == arr2[j]) {
					temp3++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited) {
				fr[i] = temp3;
			}

		}
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
		}
		
		System.out.println("");
		//Rotate Array 
		String [] arr3 = {"practice","code","quiz","geeksforgeeks"};
		int n=3;
		String[] arr4=new String[arr3.length];
		List<String> list=Arrays.asList(arr3);	
		Collections.rotate(list, 3);
		arr4=(String[]) list.toArray();
		for(int i=0;i<arr4.length;i++){
			System.out.print(arr4[i]+" ");
		}
		System.out.println("");
		System.out.println("even");
		//elements in even and odd position
		 int [] arr5 = {1, 2, 3, 4, 5};  
		 for(int i=1;i<arr5.length;i=i+2){
			 System.out.print(arr5[i]+" ");
			 
		 }
		 System.out.println("");
		 System.out.println("odd");
		 for(int i=0;i<arr5.length;i=i+2){
			 System.out.print(arr5[i]+" ");
			 
		 }
		 
		 //largest adn smallest number
		 int [] arr6 = new int [] {25, 11, 7, 75, 56};  
		 Arrays.sort(arr6);
		 System.out.println("");
		 System.out.println("largest number "+arr6[arr6.length-1]);
		 System.out.println("smallest number "+arr6[0]);
		 
		 //Remove duplicates in array
		 System.out.println("");
		 int[] arr7={10,20,20,30,30,40,50,50};
		 int[] arr8=new int[arr7.length];
		 int vist=-1;
		 for(int i=0;i<arr7.length;i++){
			 for(int j=i+1;j<arr7.length;j++){
				 if(arr7[i]==arr7[j]){
					 arr7[j]=vist;
				 }
			 }
		 }
		 int nextIndex = 0;
		 for(int i=0;i<arr7.length;i++){
			 if(arr7[i]!=vist){
				 arr8[nextIndex]=arr7[i];
				 nextIndex++;
			 }
		 }
		 for(int i=0;i<arr8.length;i++){
			 if(arr8[i]!=0){
			 System.out.print(arr8[i]+" ");
			 }
		 }
		

	}

}
