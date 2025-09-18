import java.util.Scanner;

class SumArray{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a how much number you want enter");
	int num = sc.nextInt();
	System.out.println(" first array is ");
int[] arr = new int[num];
for(int i=0;i<num;i++){
		arr[i] = sc.nextInt();
	}
	System.out.println(" second array is ");
int[] brr = new int[num];
for(int i=0;i<num;i++){
		brr[i] = sc.nextInt();
	}

int[] crr = new int[num];
for(int i=0;i<num;i++){
	crr[i]=arr[i]+brr[i];
}
 for(int i = 0; i < num; i++) {
        System.out.println( "array is "+crr[i]);
    }
 }
}