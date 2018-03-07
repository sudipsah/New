package hell;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Data3 {
	
	        public Data3(String s) {
	         	System.out.println("Search with amazon");
	        	try {
	        		final Document document = Jsoup.connect("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Dstripbooks&field-keywords=&rh=n%3A283155%2Ck%3A"+s).get();

	            for (Element row: document.select("div.a-span7")) {
	            	final String price2 = row.select("span.a-offscreen").text();
	            	System.out.println("Isbn number"+s+"\nPrice="+price2);
	            
	            }
	        	}catch(IOException e) {
	        		
	        		e.printStackTrace();
	        	}
	          
	        
	        
	       
 
	        }
	        public void Data3a(String s) {
	         	System.out.println("Search with barnesandnoble");
	        	
	        	try {
	        		final Document document = Jsoup.connect("https://www.barnesandnoble.com/w/abc-danny-mia-coulton/1112504618?ean="+s).get();

	            for (Element row: document.select("div.pdp-commerce-zone")) {
	            	final String price4 = row.select("span#pdp-cur-price").text();
	            	System.out.println("Isbn number"+s+"\nPrice="+price4);
	            
	            }
	        	}catch(IOException e) {
	        		
	        		e.printStackTrace();
	        	}
	          
	        }
 }




