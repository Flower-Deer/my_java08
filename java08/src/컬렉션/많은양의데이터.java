package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;

public class 많은양의데이터 {

	public static void main(String[] args) {
		// 데이터타입이 다름, 크기도 유동적일 경우
		// 순서가 중요하면
		ArrayList list = new ArrayList();
		
		list.add("홍길동"); //0 = index값
		list.add("홍길동"); //1
		list.add("홍길동"); //2
		list.add(100); //3
		list.add(11.1); //4
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		// *중복제외 : set형 데이터 ==> HashSet을 가장많이 사용
		HashSet set = new HashSet();
		for (int i = 0; i < 5; i++) {
			set.add(list.get(i));
		}
		
		System.out.println(set);
		
		
	}

}
