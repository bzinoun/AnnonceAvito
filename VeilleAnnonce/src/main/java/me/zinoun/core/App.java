package me.zinoun.core;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello Avito!
 * 
 */
public class App {
	public static void main(String[] args) throws Exception {

		Document doc = Jsoup.connect(
				"http://www.avito.ma/fr/casablanca/%C3%A9lectronique").get();

		Elements els = doc.getElementsByClass("catalog-item");
		String prix, desc;
		for (Element element : els) {
			if (element.getElementsByClass("catalog-item-info") != null) {
				Elements ItemInfo = element
						.getElementsByClass("catalog-item-info");

				Elements ItemDate = element
						.getElementsByClass("catalog-item-date");
				Elements ItemLink = element.getElementsByTag("a");
				Elements ItemImg= element.getElementsByTag("img");

				for (int i = 0; i < ItemInfo.size(); i++) {

					desc = ItemInfo.get(i).child(0).text();
					System.out.println("Description : " + desc);

					prix = ItemInfo.get(i).child(1).text();
					System.out.println("Prix : " + prix);
					
					System.out.println(ItemDate.text()); 
					String href;
					String img;
					img= ItemImg.toString();
					href = ItemLink.attr("href"); 
					System.out.println(href + " Image : "+ img );
					System.out.println("_________________________________________________|");
					AnnonceAvito Avito = null ; 
						Avito.setImg(img);
						Avito.setLien(href);
						Avito.setDesc(desc);
						Avito.setPrix(prix);
				}
				
			}
		}

	}
}