package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {}
	//�޼��忡 final Ű���带 ���� ������ �� �� ����, �ó������� �ٲ�� �ȵɶ� ���
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
