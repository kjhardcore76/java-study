package object;

class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	void take(int payment) {
		money += payment;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철번호" + lineNumber + "지하철승객" + passengerCount + "수입" + money);
	}
}
