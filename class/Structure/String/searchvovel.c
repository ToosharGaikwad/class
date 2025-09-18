#include <stdio.h>
#include <string.h>
void main(){
	char str[] = "this is string";
	vovel(str);
	
}
	void vovel(char str[]){
	int j = 0 ;
int len = strlen(str);
	for(int k= 0;k<strlen(str);k++){
		if(str[k]=='a'||str[k]=='e'||str[k]=='o'||str[k]=='u'||str[k]=='i'){
				str[j++] = str[k];
		}
	
	
	}
	  str[j]='\0';
		printf("string is %s", str);
	}