package saleSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Product {	
	Component com = new Component();
	Scanner sc = new Scanner(System.in);	
	Money coin = Money.getInstance();	
	Login log = Login.getInstance();
	private static Product singleton = new Product();
	
	private Product() {}
	
	public static Product getInstance() {
		return singleton;
	}
	
	//Balnce_ bal = Balance_.INSTANCE; 싱글톤 방식
	
	//매점 내의 창고 개념. 자리가 20개인 창고, 객체배열로 생성.
	Component[] prolist = new Component[20];
	Component[] fprolist = new Component[20];
	// 처음 로그인을 했을때 가지고 있는 제품들을 초기화 시켜주는 메소드.
	public void ProductResaet() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		LocalDateTime logint = log.getLogintime();
		LocalDateTime Edate1 = logint.plusDays(1);
		LocalDateTime Edate2 = logint.plusMonths(10);
		LocalDateTime Edate3 = logint.plusYears(1);
		LocalDateTime Edate4 = logint.plusDays(2);
		LocalDateTime Edate5 = logint.plusMonths(1);
		LocalDateTime Edate6 = logint.plusYears(3);
		LocalDateTime Edate7 = logint.plusMinutes(5);
		LocalDateTime Edate8 = logint.plusHours(5);
		LocalDateTime Edate9 = logint.plusDays(10);
		LocalDateTime Edate10 = logint.plusDays(20);
		
		
		prolist[0]	= new Component("우유",10,2500,Edate1);
		prolist[1]	= new Component("담배",10,4500,Edate2);
		prolist[2]	= new Component("소주",10,1800,Edate3);
		prolist[3]	= new Component("빵",10,2300,Edate4);
		prolist[4]	= new Component("사탕",10,200,Edate5);
		prolist[5]	= new Component("음료수",10,2000,Edate6);
		prolist[6]	= new Component("오뎅",10,500,Edate7);
		prolist[7]	= new Component("두부",10,800,Edate8);
		prolist[8]	= new Component("아이스크림",10,600,Edate9);
		prolist[9]	= new Component("과자",10,1500,Edate10);	
				
		//나머지 빈공간을 0으로 입력해주기.		
		for(int i = 10  ; i<prolist.length; ++i) {
			prolist[i] = new Component(null,0,0,logint);
		}
		
		
	}
	
	//첫 재고 기록
	public void fProductResaet() { 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		LocalDateTime logint = log.getLogintime();
		LocalDateTime Edate1 = logint.plusDays(1);
		LocalDateTime Edate2 = logint.plusMonths(10);
		LocalDateTime Edate3 = logint.plusYears(1);
		LocalDateTime Edate4 = logint.plusDays(2);
		LocalDateTime Edate5 = logint.plusMonths(1);
		LocalDateTime Edate6 = logint.plusYears(3);
		LocalDateTime Edate7 = logint.plusMinutes(5);
		LocalDateTime Edate8 = logint.plusHours(5);
		LocalDateTime Edate9 = logint.plusDays(10);
		LocalDateTime Edate10 = logint.plusDays(20);
		
		fprolist[0]	= new Component("우유",10,2500,Edate1);
		fprolist[1]	= new Component("담배",10,4500,Edate2);
		fprolist[2]	= new Component("소주",10,1800,Edate3);
		fprolist[3]	= new Component("빵",10,2300,Edate4);
		fprolist[4]	= new Component("사탕",10,200,Edate5);
		fprolist[5]	= new Component("음료수",10,2000,Edate6);
		fprolist[6]	= new Component("오뎅",10,500,Edate7);
		fprolist[7]	= new Component("두부",10,800,Edate8);
		fprolist[8]	= new Component("아이스크림",10,600,Edate9);
		fprolist[9]	= new Component("과자",10,1500,Edate10);	
				
		//나머지 빈공간을 0으로 입력해주기.		
		for(int i = 10  ; i<fprolist.length; ++i) {
			fprolist[i] = new Component(null,0,0,logint);
		}
			
	}
	
	// 재고 체크시 보여준는 메소드. 창고크기만큼 반복, 이름이 있을시 출력 없으면 break.		
	public void show_inven_Check() {		
		
		for(int i = 0; i <prolist.length; ++i) {
			if(prolist[i].getName() != null)	{
				System.out.println("제품: " + prolist[i].getName() + ", " + "재고: " + prolist[i].getEa() + ", " + "가격: " + prolist[i].getValue());
			} else { 
				break;
			}
		}
	}
	
	//유통기한
	public void show_Edate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");			
		for(int i = 0; i <prolist.length; ++i) {
			if(prolist[i].getName() != null)	{
				System.out.println("제품: " + prolist[i].getName() + ", " + "유통기한: " + prolist[i].getTi().format(dtf));
			} else { 
				break;
			}
		}
	}
	
	//+ ", " + "유통기한: " + fprolist[i].getTi()
	
	//제품이 존재하는지 살펴보는 메소드
	public void Check_product() {
		String Product_name = sc.next();
		for(int i = 0; i < prolist.length ; ++i)
			if(Product_name.equals(prolist[i].getName())) {
				break; 
			} else {
							
			}
		System.out.println("없는 제품입니다.");			
	}	
	
	//제품 수량 추가 테스트
	public void productPlus() {
	  Scanner sc = new Scanner(System.in);
	  String settingName = sc.next();
	  sc.nextLine();
		prolist[9].setName(settingName);
	}
	
	//제품을 검색하는 메소드.
	public void search_product() {
		System.out.print("제품이름을 입력하세요 : ");
		String name = sc.next();
		sc.nextLine();
		int searchkey = 0;
		for(int i = 0 ; i <prolist.length ; ++i) {
			if(prolist[i].getName().equals(name)) {
				if(prolist[i].getEa() != 0) {
				System.out.println("제품: " + prolist[i].getName() + ", " + "재고: " + prolist[i].getEa() + ", " + "가격: " + prolist[i].getValue());
				searchkey = 0;
				break;
				}				
			} else {
			searchkey = 1;			
			}
		}
		if(searchkey == 1) System.out.println("없는 제품입니다.");
	}

	
	
	//물건 판매
	public void sellProduct() {
		System.out.print("판매할 제품 : ");
		String name = sc.next();
		sc.nextLine();
		
		if(name.equals("담배") || name.equals("소주") ) {
			System.out.println("현재 페이지에선 판매할 수 없는 제품입니다. 19금 금지 물품 판매 페이지로 넘어가세요.");
			return;			
		}
		
		System.out.print("판매 수량 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int k = 1;
		
		int result_ea = 0;
		int earn = 0;
		int result_money = 0;
		int result_earn = 0;
		
		while(true) {
		System.out.print("구매 수단 : 1. 현금 |  2. 카드 ");
		int cho = sc.nextInt();
		sc.nextLine();
		
		switch(cho) { 
		case 1 :
			System.out.println("지불 수단으로 현금을 선택하셨습니다.");
			break;
		case 2 :
			System.out.println("지불 수단으로 카드를 선택하셨습니다.");
			System.out.println("카드 번호를 입력해주세요.");
			String card =sc.next();
			sc.nextLine();
			String a1 = card.substring(0, 1);
			
			switch (a1) {
			case "1":
				System.out.println("농협카드를 입력받았습니다.");
				break;
			case "2":
				System.out.println("국민카드를 입력받았습니다.");
				break;
			case "3":
				System.out.println("하나카드를 입력받았습니다.");
				break;
			default:
				System.out.println("없는 카드 번호입니다.");
				break;
			}
			break;
		default : 
			System.out.println("잘못선택하셨습니다. 다시 선택해주세요.");			
			}
		break;
		}
		
		for(int i = 0 ; i <prolist.length ; ++i) {
			if(prolist[i].getName().equals(name)) {
			 System.out.println("판매 제품은 " + prolist[i].getName() +"이고 판매 수량은 " + num +"개 입니다.");
			 System.out.println("총 가격은 " + prolist[i].getValue()*num + "입니다.");
			 
			 k = 1;
			 result_ea = prolist[i].getEa() - num;			 
			 prolist[i].setEa(result_ea);
			 
			 earn = prolist[i].getValue() * num;
			 result_money = coin.getMoney() + earn;
			 coin.setMoney(result_money);
			 result_earn = earn + coin.getSales_amount();
			 coin.setSales_amount(result_earn);
			 break;
			} else {
				k = 2;
			}
		}
		
		if(k == 2){
			System.out.println("없는 제품입니다.");
		}
		
		
	}
	
	//물건 환불
	public void ResellProduct () {
		System.out.print("환불할 제품 : ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.print("환불 수량 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//int k = 1;
		
		int result_ea = 0;
		int earn = 0;
		int dif_ea = 0;
		int result_money = 0;
		int result_earn = 0;
		
		
		for(int i = 0 ; i <prolist.length ; ++i) {
			if(fprolist[i].getName().equals(name) ) {
				dif_ea = fprolist[i].getEa() - prolist[i].getEa();
				if(num < dif_ea)
			 System.out.println("환불 제품은 " + prolist[i].getName() +"이고 환불 수량은 " + num +"개 입니다.");
			 System.out.println("총 환불 가격은 " + prolist[i].getValue()*num + "입니다.");
			 
			 result_ea = prolist[i].getEa() + num;			 
			 prolist[i].setEa(result_ea);
			 
			 earn = prolist[i].getValue() * num;
			 result_money = coin.getMoney() - earn;
			 coin.setMoney(result_money);
			 result_earn = coin.getSales_amount() - earn  ;
			 coin.setSales_amount(result_earn);
			 break;
			}
		}
	}
	
	//19금 금지 물품 판매.
	public void sell19product() {		
		System.out.print("성인 인증이 필요합니다. 생년월일 8자리를 입력해주세요 : ");
		int birthday = sc.nextInt();		
		if (birthday > 20050101 ) {
			System.out.println("성인이 아닙니다. 판매할 수 없습니다.");
			return;
		}
				
		System.out.print("판매할 제품 : ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.print("판매 수량 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int k = 1;
		
		int result_ea = 0;
		int earn = 0;
		int result_money = 0;
		int result_earn = 0;
		
		while(true) {
		System.out.print("구매 수단 : 1. 현금 |  2. 카드 ");
		int cho = sc.nextInt();
		sc.nextLine();
		
		switch(cho) { 
		case 1 :
			System.out.println("지불 수단으로 현금을 선택하셨습니다.");
			break;
		case 2 :
			System.out.println("지불 수단으로 카드를 선택하셨습니다.");
			System.out.println("카드 번호를 입력해주세요.");
			String card =sc.next();
			sc.nextLine();
			String a1 = card.substring(0, 1);
			
			switch (a1) {
			case "1":
				System.out.println("농협카드를 입력받았습니다.");
				break;
			case "2":
				System.out.println("국민카드를 입력받았습니다.");
				break;
			case "3":
				System.out.println("하나카드를 입력받았습니다.");
				break;
			default:
				System.out.println("없는 카드 번호입니다.");
				break;
			}
			break;
		default : 
			System.out.println("잘못선택하셨습니다. 다시 선택해주세요.");			
			}
		break;
		}
		
		for(int i = 0 ; i <prolist.length ; ++i) {
			if(prolist[i].getName().equals(name)) {
			 System.out.println("판매 제품은 " + prolist[i].getName() +"이고 판매 수량은 " + num +"개 입니다.");
			 System.out.println("총 가격은 " + prolist[i].getValue()*num + "입니다.");
			 
			 k = 1;
			 result_ea = prolist[i].getEa() - num;			 
			 prolist[i].setEa(result_ea);
			 
			 earn = prolist[i].getValue() * num;
			 result_money = coin.getMoney() + earn;
			 coin.setMoney(result_money);
			 result_earn = earn + coin.getSales_amount();
			 coin.setSales_amount(result_earn);
			 break;
			} else {
				k = 2;
			}
		}
		
		if(k == 2){
			System.out.println("없는 제품입니다.");
		}
	}
	
	//물품 입고 
	public void storage_product() {
		System.out.println(" 1. 기존 물품 입고 | 2. 신 제품 입고 | 3. 뒤로 중에 선택해주세요.");
		System.out.print("선택 : ");
		int num1 = sc.nextInt();
		switch(num1) {
		case 1 :
			oldproduct_st();
			break;
		case 2 :
			newproduct_st();
			break;
		case 3 :
			break;
		}		
	}
	
	//기존 제품 입고
	public void oldproduct_st () {
		System.out.println("기존 물품 입고를 선택하셨습니다.");
		System.out.println("다음 중 입고 할 물품을 골라주세요.");
		System.out.println("| 1. 우유  | 2. 담배 | 3. 소주 | 4. 빵 |  5. 사탕 |" );
		System.out.println("| 6. 음료수 | 7. 오뎅 | 8. 두부 | 9. 아이스크림 | 10. 과자 |" );
		int choicenum = sc.nextInt();
		int num = 0;
		int resultprice = 0;
		int buy = 0;
		int outgo = 0;
		int numsum = 0;
		switch(choicenum) {
		case 1:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[0].getEa();
			prolist[0].setEa(numsum);
			resultprice = num * prolist[0].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 1일 입니다.") ;
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 2:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[1].getEa();
			prolist[1].setEa(numsum);
			resultprice = num * prolist[1].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 10개월 입니다.") ;
			System.out.println("본 제품은 19금 금지 물품입니다.");
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 3:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[2].getEa();
			prolist[2].setEa(numsum);
			resultprice = num * prolist[2].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 1년 입니다.") ;
			System.out.println("본 제품은 19금 금지 물품입니다.");
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 4:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[3].getEa();
			prolist[3].setEa(numsum);
			resultprice = num * prolist[3].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 2일 입니다.") ;
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 5:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[4].getEa();
			prolist[4].setEa(numsum);
			resultprice = num * prolist[4].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 1개월 입니다.") ;
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 6:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[5].getEa();
			prolist[5].setEa(numsum);
			resultprice = num * prolist[5].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 3년 입니다.") ;
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 7:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[6].getEa();
			prolist[6].setEa(numsum);
			resultprice = num * prolist[6].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 5분 입니다.") ;
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 8:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[7].getEa();
			prolist[7].setEa(numsum);
			resultprice = num * prolist[7].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 5시간 입니다.") ;
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 9:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[8].getEa();
			prolist[8].setEa(numsum);
			resultprice = num * prolist[8].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 10일 입니다.") ;
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		case 10:
			System.out.println("제품을 몇개 입금하시겠습니까? : ");
			num = sc.nextInt();
			numsum = num + prolist[9].getEa();
			prolist[9].setEa(numsum);
			resultprice = num * prolist[9].getValue();
			System.out.println("지불하셔야 할 가격은 총 " + resultprice + "원이고 제품의 유통기한은 20일 입니다.") ;
			System.out.println("구매 하시겠습니까? 1. yes | 2. no");
			buy = sc.nextInt();
			if(buy == 2) {
				System.out.println("처음으로 돌아갑니다.");
				return;
			}
			outgo = coin.getMoney() - resultprice;
			coin.setMoney(outgo);
			break;
		default:
			System.out.println("잘못선택하셨습니다.");
			break;
		}
		
		
	}
	
	//신 제품 입고
	public void newproduct_st() {		

		LocalDateTime logint = log.getLogintime();
		LocalDateTime Edate = logint.plusDays(1);
		
		System.out.println("신 제품 입고를 선택하셨습니다. 제품 정보를 입력해주세요.");
		System.out.print("입고할 제품 이름 : ");
		int newproPrice = 0;
		int newproEa = 0;
		int newdate = 0 ;
		String newproName;
		newproName =sc.next();
		sc.nextLine();
		
		for(int i = 0 ; i <prolist.length ; ++i) {
			if(prolist[i].equals(newproName)) {
				System.out.println("기존 존재하는 제품입니다. 뒤로 돌아갑니다.");
				return;
			} 
		}
		
		for(int i = 0 ; i <prolist.length ; ++i) {
			if(prolist[i].getEa() == 0) {
				prolist[i].setName(newproName);
				System.out.print("입고 제품의 가격 :");
				newproPrice = sc.nextInt();
				prolist[i].setValue(newproPrice);
				System.out.print("입고 제품 개수 :");
				newproEa = sc.nextInt();
				prolist[i].setEa(newproEa);
				System.out.print("입고 제품의 유통기한은 최대 며칠 입니까? :");
				newdate = sc.nextInt();
				Edate = logint.plusDays(newdate);
				prolist[i].setTi(Edate);				
				break;
			} 
		}
		
		System.out.println("신 제품 입고가 완료되었습니다.");
		
	}
	
	public void product_end_show() {
		System.out.println("총 남은 재고");
		for(int i = 0; i <prolist.length; ++i )			
			if(prolist[i].getEa() != 0) {
				System.out.println("제품 : " + prolist[i].getName());
				System.out.print("남은 재고 :");
				for(int j = 0 ; j <prolist[i].getEa() ; ++j) {
					System.out.print("*");
				}
				System.out.println();
			}
		
	}
	
	
}