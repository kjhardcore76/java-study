package object;

public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus(100);
		Subway subway = new Subway("inchun1");
		Passenger passenger = new Passenger(5000);

		passenger.takeBus(bus);
		passenger.takeSubway(subway);
		
		bus.showInfo();
		subway.showInfo();
	}
}


