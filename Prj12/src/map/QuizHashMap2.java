package map;

import java.util.Collection;
import java.util.HashMap;

public class QuizHashMap2 {
  public static void main(String[] args) {
    HandleMember handleMember = new HandleMember();
    handleMember.putMember(1, new Member(1, "hong"));
    handleMember.putMember(2, new Member(2, "kim"));
    handleMember.putMember(3, new Member(3, "lee"));
    handleMember.showAllMember();
  }
}

class HandleMember{
  HashMap<Integer, Member> memberMap = new HashMap<>();
  void putMember(Integer id, Member member){
    this.memberMap.put(id, member);
  }
  void removeMember(Integer id){
    this.memberMap.remove(id);
  }

  void showAllMember(){
    Collection<Member> members = memberMap.values();
    members.forEach(member -> System.out.println(member.toString()));
  }
}

class Member{
  Integer id;
  String name;
  public Member(Integer id, String name) {
    this.id = id;
    this.name = name;
  }
  @Override
  public String toString() {
    return "Member [id=" + id + ", name=" + name + "]";
  }
}