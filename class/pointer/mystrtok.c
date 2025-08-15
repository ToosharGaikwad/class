#include<stdio.h>
#include<string.h>
char* mystrtok(char* str ,char delim);

void main(){
char str[] = "my str is here";	
char delim =",";
mystrtok(&str,delim);
}


char* mystrtok(char* str,char delim){
        int i=0;
  		static char* cloc = '\0';
  	    static char*  nextloc ='\0';
  		
  		if(str!=NULL){
  			cloc = str;
		  }else{
		   cloc = nextloc;
		  }
		
		while(str[i]!= NULL){
			if(str[i]==delim){
		    str[i]='\0';
		 cloc = &str[i+1];
		
			}
			printf("%s",cloc);
			return cloc;
	
		i++;
	}

}