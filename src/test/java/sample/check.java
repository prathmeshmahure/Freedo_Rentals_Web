package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class check {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
//		String date1="";
//		for (int i=0;i<=10;i++) {
//			date1=date1+formattedDate.charAt(i);
//		}
//		System.out.println(date1);

	}

}
