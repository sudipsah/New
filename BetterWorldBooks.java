import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class BetterWorldBooks{
		public   void Data1(String str1) throws IOException {
			
	URL source = new URL("https://www.betterworldbooks.com/product/detail/All-American-Murder--The-Rise-and-Fall-of-Aaron-Hernandez--the-Superstar-Whose-Life-Ended-on-Murderers--Row-9780316412667");
	BufferedReader in = new BufferedReader(
	            new InputStreamReader(
	            source.openStream()));
	String inputLine;
	
	boolean flag=false;
		int  price;
		int name;
		
		System.out.print("Books name and author Name:\n");	
		while ((inputLine = in.readLine()) != null) {
			
			flag=false;
			
			name=inputLine.indexOf("All");
			
			if(inputLine.indexOf("All")!=-1) {
			
				char[] ch=inputLine.toCharArray();
				
				for(int i=name;i<ch.length-72;i++) {
					
					if(ch[i]==':'||ch[i]=='<') break;
					System.out.print(ch[i]);
					
					flag=true;
					
				}
				
				if(flag==true) break;
				System.out.println();
			}
		}
		

			
		System.out.println();
		System.out.print("Price:$");
		while ((inputLine = in.readLine()) != null) {
			
			price=inputLine.indexOf("$");
			
			if(inputLine.indexOf("$")!=-1) {
			
				char[] ch=inputLine.toCharArray();
				
				for(int i=price;i<10;i++) {
					
					if(ch[i]=='>'||ch[i]=='/') break;
					else if(ch[i]=='.'||(ch[i]>='0'&&ch[i]<='9'))
					System.out.print(ch[i]);
					flag=true;
				
				}
				
				if(flag==true) {
					
				}
			}
		}
		System.out.println("\n");
	}
		
		
/*-------------------------------------------------------------------------------------*/
		
		public   void Data2(String str) throws IOException {
			
			URL source = new URL("https://www.betterworldbooks.com/product/detail/Basic-Elements-of-Landscape-Architectural-Design-9780881334784");
			BufferedReader in = new BufferedReader(
			            new InputStreamReader(
			            source.openStream()));
			String inputLine;
			
			boolean flag=false;
				int  price;
				int name;
				
				System.out.print("Books name and author Name:\n");	
				while ((inputLine = in.readLine()) != null) {
					
					flag=false;
					
					name=inputLine.indexOf("Basic");
					
					if(inputLine.indexOf("Basic")!=-1) {
					
						char[] ch=inputLine.toCharArray();
						
						for(int i=name;i<ch.length-72;i++) {
							
							if(ch[i]==':'||ch[i]=='<') break;
							System.out.print(ch[i]);
							
							flag=true;
							
						}
						
						if(flag==true) break;
					}
				}
				

					
				System.out.println();
				System.out.print("Price:$");
				while ((inputLine = in.readLine()) != null) {
					
					price=inputLine.indexOf("$");
					
					if(inputLine.indexOf("$")!=-1) {
					
						char[] ch=inputLine.toCharArray();
						
						for(int i=price;i<10;i++) {
							
							if(ch[i]=='>'||ch[i]=='/') break;
							else if(ch[i]=='.'||(ch[i]>='0'&&ch[i]<='9'))
							System.out.print(ch[i]);
							flag=true;
						
						}
						
						if(flag==true) {
							
						}
					}
				}System.out.println("\n");
		}
/*-------------------------------------------------------------------------*/
				public   void Data3(String st) throws IOException {
					
					URL source = new URL("https://www.betterworldbooks.com/product/detail/Fuzzy-Engineering-9780131249912");
					BufferedReader in = new BufferedReader(
					            new InputStreamReader(
					            source.openStream()));
					String inputLine;
					
					boolean flag=false;
						int  price;
						int name;
						
						System.out.print("Books name and author Name:\n");	
						while ((inputLine = in.readLine()) != null) {
							
							flag=false;
							
							name=inputLine.indexOf("Fuzzy");
							
							if(inputLine.indexOf("Fuzzy")!=-1) {
							
								char[] ch=inputLine.toCharArray();
								
								for(int i=name;i<ch.length-72;i++) {
									
									if(ch[i]=='<'||ch[i]=='/') break;
									System.out.print(ch[i]);
									
									flag=true;
									
								}
								
								if(flag==true) break;
							}
						}
						

							
						System.out.println();
						System.out.print("Price:$");
						while ((inputLine = in.readLine()) != null) {
							
							price=inputLine.indexOf("$");
							
							if(inputLine.indexOf("$")!=-1) {
							
								char[] ch=inputLine.toCharArray();
								
								for(int i=price;i<10;i++) {
									
									if(ch[i]=='>'||ch[i]=='/') break;
									else if(ch[i]=='.'||(ch[i]>='0'&&ch[i]<='9'))
									System.out.print(ch[i]);
									flag=true;
								
								}
								
								if(flag==true) {
									
								}
							}
						}System.out.println("\n");	
				}
				
/*----------------------------------------------------------------------------*/
						public   void Data4(String str2) throws IOException {
							
							URL source = new URL("https://www.betterworldbooks.com/product/detail/Microsoft-Office-2007--Introductory-Concepts-and-Techniques--Windows-XP-Edition-9781418843274");
							BufferedReader in = new BufferedReader(
							            new InputStreamReader(
							            source.openStream()));
							String inputLine;
							
							boolean flag=false;
								int  price;
								int name;
								
								System.out.print("Books name and author Name:\n");	
								while ((inputLine = in.readLine()) != null) {
									
									flag=false;
									
									name=inputLine.indexOf("Micro");
									
									if(inputLine.indexOf("Micro")!=-1) {
									
										char[] ch=inputLine.toCharArray();
										
										for(int i=name;i<ch.length-72;i++) {
											
											if(ch[i]=='<'||ch[i]=='/') break;
											System.out.print(ch[i]);
											
											flag=true;
											
										}
										
										if(flag==true) break;
									}
								}
								

									
								System.out.println();
								System.out.print("Price:$");
								while ((inputLine = in.readLine()) != null) {
									
									price=inputLine.indexOf("$");
									
									if(inputLine.indexOf("$")!=-1) {
									
										char[] ch=inputLine.toCharArray();
										
										for(int i=price;i<10;i++) {
											
											if(ch[i]=='>'||ch[i]=='/') break;
											else if(ch[i]=='.'||(ch[i]>='0'&&ch[i]<='9'))
											System.out.print(ch[i]);
											flag=true;
										
										}
										
										if(flag==true) {
											
										}
									}
								}System.out.println("\n");
						}
/*-----------------------------------------------------------------------*/
public   void Data5(String str2) throws IOException {
							
							URL source = new URL("https://www.betterworldbooks.com/product/detail/Assembly-Automation-and-Product-Design-9781574446432");
							BufferedReader in = new BufferedReader(
							            new InputStreamReader(
							            source.openStream()));
							String inputLine;
							
							boolean flag=false;
								int  price;
								int name;
								
								System.out.print("Books name and author Name:\n");	
								while ((inputLine = in.readLine()) != null) {
									
									flag=false;
									
									name=inputLine.indexOf("Asse");
									
									if(inputLine.indexOf("Asse")!=-1) {
									
										char[] ch=inputLine.toCharArray();
										
										for(int i=name;i<ch.length-72;i++) {
											
											if(ch[i]=='<'||ch[i]=='/') break;
											System.out.print(ch[i]);
											
											flag=true;
											
										}
										
										if(flag==true) break;
									}
								}
								

									
								System.out.println();
								System.out.print("Price:$");
								while ((inputLine = in.readLine()) != null) {
									
									price=inputLine.indexOf("$");
									
									if(inputLine.indexOf("$")!=-1) {
									
										char[] ch=inputLine.toCharArray();
										
										for(int i=price;i<10;i++) {
											
											if(ch[i]=='>'||ch[i]=='/') break;
											else if(ch[i]=='.'||(ch[i]>='0'&&ch[i]<='9'))
											System.out.print(ch[i]);
											flag=true;
										
										}
										
										if(flag==true) {
											
										}
									}
								}System.out.println();
						

	}
}

