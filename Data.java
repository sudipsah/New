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
		System.out.println("Information from Abe.com");
		System.out.println("----------------------------------------");
		String isbn1=listOfLines.get(0);
		String isbn2=listOfLines.get(1);
		String isbn3=listOfLines.get(2);
		String isbn4=listOfLines.get(3);
		String isbn5=listOfLines.get(4);
		Abe value =new Abe();
		value.Data1(isbn1);
		value.Data2(isbn2);
		value.Data3(isbn3);
		value.Data4(isbn4);
		value.Data5(isbn5);
		
		System.out.println("Information from Betterworldsbooks.com");
		System.out.println("----------------------------------------");
		String isbn6=listOfLines.get(5);
		String isbn7=listOfLines.get(6);
		String isbn8=listOfLines.get(7);
		String isbn9=listOfLines.get(8);
		String isbn10=listOfLines.get(9);
		BetterWorldBooks value1 =new BetterWorldBooks();
		value1.Data1(isbn6);
		value1.Data2(isbn7);
		value1.Data3(isbn8);
		value1.Data4(isbn9);
		value1.Data5(isbn10);
	
		
	}
}





