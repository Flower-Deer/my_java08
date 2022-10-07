package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {
	public static void main(String[] args) {
		// 배열의 단점: 고정된 크기, 같은 타입만 모을 수 있다.
		// *ArrayList : 가변크기, 여러타입
		ArrayList list= new ArrayList();
		list.add("홍길동"); //Object <-- String : 자동형변환(업캐스팅)
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		
		System.out.println(list.size());//개수
		
		//String <-- Object : 강제형변환(다운캐스팅)
		String name = (String)list.get(0); //홍길동
		//Integer,Double,Boolean,Character :기본형 + 포장 :포장클래스(Wrapper class)
		//기본형 <--> 포장클래스 : 자동변환 가능
		//int(기본형) <--> Integer(클래스) <-- Object
		//int --> Integer : boxing, 박싱 = auto-boxing(자동박싱)
		//int <-- Integer : unboxing, 언박싱 = auto-unboxing(자동언박싱)
		int age = (int)list.get(1);
		double eye = (double)list.get(2);
		boolean food = (boolean)list.get(3);
		JButton b = (JButton)list.get(4);
		
	}
}
