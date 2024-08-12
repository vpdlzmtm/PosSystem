package saleSystem;

import java.time.LocalDateTime;

public class Component  {
	
	// 현재 지니고 있는 잔고. 지속적으로 변하는 것이 필요함.
	private int nowmoney;	

	public int getNowmoney() {
		return nowmoney;
	}

	public void setNowmoney(int nowmoney) {
		this.nowmoney = nowmoney;
	}
	
	//상품 번호 매기는 부분 아직 안씀.
	
	/*private int[] Prodent_num;

	public int[] getProdent_num() {
		return Prodent_num;
	}

	public void setProdent_num(int[] prodent_num) {
		Prodent_num = prodent_num;
	}	*/
	
	//제품의 이름, 재고, 가치의 get set 부분.
	private String name;
	private int ea;
	private int value;
	private LocalDateTime ti;
	
	public Component() {}
	
	public  Component (String name, int ea, int value, LocalDateTime ti) {		
		this.name = name;
		this.ea = ea;
		this.value = value;
		this.ti = ti;
	}
	public LocalDateTime getTi() {
		return ti;
	}

	public void setTi(LocalDateTime ti) {
		this.ti = ti;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	// 총 물품 종류의 수 
	
	private int allEa;

	public int getAllEa() {
		return allEa;
	}

	public void setAllEa(int allEa) {
		this.allEa = allEa;
	}
	
	
	

}