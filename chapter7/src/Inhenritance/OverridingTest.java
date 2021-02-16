package Inhenritance;

public class OverridingTest {
	public static void main(String[] args) {
	
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint =1000;
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo()+"지불금액은"+priceLee+"원입니다.");
		System.out.println(customerKim.showCustomerInfo()+"지불금액은"+priceKim+"원입니다.");
	}
}
