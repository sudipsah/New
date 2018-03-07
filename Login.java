package hell;

import java.io.*;

import java.util.ArrayList;

public class Login {


	public static void main(String args[]) throws IOException{
		BufferedReader bufReader = new BufferedReader(new FileReader("/Users/sudipshah/eclipse-workspace/file.txt"));
		ArrayList<String> listOfLines = new ArrayList<>(); 
		String  line = bufReader.readLine();
		while (line != null) { listOfLines.add(line); line = bufReader.readLine(); 
		
		}
		System.out.println("Search for Amazon sites");
		String s1=listOfLines.get(0);
		String s2=listOfLines.get(1);
		String s3=listOfLines.get(2);
		Data data1=new Data(s1);
		
		Data2 data2=new Data2(s2);
		data2.Data2a(s2);
		Data3 data3=new Data3(s3);
		data3.Data3a(s3);
		bufReader.close();
	}
	          
	        }





