package Inhenritance;

public class OverridingTest {
	public static void main(String[] args) {
	
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint =1000;
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo()+"���ұݾ���"+priceLee+"���Դϴ�.");
		System.out.println(customerKim.showCustomerInfo()+"���ұݾ���"+priceKim+"���Դϴ�.");
	}
}
