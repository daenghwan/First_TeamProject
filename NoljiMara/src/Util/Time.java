package Util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {
	
	//?��바의 LocalDateTime ?��?��?�� ???��?�� DB?�� insert ?�� ?�� ?��?��
	public static Timestamp localDateTimeToTimeStamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt); // ?��?�� ?��짜�? ?���?
	}
	
	//DB?�� TimeStamp ?��?��?�� ???��?�� Java�? select ?��?�� �??��?�� ?�� ?��?��
	public static LocalDateTime timeStampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime(); // ?��?�� ?��짜�? ?���?
	}
	
	public static void main(String[] args) {
		Timestamp ts = localDateTimeToTimeStamp(LocalDateTime.now());
		System.out.println("ts : "+ts);
		
		LocalDateTime ldt = timeStampToLocalDateTime(ts);
		System.out.println("ldt : "+ldt);
	}
};
