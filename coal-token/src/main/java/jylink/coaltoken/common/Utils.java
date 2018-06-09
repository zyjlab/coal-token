package jylink.coaltoken.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public String convertTime(Date date)
	{
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		return df.format(date);
		
	}
}
