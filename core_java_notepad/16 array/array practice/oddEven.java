import java.util.Scanner;

class oddEven{


	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10]; 
	System.out.println("enter a 10 numbers");
	for(int i=0;i<10;i++){
		arr[i] = sc.nextInt();
	}
	
	for(int i=0;i<10;i++){
		if(arr[i]%2==0){
			System.out.println(" The number is even "+arr[i]);
		}
		else{
		System.out.println(" The number is odd "+arr[i]);
	
		}
		
	}
  
	}

}
