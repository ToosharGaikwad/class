package p1;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Filedemo {
	

	public static void main1(String[] args) {
		try {
			
		
			FileOutputStream fos = new FileOutputStream("C:/Users/Avdhut/Desktop//filedemo//file.txt");
			
			DataOutputStream dos = new DataOutputStream(fos);
			
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			
			oos.writeObject(new student(11,"tushar",200));
			
			System.out.println("written succesfully");
			
		}catch (FileNotFoundException e){
				e.printStackTrace();
				
				}catch(IOException e) {
					e.printStackTrace();
				}
			
			

	}
	
	
	public static void main(String[] args) throws IOException {

	FileInputStream fos = new FileInputStream("C:/Users/Avdhut/Desktop//filedemo//file.txt");
	
	DataInputStream dos = new DataInputStream(fos);
	
	ObjectInputStream oos = new ObjectInputStream(dos);
	
	try {
		student s1 = (student)oos.readObject();
		System.out.println(s1);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}
	
	
	
	
	

}
