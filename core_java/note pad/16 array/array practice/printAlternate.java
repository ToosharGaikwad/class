import java.util.Scanner;

class AlternatenumPrint{

	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 10 number");
	int []arr = new int[10];
	for(int i=0;i<10;i++){
		arr[i] = sc.nextInt();
	}
	
	for(int i=0;i<10;i++){
	    if(arr[i]%2!=0){
			System.out.println(" The alternate number is  "+arr[i]);
	
		
	}
  
	}



}
}