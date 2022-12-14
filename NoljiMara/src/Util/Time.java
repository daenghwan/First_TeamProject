package Util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {
	
	//?ë°ì LocalDateTime ?°?´?° ???? DB? insert ?  ? ??
	public static Timestamp localDateTimeToTimeStamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt); // ??¬ ? ì§ì? ?ê°?
	}
	
	//DB? TimeStamp ?°?´?° ???? Javaë¡? select ??¬ ê°?? ¸?¬ ? ??
	public static LocalDateTime timeStampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime(); // ??¬ ? ì§ì? ?ê°?
	}
	
	public static void main(String[] args) {
		Timestamp ts = localDateTimeToTimeStamp(LocalDateTime.now());
		System.out.println("ts : "+ts);
		
		LocalDateTime ldt = timeStampToLocalDateTime(ts);
		System.out.println("ldt : "+ldt);
	}
};
