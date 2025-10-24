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
//		
//		
//
////		try{
//////				BufferedWriter br=new BufferedWriter(fileWriter);
////				FileReader fileReader=new FileReader("D://filew.txt//");
////				BufferedReader br =new BufferedReader(fileReader);
////		
////			String str=br.readLine();
////			while(str!=null)
////			{
////				System.out.println(str);
////				br.read(str);
//////				br.newLine();
////				str = br.readLine();
////			}
////				
////		}
////			catch(Exception e)
////			{
////				System.out.println("something wrong");
////			}
////			
////	}
////	
////	
////}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		Scanner sc = new Scanner(System.in);
////		try {
////			
////			
////			FileReader fw = new FileReader("D://filew.txt//");
////			BufferedReader bf = new BufferedReader(fw);
////			
////			String str = bf.readLine();
////			while(str!=null){
////				System.out.println(str);
////				str = bf.readLine();
////					
//////				FileWriter fileWriter = new FileWriter("D://filew1.txt//");
//////				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
////				
//////				fileWriter.write("helell");
////				String str1 ;
////				str=sc.next();
////				
////				while(true) {
////		FileWriter fileWriter = new FileWriter("D://filew1.txt//");
////								
//////				}	
////			} 
////			
////			bf.close();
////	}
//		
//		
//		
//		
//
//		
////		
////		Scanner sc = new Scanner(System.in);
////			try {
////				FileWriter fw = new FileWriter("D://filew.txt");
////				
////			
////				String str;
////	            System.out.println("Enter text to write into file (type 'stop' to finish):");
////
////				while(true) {
////					str = sc.nextLine();
////					
////					if(str.equalsIgnoreCase("stop")) {
////						break;	
////					}
////					fw.write(str);
////				}
////				
////				
////			} catch (IOException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////				System.out.println("i o exception");
////			
////			}
////		sc.close();
//		
//		
//		 try (FileWriter fw = new FileWriter("D://filew.txt")) {  // try-with-resources automatically closes
//
//	            fw.write("lkjlkj\n");
//
//	            System.out.println("Enter text (type 'stop' to finish):");
//
//	            while (true) {
//	                String str = sc.nextLine();   // read one line
//	                if (str.equalsIgnoreCase("stop")) {
//	                    break;                   // exit loop
//	                }
//	                fw.write(str + "\n");         // write line to file
//	            }
//
//	            System.out.println("✅ File written successfully!");
//
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	            System.out.println("❌ IO Exception occurred");
//	        } finally {
//	            sc.close();   // close Scanner safely
//	        }
//	    }
//	}





//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Filewrite {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        try (FileWriter fw = new FileWriter("D://filew.txt")) {  // try-with-resources automatically closes
//
//           
//            System.out.println("Enter text (type 'stop' to finish):");
//
//            while (true) {
//                String str = sc.nextLine();   // read one line
//                if (str.equalsIgnoreCase("stop")) {
//                    break;                   // exit loop
//                }
//                fw.write(str + "\n");         // write line to file
//            }
//
//            System.out.println("✅ File written successfully!");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("❌ IO Exception occurred");
//        } finally {
//            sc.close();   // close Scanner safely
//        }
//    }
//}
//
//		Scanner sc = new Scanner(System.in);
//
//      try {
//		FileWriter filewriter = new FileWriter("D://filew.txt");
//		String str;
//		while(true) {
//			str = sc.nextLine();
////			filewriter.write(str);
//			BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
//			bufferedWriter.write("lkjl ;");
//			if(str.equalsIgnoreCase("stop")){
//				break;
//			}
//			
//		}
//		filewriter.close();
//	  } catch (IOException e) {
//		e.printStackTrace();
//	  }
//      
//      sc.close();
//      
      
		Scanner sc = new Scanner(System.in);
		try {
			
			FileReader fw = new FileReader("D://filew1.txt//");
			BufferedReader bf = new BufferedReader(fw);

			
			FileWriter  fileWriter = new FileWriter("D://filew.txt//");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			String str;
			
			str = bf.readLine();
			System.out.println(str);
			while((str = bf.readLine())!=null){
				bufferedWriter.write(str);
				System.out.println(str);
				bufferedWriter.newLine();
				
			} 
			
			bufferedWriter.close();
			bf.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

 catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("io exception");
		}
		
		

      
	}
	
}