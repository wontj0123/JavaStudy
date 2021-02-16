package Inhenritance;

public class VIPCustomer extends Customer {
	/*
	 * private int customerID; 
	 * private String customerName; 
	 * private String
	 * customerGrade; 
	 * int bonusPoint; 
	 * double bonusRatio;
	 * 
	 * 이미 Customer 클래스에 겹치는 것이 많음 기능을 추가하는 것이기 때문에 상속
	 */
	
	double salesRatio;
	private int agentId;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price *bonusPoint;
		return price - (int)(price*salesRatio);
		
	}
	
}
