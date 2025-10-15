package p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewrite {
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		try {
			FileReader fw = new FileReader("D://filew.txt//");
			BufferedReader bf = new BufferedReader(fw);
			
			String str = bf.readLine();
			while(str!=null){
				System.out.println(str);
				str = bf.readLine();
			} 
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

 catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("io exception");
		}
		
		

		FileWriter fw2 = null;
		try {
			fw2 = new FileWriter("D://filew.txt//");
		} catch (IOException e) {
			System.out.println("input output exception");
			e.printStackTrace();
		}
		BufferedWriter bf2 = new BufferedWriter(fw2) ;
		
		
		
		
		
		
		
		while(bf2!=null) {
			try {
				bf2.write("D://filew1.txt//");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
       

		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
	


