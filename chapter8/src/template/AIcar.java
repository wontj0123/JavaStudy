package template;

public class AIcar extends Car{

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� ���� �մϴ�.");
	}

}