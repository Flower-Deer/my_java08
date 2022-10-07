package 컬렉션;

import java.util.ArrayList;

//generic == general <--> specific, special
public class 제너릭프로그램 {

	public static void main(String[] args) {
		//클래스를 만들 때 데이터타입을 정하지 않고,
		//일반적인(특정하지 않은) 형태로 만들어 놓음.
		//데이터타입은 객체생성시 데이터타입을 정할 수 있음.
		ArrayList<String> list = new ArrayList<>();
		list.add("스트링1");
		list.add("스트링2");
		list.add("스트링3");
		list.add("스트링4");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		System.out.println(list2);
	}

}
