package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션선택 {

	public static void main(String[] args) {
		//1. set -> HashSet : 중복제거
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("DB관리자");
		System.out.println(team);
		System.out.println(team.size());
		
		//2. queue -> LinkedList : 선입선출(PIPO)
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println(milk);
		
		//3. list -> ArrayList : 순서가있는 배열
		ArrayList ski = new ArrayList();
		ski.add("박스키"); //0
		ski.add("송스키"); //1
		ski.add("김스키"); //2
		ski.add("정스키"); //3
		ski.remove(1);
		System.out.println(ski);
		
		//4. map -> HashMap : key + value
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");
		phone.put(4, "동생");
		System.out.println(phone.get(2));
	}

}