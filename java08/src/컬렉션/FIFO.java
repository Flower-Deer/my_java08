package 컬렉션;

import java.util.LinkedList;

public class FIFO {

	public static void main(String[] args) {
		LinkedList p = new LinkedList();
		
		p.add("국어");
		p.add("수학");
		p.add("영어");
		p.add("컴퓨터");
		
		System.out.println(p);
		
		for (int i = 0; i < 3; i++) {
			p.remove();
			System.out.println(p);
			
		}
	}
}
