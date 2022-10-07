package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {
	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); //Object <-자동형변환:Integer <-오토박싱:int
		me.add(189.1);
		me.add(false);
		me.add("남");
		
		System.out.println(me);
		
		//Object => Integer:다운캐스팅 => int:오토언박싱
		System.out.println((int)me.get(0) + 2000);
		
		//Object => Double:다운캐스팅 => double:오토언박싱
		System.out.println((double)me.get(1) + 10);
		
		if((boolean)me.get(2) == true) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		if ((String)me.get(3) == "남") {
			System.out.println("주민번호는 1,3 이에요");
		} else {
			System.out.println("주민번호는 2,4 예요");
		}
	}
}
