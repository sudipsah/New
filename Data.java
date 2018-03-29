package hell;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Data {
	
	        public Data(String listOfLines) {
	        	
	        	try {
	        		final Document document = Jsoup.connect("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=+"+listOfLines).get();

	            for (Element row: document.select("div.a-span7")) {
	            	final String price2= row.select("span.a-offscreen").text();
	            	System.out.println("Isbn number"+listOfLines+"\nPrice="+price2);
	            
	            }
	        	}catch(IOException e) {
	        		
	        		e.printStackTrace();
	        	}
	          
	        }
	    }


