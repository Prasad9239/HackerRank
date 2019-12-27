package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {
	
	public List<Integer> compareArrays(List<Integer> a, List<Integer> b){
		int alice=0,bob=0;
		List<Integer> out =new ArrayList<>();
		for(int i=0;i<3;i++){
			if(a.get(i)>b.get(i)){
				alice++;
			}else if(a.get(i)<b.get(i)){
				bob++;
			}
		}
		out.add(alice);
		out.add(bob);
		return out;
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> a =new ArrayList<>();
		List<Integer> b =new ArrayList<>();
		
		System.out.println("enter values");
		for(int i=0;i<3;i++){
			int a1=sc.nextInt();
			if(0<= a1 && a1 <=100){
				a.add(a1);
			}
		}
		
		for(int i=0;i<3;i++){
			int b1=sc.nextInt();
			if(0<= b1 && b1 <=100){
				b.add(b1);
			}
		}
		CompareTriplets CT=new CompareTriplets();
		List<Integer> result=CT.compareArrays(a,b);
		for(Integer c:result){
			System.out.println(c);
		}

	}

}
