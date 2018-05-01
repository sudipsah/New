import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Abe{
		public   void Data1(String str) throws IOException {
			
	URL source = new URL("https://www.abebooks.com/servlet/BookDetailsPL?bi=22754421892&searchurl=kn%3D"+str);
	BufferedReader in = new BufferedReader(
	            new InputStreamReader(
	            source.openStream()));
	String inputLine;
	
	boolean flag=false;
		int  indexForUS$;
		int indexForTitle;
		
		System.out.print("Books name and author Name:\n");	
		while ((inputLine = in.readLine()) != null) {
			
			flag=false;
			
			indexForTitle=inputLine.indexOf("title");
			
			if(inputLine.indexOf("title")!=-1) {
			
				char[] ch=inputLine.toCharArray();
				
				for(int i=indexForTitle+6;i<ch.length;i++) {
					
					if(ch[i]==':'||ch[i]=='/') break;
					System.out.print(ch[i]);
					
					flag=true;
					
				}
				
				if(flag==true) break;
			}
		}
		

			
		System.out.println();
		System.out.print("Price:");
		while ((inputLine = in.readLine()) != null) {
			
			indexForUS$=inputLine.indexOf("US$");
			
			if(inputLine.indexOf("US$")!=-1) {
			
				char[] ch=inputLine.toCharArray();
				
				for(int i=indexForUS$;i<ch.length;i++) {
					
					if(ch[i]=='<'||ch[i]=='/') break;
					System.out.print(ch[i]);
					flag=true;
					
				}
				
				if(flag==true) {
					
					System.out.println("\n");
					
				}
			}
		}
		
	}
/*-------------------------------------------------------------------*/
	public void Data2(String str) throws IOException {
			
			
			URL yahoo = new URL("https://www.abebooks.com/servlet/BookDetailsPL?bi=22638271800&cm_sp=plp-_-"+str);
			BufferedReader in = new BufferedReader(
			            new InputStreamReader(
			            yahoo.openStream()));
			String inputLine;	
			char []ch1;
			boolean flag=false;
				int  indexForUS$;
				int indexForTitle;				
				System.out.print("Books name and author Name:\n");	
				while ((inputLine = in.readLine()) != null) {
					
					flag=false;
					
					indexForTitle=inputLine.indexOf("title");
					
					if(inputLine.indexOf("title")!=-1) {
					
						ch1=inputLine.toCharArray();
						
						for(int i=indexForTitle+6;i<ch1.length;i++) {
							
							if(ch1[i]==':'||ch1[i]=='/') break;
							System.out.print(ch1[i]);	
							flag=true;							
						}
						
						if(flag==true) break;
					}
				}
					char[]ch;
				System.out.println();
				System.out.print("Price:");
				while ((inputLine = in.readLine()) != null) {
					
					indexForUS$=inputLine.indexOf("US$");
					
					if(inputLine.indexOf("US$")!=-1) {
					
						ch=inputLine.toCharArray();
						
						for(int i=indexForUS$;i<ch.length;i++) {
							
							if(ch[i]=='<'||ch[i]=='/') break;
							System.out.print(ch[i]);
							flag=true;
							
						}
						
						if(flag==true) {
							System.out.println("\n");
							
						}
					}
				}
							}
	
/*----------------------------------------------------------------*/
public void Data3(String s) throws IOException {
			
			
			URL yahoo = new URL("https://www.abebooks.com/servlet/BookDetailsPL?bi=22803480316&searchurl=sortby%3D17%26an%3Dyuval%2Bnoah%2Bharari&cm_"+s);
			BufferedReader in = new BufferedReader(
			            new InputStreamReader(
			            yahoo.openStream()));
			String inputLine;
			boolean flag=false;
				int  indexForUS$;
				int indexForTitle;
				
				System.out.print("Books name and author Name:\n");	
				while ((inputLine = in.readLine()) != null) {
					
					flag=false;
					
					indexForTitle=inputLine.indexOf("title");
					
					if(inputLine.indexOf("title")!=-1) {
					
						char[] ch=inputLine.toCharArray();
						
						for(int i=indexForTitle+6;i<ch.length;i++) {
							
							if(ch[i]==':'||ch[i]=='/') break;
							System.out.print(ch[i]);
							
							flag=true;
							
						}
						
						if(flag==true) break;
					}
				}
				System.out.print("\nPrice:");
				while ((inputLine = in.readLine()) != null) {
					
					indexForUS$=inputLine.indexOf("US$");
					
					if(inputLine.indexOf("US$")!=-1) {
					
						char[] ch=inputLine.toCharArray();
						
						for(int i=indexForUS$;i<ch.length;i++) {
							
							if(ch[i]=='<'||ch[i]=='/') break;
							System.out.print(ch[i]);
							flag=true;
							
						}
						
						if(flag==true) {
							System.out.println("\n");
							
						}
					}
				}	
		}
/*------------------------------------------------------------*/

public void Data4(String s) throws IOException {
	
	
	URL yahoo = new URL("https://www.abebooks.com/servlet/BookDetailsPL?bi=22820284154&searchurl=kn%3D%2B"+s);
	BufferedReader in = new BufferedReader(
	            new InputStreamReader(
	            yahoo.openStream()));
	String inputLine;
	boolean flag=false;
	int  indexForUS$;
	int indexForTitle;
	System.out.print("Books name and author Name:\n");	
	while ((inputLine = in.readLine()) != null) {
		
		flag=false;
		
		indexForTitle=inputLine.indexOf("title");
		
		if(inputLine.indexOf("title")!=-1) {
		
			char[] ch=inputLine.toCharArray();
			
			for(int i=indexForTitle+6;i<ch.length;i++) {
				
				if(ch[i]==':'||ch[i]=='/') break;
				System.out.print(ch[i]);
				
				flag=true;
				
			}
			
			if(flag==true) break;
		}
	}
	System.out.print("\nPrice:");
	while ((inputLine = in.readLine()) != null) {
		
		indexForUS$=inputLine.indexOf("US$");
		
		if(inputLine.indexOf("US$")!=-1) {
		
			char[] ch=inputLine.toCharArray();
			
			for(int i=indexForUS$;i<ch.length;i++) {
				
				if(ch[i]=='<'||ch[i]=='/') break;
				System.out.print(ch[i]);
				flag=true;
				
			}
			
			if(flag==true) {
				System.out.println("\n");
				
			}
		}
	}
	
	}
/*----------------------------------------------------------*/
public void Data5(String st) throws IOException {
	
	
	URL info = new URL("https://www.abebooks.com/servlet/BookDetailsPL?bi=22819294786&searchurl=kn%3D%2B"+st);
	BufferedReader in = new BufferedReader(
	            new InputStreamReader(
	            info.openStream()));
	String inputLine;
	boolean flag=false;
	int  price;
	int title;
	System.out.print("Books name and author Name:\n");	
	while ((inputLine = in.readLine()) != null) {
		
		flag=false;
		
		title=inputLine.indexOf("title");
		
		if(inputLine.indexOf("title")!=-1) {
		
			char[] ch=inputLine.toCharArray();
			
			for(int i=title+6;i<ch.length;i++) {
				
				if(ch[i]==':'||ch[i]=='/') break;
				System.out.print(ch[i]);
				
				flag=true;
				
			}
			
			if(flag==true) break;
		}
	}
	System.out.print("\nPrice:");
	while ((inputLine = in.readLine()) != null) {
		
		price=inputLine.indexOf("US$");
		
		if(inputLine.indexOf("US$")!=-1) {
		
			char[] ch=inputLine.toCharArray();
			
			for(int i=price;i<ch.length;i++) {
				
				if(ch[i]=='<'||ch[i]=='/') break;
				System.out.print(ch[i]);
				flag=true;
				
			}
			
			if(flag==true) {
				System.out.println("\n");
				
			}
		}
	}
/*------------------------------------------------------------*/
	}

}
