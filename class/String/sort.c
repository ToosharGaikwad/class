#include<stdio.h>
#include<string.h>
void main(){
	char str[] = "abcdsdhdjjj";
	int size = strlen(str);
	int j=0;
	for(int i= 0;i<size;i++){

		if(str[i]!='d'){
		  str[j++] = str[i];
		}
			}
				str[j]='\0';
		printf("string is  %s",str);

	}

		
	
	
	
