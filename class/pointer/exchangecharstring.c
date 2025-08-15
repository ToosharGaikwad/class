//WAP to Form a New String where the First Character and the Last Character have
//been Exchanged


#include<stdio.h>
void exChar(char* str);
void main(){
	char str[] = {"string is here"};
	exChar(str);
}

void exChar(char* str){
	int len = strlen(str);
	     if(len>1){
	   char temp ;
		temp = str[0];
		str[0] = str[len-1] ;
		str[len-1] = temp;
		printf("%s",str);
		
	 }	
}