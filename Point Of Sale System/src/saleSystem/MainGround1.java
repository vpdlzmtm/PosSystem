package saleSystem;

import java.util.Scanner;

public class MainGround1 {
	Main1_detail mad1 = new Main1_detail();
	Component  com = new Component();
	//Product pro = new Product();
	Product pro = Product.getInstance();	
	Money coin = Money.getInstance();
	TimeCheck time = TimeCheck.getInstance();
	Clear_Job clear = new Clear_Job();
	
	public void mainlist1() {		
		Scanner sc =  new Scanner(System.in);
		//time.startJob_Time();		
		//mad1.moneyReset();
		//pro.ProductResaet();
		//prolist.makeProduct();
		//prolist.resetProduct();
		
		while(true) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("1. 재고 체크 | 2. 현재 잔고 체크 | 3. 매출액 | 4. 유통기한체크 | 5. 업무시작");
		System.out.println("---------------------------------------------------------------");
		System.out.print("선택 : "); 
		int num = sc.nextInt();
		
		
		switch(num){
		case 1:			
			pro.show_inven_Check();			
			break;
		case 2:
			mad1.now_money_check();			
			break;
		case 3:
			mad1.sale_volume();
			break;
		case 4:
			pro.show_Edate();
			break;
		case 5:
			//jobstart.startjob();
			startjob();
			break;
		default:
			System.out.println("잘못된 옵션을 선택하셨습니다.");
		
		}
		
		}
	}
	
	public void startjob () {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("1. 물건 판매 | 2. 물건 환불 | 3. 19금 금지 물품 | 4. 물품 입고 | 5. 물품 검색 | 6. 뒤로 | 7. 업무종료");
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.print("선택 : "); 
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				pro.sellProduct();
				break;
			case 2 :
				pro.ResellProduct();
				break;
			case 3 :
				pro.sell19product();
				break;
			case 4 :
				pro.storage_product();
				break;
			case 5 :
				pro.search_product();
				break;
			case 6 :
				mainlist1();
				break;
			case 7 : 
				clear.ClearJob();
				break;
			default :
				System.out.println("잘못된 옵션을 선택하셨습니다.");
			}
		}
	}

	

	

	
	
}
