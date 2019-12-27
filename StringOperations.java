package com.basic;

import java.util.Arrays;

public class StringOperations {
	public static void main(String[] args) {
		String s="Prasad";
		int lenght=s.length();
		System.out.println(lenght);
		
		//reverse without inbuilt
		String[] arr=s.split("");
		String reverse="";
		for(int i=arr.length-1;i>=0;i--){
			reverse=reverse+arr[i];
		}
		System.out.println(reverse);
		//reverse using in built
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
		//Convert lower to upper and vice versa
		for(int i=0;i<sb.length();i++){
		if(Character.isLowerCase(sb.charAt(i))){
			sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
		}else if(Character.isUpperCase(sb.charAt(i))){
			sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
		}
		}
		System.out.println(sb);
		
		//number of vowels and consonants 
		String newstr=s.replaceAll("[aeiouAEIOU]", "");
		System.out.println("number of consonants  "+ newstr.length());
		System.out.println("number of vowels  "+ (lenght-newstr.length()));
		
		//anagram
		String str1="Brag";  
		String str2="Grab";  
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length() != str2.length()){
			System.out.println("Strings are not anagram");
		}
		char[] a1=str1.toCharArray();
		char[] a2=str2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)==true){
			System.out.println("Strings are  anagram");
		}else{
			System.out.println("Strings are not anagram");
		}
		
		//Remove white spaces
		String str3="Remove white spaces";
		
		str3=str3.replaceAll("\\s+", "");
		System.out.println(str3);
		
		//replace white spaces
		String str4 = "Once in a blue moon";  
		str4=str4.replaceAll("\\s+", "-");
		System.out.println(str4);
		

	}
	
}
