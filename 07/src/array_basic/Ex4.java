package array_basic;

import java.util.ArrayList;

public class Ex4 {
	public static void main(String[] args) {
		Member member1 = new Member("홍길동");
		member1.subjectList.add(new Subject("국어", 60));
		System.out.println(member1.subjectList.get(0).score);
	}
}

class Member{
	String name;
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	public Member(String name) {
		super();
		this.name = name;
	}
}

class Subject{
	String name;
	int score;
	public Subject(String name,int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}