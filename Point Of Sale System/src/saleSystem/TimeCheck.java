package saleSystem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;

//import javax.swing.text.DateFormatter;

import java.time.format.DateTimeFormatter;

public class TimeCheck {
	private static TimeCheck singleton = new TimeCheck();
	private TimeCheck() {}
	public static TimeCheck getInstance() {
		return singleton;
	}
	
	Login log = Login.getInstance();
	
	Calendar now = Calendar.getInstance();
	
	//현재 시간 및 날짜 출력.
	public void nowdays() {
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY: strWeek = "월";break;
		case Calendar.TUESDAY: strWeek = "화";break;
		case Calendar.WEDNESDAY: strWeek = "수";break;
		case Calendar.THURSDAY: strWeek = "목";break;
		case Calendar.FRIDAY: strWeek = "금";break;
		case Calendar.SATURDAY: strWeek = "토";break;
		default: strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		//System.out.print(strWeek + "요일 ");
		//System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초" );
	}
	 
	//일한 시간 출력.
	public void betweentime () {
	 LocalDateTime logouttime = LocalDateTime.now();
	 Duration duration = Duration.between(log.getLogintime(), logouttime);
	 long secDif = duration.getSeconds();
	 setWorkmin(secDif);
	 System.out.println(secDif +"초 일하셨습니다.");
	}
	
	private long workmin;
	
	public long getWorkmin() {
		return workmin;
	}
	public void setWorkmin(long workmin) {
		this.workmin = workmin;
	}
	
	private int year;
	private int month;
	private int dayOfMonth;	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	private DateTimeFormatter stTime = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
	public DateTimeFormatter getStTime() {
		return stTime;
	}
	public void setStTime(DateTimeFormatter stTime) {
		this.stTime = stTime;
	}
	public void startJob_Time() {		
		LocalDateTime now = LocalDateTime.now();
		now.format(stTime);		
	}
	
	private DateTimeFormatter nowTime = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
	public DateTimeFormatter getNowTime() {
		return nowTime;
	}
	public void setNowTime(DateTimeFormatter nowTime) {
		this.nowTime = nowTime;
	}
	public void now_Time() {
		LocalDateTime now = LocalDateTime.now();
		now.format(nowTime);		
	}	
	
	
	private int sthour;
	private int stmin;
	private int stsec;
	public int getSthour() {
		return sthour;
	}
	public void setSthour(int sthour) {
		this.sthour = sthour;
	}
	public int getStmin() {
		return stmin;
	}
	public void setStmin(int stmin) {
		this.stmin = stmin;
	}
	public int getStsec() {
		return stsec;
	}
	public void setStsec(int stsec) {
		this.stsec = stsec;
	}
	
		
	
}
