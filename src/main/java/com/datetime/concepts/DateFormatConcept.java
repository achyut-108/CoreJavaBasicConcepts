package com.datetime.concepts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateFormatConcept {

	public static void main(String[] args) throws Exception {

		// testSomething();
		// testSubsetDateFormat();
		testTimeComponentInDateFormat();

//		String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
//		String dateToFormat = "2022-05-31T16:00:00.000XXX";
//		DateFormat df = new SimpleDateFormat(pattern);
//		System.out.println("df : " + df);
//		String date = df.format(new Date());
//		System.out.println("new date : " + date);
//		String utcDate = df.format(dateToFormat);
//		//Date date = df.parse(dateToFormat);
//		System.out.println("utcDate : " + utcDate);
//		System.out.println("date : " + date);
	}

	public static void testSomething() throws Exception {
		String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
//        String dateToFormat = "2022-06-20T18:57:59.646+01:00";
		String dateToFormat = "2022-06-20";
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println("df : " + df);
		String formatted = df.format(new Date());
		System.out.println("utcDate1 : " + df.format(new Date()));
		System.out.println("utcDate2 : " + df.parse(formatted));
		System.out.println("utcDate3 : " + df.parse(dateToFormat));
	}

	public static void testSubsetDateFormat() throws Exception {
		String pattern = "yyyy-MM-dd";
		String dateToFormat = "2022-03-31T20:00:00.000000Z";
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println("df : " + df);
		String formatted = df.format(new Date());
		System.out.println("utcDate1 : " + df.format(new Date()));
		System.out.println("utcDate2 : " + df.parse(formatted));
		System.out.println("utcDate3 yyyy-MM-dd: " + df.parse(dateToFormat));
	}

	public static void testTimeComponentInDateFormat(){
        final String dateFormat = "yyyy-MM-dd";
        String dateFormatTime = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSz";
        DateFormat df = new SimpleDateFormat(dateFormat);
        DateFormat dfTime = df.getTimeInstance();
        System.out.println("dfTime : " + dfTime);
        System.out.println("dfTime time Component : " + dfTime.getTimeInstance().MINUTE_FIELD);
        
        char[] arr = dateFormat.toCharArray();
        Arrays.sort(arr);
        
        char[] timeArr = {'h','k'};
        
        dateFormat.contains("h");
        
        for(char c :timeArr)
        int result = Arrays.binarySearch(arr, 'H');
        
    }

}