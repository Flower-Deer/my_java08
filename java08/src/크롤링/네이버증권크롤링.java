package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) throws Exception {
		String[] code = {"005360","005930","068270"};
		String[] company = {"모나미","삼성전자","셀트리온"};
		
		for (int i = 0; i < company.length; i++) {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[i]).get();
			Elements elist = doc.select("span.blind");
			System.out.println(company[i]);
			System.out.println("----------------------------");
			
			String today = elist.get(12).text();
			System.out.println("오늘 : " + today);
			String yesterday = elist.get(15).text();
			System.out.println("어제 : " + yesterday);
			String high = elist.get(16).text();
			System.out.println("고가 : " + high);
			System.out.println();
			
			Elements elist2 = doc.select("div.wrap_company h2 a");
		}
	}

}
