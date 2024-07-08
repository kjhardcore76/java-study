package object;

class Passenger {
	int money ;
	public Passenger(int money) {
		this.money = money;
	}
	void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
}
