// write a program remove duplicate char from string
#include<stdio.h>
#include<string.h>
void removedup(char* str);
void main(){
	
	char str[] = {"abccddef"};
	
    removedup(str);
   printf("after removing duplicate is %s",str);
	
}

void removedup(char* str){
	int index = 0;
		int len = strlen(str);
	for(int i=0;i<len;i++){
		int dup = 0 ;
		
		for(int j=0;j<index; j++){
			if(str[i]==str[j]){
			dup = 1;
			}	
		}
		if(!dup){
			str[index++]=str[i];
			printf("%d\t",index);
		}
	
	}
	str[index]='\0';
}


// accept age of five peaple and ticket amount and then caluclate total amount to ticket to travel for all of them based on followining codi
//chiltren bello 12 = 30%
// above 59 is 50% discount '
// and all other full ticket
//void storeage(int arr[]);
//void calculatedis(int arr[],int ticketprice);
//void main(){
//    int ticketprice =100;
//	int arr[5];
//     
//	
//	storeage( arr);
//	calculatedis(arr,ticketprice);
//}	
//	
//
//void storeage(int arr[]){
//	for(int i=0;i<5;i++){
//	printf("enter the age of person");
//	scanf("%d",&arr[i]);
//}
//}
//void calculatedis(int arr[],int ticketprice){
//	 int total = 0;
//	for(int i=0;i<5;i++){
//		int price=0;
//		 if(arr[i]>59){
//		 price = ticketprice/2;
//		 }else if(arr[i]<13){
//		 	price = ticketprice/3;
//		 }else{
//		 	price = ticketprice;
//		 }
//		 total += price;
//	}
//	printf(" total of ticket price %d",total);
//  
//}
//
//










