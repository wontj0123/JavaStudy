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
	 * �̹� Customer Ŭ������ ��ġ�� ���� ���� ����� �߰��ϴ� ���̱� ������ ���
	 */
	
	double salesRatio;
	private int agentId;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
}
