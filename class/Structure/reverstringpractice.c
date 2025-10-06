#include<stdio.h>
#include<string.h>
void stringreverse(char str[]);
//void main(){
//	char str[] = "addla";
//	 stringreverse(str);
//}
//void stringreverse(char str[]){
//		int	flag =1;
//	int len = strlen(str);
//	for(int i =0;i<len/2;i++){
//		if(str[i]!=str[len-1-i]){
//		flag= 0;
//		
//		}
//	}
//	if(flag==0){
//		printf("palindrome not");
//	}
//	else{
//		printf("palindrome");
//	}
//}
void main(){
	char str[] = "alja";
	 int len = strlen(str);
	 int temp =0;
	 for(int i=0;i<len/2;i++){
	 	if(str[i]!=str[len-1-i]){
	 		 temp =1;
		 }
	 }
	 
	 if(temp==0){
	 	printf(" palindrome");
	 }
	 else {
	 	printf("not palindrome");
	 }
}
	
