#include<stdio.h>
#include<string.h>
void mystrcasecmp(char str1[],char str2[]);

void main(){
	char str1[]="mystring";
	char str2[]="ystRing";
	mystrcasecmp(str1,str2);
	
}

void mystrcasecmp(char str1[],char str2[]){
	int i=0;
	int isequ = 1;
	if(strlen(str1)!=strlen(str2)){
		printf("string are not equal");
		return;
	}
	
	while(str1[i]!='\0' || str2[i]!='\0'){
		 if (str1[i] >= 'a' && str1[i] <= 'z') {
            str1[i] = str1[i] - 32;
        }
        if (str2[i] >= 'a' && str2[i] <= 'z') {
            str2[i] = str2[i] - 32;
        }
	      if(str2[i] != str1[i]) {
			isequ = 0;
			break;
	
		}
    i++; 
    
}
if(isequ == 0){
    	printf("string not equal");
	}else{
		printf("string is equal");
	}

}


//