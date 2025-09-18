#include<stdio.h>
#include<string.h>
// mystrrev
		void mystrrev(char* str);
		void main(){
			  char str[]="This is a string";
			  
			  mystrrev(str);
			  printf("reversed string %s",str);
			}
		
		

		void mystrrev(char* str){
				int l = strlen(str);
				char ch,c;
	       	printf("%d",l);
	
			
				for(int j=0;j<l/2;j++){
					 ch= str[j];
					str[j]=str[l-1-j]; 
					str[l-1-j]=ch;
					
					return str[j]; 
			}
	           
	
}