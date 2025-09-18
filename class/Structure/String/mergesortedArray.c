#include <stdio.h>
#include<string.h>
void removechar(char str1[]);
void removeSec(char str2[]);
void mergeString(char str1[],char str2[]);
void main() {
	char str1[] = "Good morning";
	char str2[] = "welcome";
	removechar(str1);
	removeSec(str2);

	mergeString(str1,str2);

}


void mergeString(char str1[],char str2[]) {
	char str3[40];
	int j=0,i=0,k=0;
	while(str1[i]!='\0') {
		str3[k++] =str1[i++];
	}
	while(str2[j]!='\0') {
		str3[k++] =str2[j++];
	}
	str3[k]='\0';
	printf("Merged: %s\n", str3);
}

void removechar(char str1[]) {
	// sorting character is (a,s,o,m,r)
	int i=0;
	int j=0;
	while(str1[i]!='\0') {
		if(str1[i]=='o') {

			for(j=i; j<strlen(str1); j++ ) {
				str1[j]=str1[j+1];

			}
		} else {
			i++;
		}
	}
}




void removeSec(char str2[]) {
	int i=0;
	int j=0;
	while(str2[i]!='\0') {
		if(str2[i]=='e') {
			for (j=i; j<strlen(str2); j++) {
				str2[j]=str2[j+1];
			}
		} else {
			i++;
		}
	}
	//printf("%s",str2);
}

