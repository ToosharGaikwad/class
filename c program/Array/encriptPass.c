	
	
#include<stdio.h>
//void decript()
void encript();

void main(){
 encript();
// decript();
}

void encript(){
	char str[]="TUshar";
	int i=0;
	while(str[i]!='\0'){
		str[i]=str[i]+9;
		i++;
	}
	printf("%s",str);
}	
	
	
	
//	void decript(){
//	char str[]="TUshar";
//	int i=0;
//	while(str[i]!='\0'){
//		str[i]=str[i]+9;
//		i++;
//	}
//	printf("%s",str);
//}	
//	
//	
	
	
	
	