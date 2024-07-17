package downcasting;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<Q3Animal> animals= new ArrayList<Q3Animal>();
		animals.add(new Q3Human());
		animals.add(new Q3Tiger());
		animals.add(new Q3Bird());
		for(Q3Animal animal : animals) {
			animal.move();
			if(animal instanceof Q3Human) {
				Q3Human human = (Q3Human)animal;
				human.reading();
			}else if(animal instanceof Q3Tiger) {
				Q3Tiger tiger = (Q3Tiger)animal;
				tiger.hunting();
			}else {
				Q3Bird bird = (Q3Bird)animal;
				bird.flying();	
			}
		}
		/*
		animals.forEach(animal -> {
			animal.move();
			if(animal instanceof Q3Human) {
				Q3Human human = (Q3Human)animal;
				human.reading();
			}else if(animal instanceof Q3Tiger) {
				Q3Tiger tiger = (Q3Tiger)animal;
				tiger.hunting();
			}else {
				Q3Bird bird = (Q3Bird)animal;
				bird.flying();	
			}
		});
		*/
	}
}

class Q3Animal {
	void move() {
		System.out.println("animal moving");
	}
}

class Q3Human extends Q3Animal{
	void reading() {
		System.out.println("human reading");
	}
}
class Q3Tiger extends Q3Animal{
	void hunting() {
		System.out.println("tiger hunting");
	}
}
class Q3Bird extends Q3Animal{
	void flying() {
		System.out.println("bird flying");
	}
}
