
#include<stdio.h>
#include<string.h>
int palendromestring();
int main(){
 palendromestring();
	
 }


 int palendromestring(){
	char str[] = "Good";
//	char temp = strcmp(str);
	int len = strlen(str);
	len=len-1;
	int i=0;
	int flag =0;
	while(i<len/2){
		if(str[i]!=str[len-i]){
			printf("hi");
		   flag =1;
			break;
			
	}
	i++;
	len--;

 }
 	if(flag==0){
		printf("%s string is palindrome",str);
	}else if(flag==1){
	printf("%s string is not palindrome",str);	
	}
}