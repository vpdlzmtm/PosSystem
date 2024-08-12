package saleSystem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Clear_Job {
	Money coin = Money.getInstance();
	TimeCheck time = TimeCheck.getInstance();
	Login log = Login.getInstance();
	Product pro = Product.getInstance();
	
	
	public void ClearJob() {
		LocalDateTime logouttime = LocalDateTime.now();
		Duration duration = Duration.between(log.getLogintime(), logouttime);
		long secDif = duration.getSeconds();
		int pay = 0;
		pay = (int)secDif/60 * 9800;
		int paymin =0;
		paymin = (int)secDif/60;
		System.out.println("==============================================================");
		System.out.println("판매를 종료합니다.");
		System.out.println("오늘 총 판매액은 " + coin.getSales_amount() + "원 입니다.");
		System.out.println("현재 잔고는 " + coin.getMoney() + "입니다.");
		System.out.println("오늘 일하신 시간은 " + paymin + "분으로 오늘 수당은 " + pay + "원 입니다.");
		System.out.println("오늘 하루 수고하셨습니다.");
		System.out.println("==============================================================");
		pro.product_end_show();
		System.exit(0);
	}

}
