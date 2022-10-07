package 컬렉션;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		
		HashMap list = new HashMap();
		
		list.put(100, "김데이");
		list.put(200, "김사전");
		list.put(300, "김구조");
		list.put(400, "김자료");
		
		System.out.println(list);
		
		list.remove(200);
		list.replace(300, "김충성");
		System.out.println(list);
	}

}
