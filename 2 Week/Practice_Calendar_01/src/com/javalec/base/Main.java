package com.javalec.base;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		String[] dateName = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int date = calendar.get(Calendar.DAY_OF_WEEK);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		System.out.println(year+"."+String.format("%02d", month)+"."+day+"("+dateName[date-1]+")\n"
						+String.format("%02d", hour)+":"+String.format("%02d", min)+":"+String.format("%02d", sec));
		
	}

}
