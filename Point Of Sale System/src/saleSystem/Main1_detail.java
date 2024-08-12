package saleSystem;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main1_detail  {	
	Component com = new Component();
	Product product = Product.getInstance();
	Money coin = Money.getInstance();
	TimeCheck time = TimeCheck.getInstance();	
	
	public void moneyReset() { //현재 가지고 있는 돈을 초기화 시켜주는 메소드
		coin.setMoney(390500); 
	}	
	
	public void now_money_check() {	// 현재 가지고 있는 돈을 보여주는 메소드	
		//com.setNowmoney(395000);
		System.out.println("현재 잔고 체크 : " + coin.getMoney() + "원" );
		
	}
	
	public void sale_volume () { // 총 매출액이 얼마인지 알려주는 메소드
		System.out.println("매출액은 " + coin.getSales_amount() +  "원 입니다.");
	}
	
	
}

