package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html문서를 다 가지고 오자.
		try {
			Document doc = Jsoup.connect("http://www.naver.com").get();
			//System.out.println(doc);
			//Elements는 ArrayList의 자식
			Elements list = doc.select(".nav"); //class가 nav인 태그를 다 찾아서 묶어서 와줘!
			System.out.println(list.size());
//			System.out.println(list.get(0));
//			System.out.println(list.get(1));
			for (int i = 0; i < list.size(); i++) {
				//System.out.println(list.get(i));
				Element tag = list.get(i); //Element는 태그를 나타냄.
				System.out.println(i + ": " + tag.text()); //<a>메일</a>중에서 메일만 추출
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
