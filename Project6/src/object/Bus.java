package object;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	void take(int payment) {
		money += payment;
		passengerCount++;
	}

	void showInfo() {
		System.out.println("버스번호" + busNumber + "버스승객" + passengerCount + "버스수입" + money);
	}
}
