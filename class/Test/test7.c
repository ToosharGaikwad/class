//#include<stdio.h>
// void changepos();
//void main(){
//
//		//	printf("%d  ",arr[j]);
//		changepos();
//}
//void changepos(){
//		int arr[]={1,2,30,40,21,60,7,8};
//		int l = sizeof(arr)/4;
//		int temp;
//	
//		
//		temp=arr[3];
//		arr[3]=arr[5];
//		arr[5]=temp ;
//		
//		
////		Print the updated array
//    for(int i = 0; i < l; i++) {
//        printf("%d  ", arr[i]);
//    }
//
//}



//// check the string is palindrome or not 
//
int stringpalindrome(char *str);
int main(){
	char str[] ={"jjjnjjj"};
	int res = stringpalindrome(str);
	if(res ==1){
		printf("not palindrome");
	}
	else if(res ==0){
	printf("palindrome");	
	}
}

int stringpalindrome(char *str){

	int l = strlen(str);
	for(int i=0;i<l-1;i++){
		if(str[i]!=str[l-i-1]){
			return 1;
		}
			return 0;	
		}
	}













