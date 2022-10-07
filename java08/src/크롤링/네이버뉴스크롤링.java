package 크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버뉴스크롤링 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://news.naver.com/?viewType=pc").get();
			Elements list = doc.select("li>a");
			System.out.println(list.size());
			for (int i = 0; i < 12; i++) { //타이틀만 뽑기!
				Element tag = list.get(i);
				System.out.println(i + ": " + tag.text());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
