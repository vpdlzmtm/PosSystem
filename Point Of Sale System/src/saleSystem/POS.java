package saleSystem;

import java.text.ParseException;

public class POS {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Login log = Login.getInstance();
		MainGround1 main1 = new MainGround1();		
		Product pro = Product.getInstance();		
		Main1_detail md = new Main1_detail();
		
		
		log.setTruelogin("wodnd");
		log.setTruepassword("990912");
		log.getLogin();
		
		//돈이랑 상품 초기화!
		pro.ProductResaet();
		pro.fProductResaet();
		md.moneyReset();
		
		main1.mainlist1();
		

	}

}
