package ex;

import java.util.Scanner;

public class QuizDB {

	
	static DB selectDB (int num) {
		if(num == 1) {
			return new MySQL();
		}else if(num == 2) {
			return new Oracle();
		}else {
			return new PostGress();
		}
	}
	
	public static void main(String[] args) {

		DB db = new MySQL();
		System.out.println(db.name);
		
		
//		Scanner scanner = new Scanner(System.in);
//		DB db = selectDB(scanner.nextInt());
//		String dbname = db.name;
//		db.showinfo("test");
		
		
	}
	
}

interface DB {
	String name = "DB";
	default void showinfo(String dbname) {
		System.out.println(dbname+"db connected");
	}
}

class MySQL implements DB{
	String name = "MySQL";
}


class Oracle implements DB{
	String name = "Oracle";
}
class PostGress implements DB{
	String name = "Postgress";
}