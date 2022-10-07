package 컬렉션;

import java.util.HashMap;

public class 전화번호맵 {

	public static void main(String[] args) {
		HashMap phone = new HashMap();
		// .put(키,value)
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "동생");
		phone.put(4, "친구");
		
		System.out.println(phone);
		System.out.println(phone.get(1));
		
		//추가x변경
		phone.put(1, "직장동료");
		System.out.println(phone);
		
		//삭제
		phone.remove(1);
		System.out.println(phone);
		
		//재정의
		phone.replace(2, "아버지");
		System.out.println(phone);
		
	}

}
