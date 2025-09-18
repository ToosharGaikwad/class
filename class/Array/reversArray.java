import java.util.Scanner;

class  reverseArray{
	

	public static void main(String[] args){
	
	int[] arr = {1,2,3,4,5,6,7,8,9};
	
	int size = arr.length;
	
	for(int i=0;i<arr.length/2;i++){
	 int temp=0;
		
		temp = arr[size-1-i];
		arr[size - 1 - i] = arr[i];
		arr[i]=temp;
	
	}
	for(int i=0;i<size;i++){
		System.out.println(arr[i]);
	}
}
}
}