#include<stdio.h>
#include<string.h>
char* mystrtok(char* str,char delim);

void main() {
	char str[] = "my str is here";
	char delim =' ';
	char my = mystrtok(&str,delim);
	printf("%s",my);


}


char* mystrtok(char* str,char delim) {
	int i=0;
	static char* cloc = '\0';
	static char*  nextloc = '\0';

	if(str!=NULL) {
		cloc = str;  // cloc = current location

	} else {
		cloc = nextloc;

	}

	while(str[i]!= NULL) {

		if(str[i]==delim) {
			str[i]='\0';

			cloc = &str[i+1];

		}

		printf("%s \n",cloc);
		i++;
		return cloc;
	}

}