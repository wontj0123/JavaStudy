package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	//메서드에 final 키워드를 쓰면 재정의 할 수 없음, 시나리오가 바뀌면 안될때 사용
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
