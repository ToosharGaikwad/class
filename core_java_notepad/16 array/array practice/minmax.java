import java.util.Scanner;
class minMax{


public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int arr[] = new int[5];	
	

	for( int i=0; i<5; i++) {
	
	arr[i]=sc.nextInt();
	
	  }
		//for(int i=0; i<arr.length; i++) {

		//	System.out.println(arr[i]);

		//}
          int max = arr[0];
	   	 int  min = arr[0];
			for(int i=0;i<5;i++){
			    	if(arr[i]>max){
			    		max=arr[i];
					}
			
				}
				
				System.out.println(" the max number is "+max);
				
				for(int i=0;i<5;i++){
	        		if(arr[i]<min){
	    			min=arr[i];
				}
//			}
				
				System.out.println("Min number is "+min);

	}
		

}
}