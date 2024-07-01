package loop.quiz;

public class Quiz8 {
	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			if(dan%2==0) continue;
			for (int gob = 1; gob <= 9; gob++) {
				System.out.println(dan + "*" + gob + "=" + dan * gob);
			}
		}
	}
}
