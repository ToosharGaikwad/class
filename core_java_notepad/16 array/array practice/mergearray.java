import java.util.Scanner;
class MergeArray{
   

public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
	 
	int[] arr = new int[5];
	int[] brr = new int[5];
	int[] crr = new int[5];
	System.out.println("enter 5 element");
	for(int i= 0;i<arr.length;i++){
	arr[i] = sc.nextInt();
	}
	System.out.println("enter 5 element");
	for(int i= 0;i<brr.length;i++){
	brr[i] = sc.nextInt();
	}

        int size = arr.length;
        int size1 = brr.length;

        crr = new int[size + size1];

        int i = 0, j = 0, k = 0;

        // Copy arr into crr
        while (i < size) {
            crr[k++] = arr[i++];
        }	
		  
		  
		  while(j<size1){
		  crr[k++] = brr[j++];	
		  }	
   
	 System.out.print("array is ");
    	for(int x = 0; x < size + size1; x++) {
            System.out.print(" "+crr[x]);
  
}  
}
}






