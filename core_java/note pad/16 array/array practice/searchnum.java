import java.util.Scanner;
class search{
	public static void main(String []args){
 	Scanner sc = new Scanner(System.in);
	System.out.println("enter 10 number");
	
	int []arr= new int[10];
	for(int i=0;i<10;i++){
	arr[i] = sc.nextInt(10);	
    }
    	
	
	int num;
   System.out.println("Enter number You want to search  ");
    	 num = sc.nextInt();
    		
	for(int i=0;i<10;i++){
    	if(num==arr[i]){
    		System.out.println("the num is awailable in this array "+num);
		}
	}

    
}

}




