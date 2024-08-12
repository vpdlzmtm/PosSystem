package saleSystem;

public class Money {
	private static Money singleton = new Money();
	
	private Money() {
		
	}
	
	public static Money getInstance() {
		return singleton;
	}
	
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	private int sales_amount;

	public int getSales_amount() {
		return sales_amount;
	}

	public void setSales_amount(int sales_amount) {
		this.sales_amount = sales_amount;
	}

}
