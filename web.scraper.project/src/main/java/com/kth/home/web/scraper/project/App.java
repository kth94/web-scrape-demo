package com.kth.home.web.scraper.project;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://www.baeldung.com/java-with-jsoup").get();
		Elements content = doc.getElementsByClass("single-title");
		for (Element link : content) {
			String pTagText = link.text();
			System.out.println(pTagText);
		}
	}
}
