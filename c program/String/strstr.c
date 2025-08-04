

#include<stdio.h>
#include<string.h>
int substring(char [],char []);
int main(){
	char str[]="good morning";
	char str2[] = "mor";
	int index;
	index=substring(str,str2);
	if(index==-1){
		printf("substrin is not found");
	}else{
	printf("substring is found at %d",index);	
	}
	
}

int substring(char str1[],char str2[]){
    int i,j,k,l1,l2;
    l1 = strlen(str1);
    l2 = strlen(str2);
	 l1=l1-1;
	 l2=l2-1;
	for(i=0;i<l1;i++){
	
	for (j=0;j<=l2;j++){
		if(str1[i+j]!=str2[j])	
		break;
		
		}
		if(str2[j]=='\0'){
			return(i);
		}
		}
	return(-1);
}
	
	