package Array;

public class NearestNum {

	public static void main(String[] args) {
		
		int arr[] = {3,5,7,33,55};
		
		int nearest = arr[0];
		int target = 16;
		int mindiff = target - arr[0];
		
		if(mindiff<0) {
			mindiff = -mindiff;
		}
		
		for (int i=1;i<arr.length;i++) {
			int diff = arr[i]-target;
			
			if (diff<0) {
				diff = -diff;	
			}
			
			if(diff<mindiff)
			{
				diff = mindiff ;
				nearest = arr[i];
			}
			
			
		}
		
		
		System.out.println("The Nearest Number is  " + nearest);
	}

}
