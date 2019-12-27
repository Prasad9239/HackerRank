package com.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
    
    }

	private static String timeConversion(String s) {
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ssaa");
		SimpleDateFormat output=new SimpleDateFormat("HH:mm:ss");
		Date date = null;
	    String output1 = null;
		try{
			date=sdf.parse(s);
			output1=output.format(date);
		}catch(ParseException pe){
	         pe.printStackTrace();
	       }

		return output1;
	}

}
