package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionList {
	public static void main(String[] args) {
		/*
		Character[] charArr = {'A','B','C'};
		ArrayList<Character> charList = new ArrayList<Character>(Arrays.asList(charArr)) ;
		Boolean bool = charList.contains('A');
		System.out.println(bool);
		*/	
		MemberList memberList = new MemberList() ;
		memberList.addMember(new Member(1,"name1"));
		memberList.addMember(new Member(2,"name2"));
		memberList.addMember(new Member(3,"name3"));
		memberList.showMember();
	}
}

class MemberList {
	ArrayList<Member> memberList = new ArrayList<Member>();
	void addMember(Member member) {
		memberList.add(member);
	}
	void removeMember(int id) {
		memberList.forEach(member->{
			if(member.id == id) memberList.remove(member);
		});
	}
	void showMember() {
		memberList.forEach(member->{
			System.out.println(member.toString());
		});
	}
}


class Member {
	Integer id;
	String name;
	
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.id +" "+ this.name);
	}
}
