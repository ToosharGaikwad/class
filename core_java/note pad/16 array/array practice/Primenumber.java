import java.util.Scanner;
class PrimeNum{

	public static void main(String []args){

 	int count =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number ");
	
	 int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < arr.length; i++) {
            count = 0;

            // check divisors from 2 to num/2
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    count = 1;
                    break;
                }
            }

            if (arr[i] > 1 && count == 0) {
                System.out.println("number is prime " + arr[i]);
            }
        }
    }
}

