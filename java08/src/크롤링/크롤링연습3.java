package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습3 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html문서를 다 가지고 오자.
		try {
			Document doc = Jsoup.connect("https://news.naver.com/").get();
			Elements list = doc.select(".Nitem_link_menu"); 
			//class가 nav인 태그를 다 찾아서 묶어서 와줘!
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i); //Element는 태그를 나타냄.
				System.out.println(i + ": " + tag.text()); //<a>메일</a>중에서 메일만 추출
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
