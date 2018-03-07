package hell;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Data2 {
	public Data2(String str) {
		System.out.println("Search eith amazon");
		try {
			final Document document1 = Jsoup.connect("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords="
					+str).get();

			for (Element row: document1.select("div.a-span7")) {
				final String price = row.select(".a-offscreen").text();
				System.out.println("Isbn number"+str+"\nPrice="+price);
			}
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		System.out.println("search with barnesandnoble");
	}
	public void Data2a(String str) {
    	
    	try {
    		final Document document = Jsoup.connect("https://www.biblio.com/978"+str).get();

        for (Element row: document.select("div.pricebox")) {
        	final String price4 = row.select("a h3").text();
        	System.out.println("Isbn number"+str+"\nPrice="+price4);
        
        }
    	}catch(IOException e) {
    		
    		e.printStackTrace();
    	}
      
    }
}
