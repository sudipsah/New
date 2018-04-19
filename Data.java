import java.io.*;

import java.util.ArrayList;

public class Data {


	public static void main(String args[]) throws IOException{
		BufferedReader bufReader = new BufferedReader(new FileReader("/Users/sudipshah/eclipse-workspace/file.txt"));
		ArrayList<String> listOfLines = new ArrayList<>(); 
		String  line = bufReader.readLine();
		while (line != null) { 	
		listOfLines.add(line); line = bufReader.readLine(); 
		}
		System.out.println("Information from Abe.com\n");
		String isbn1=listOfLines.get(0);
		String isbn2=listOfLines.get(1);
		String isbn3=listOfLines.get(2);
		Abe value =new Abe();
		value.Data1(isbn1);
		value.Data2(isbn2);
		value.Data3(isbn3);


		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Information from Amazon.com\n");
		String isbn4=listOfLines.get(3);
		String isbn5=listOfLines.get(4);
		String isbn6=listOfLines.get(5);
		Data1 value1 =new Data1(isbn4);
		value1.Data2(isbn5);
		value1.Data3(isbn6);
		*/
		
	}
}





