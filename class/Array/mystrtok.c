#include<stdio.h>
#include<string.h>
char* mystrtok(char* str ,char delim);

void main(){
char str[] = "my str is here";	
char delim =' ';
char my = mystrtok(&str,delim);
printf("%s",my);


}


char* mystrtok(char* str ,char delim){
        int i=0;
  		static char* cloc = '\0';
  	    static char*  nextloc = '\0';
  		
  		if(str!=NULL){
  			cloc = str;
  			printf("in frist a if\n ");
		  }else{
		   cloc = nextloc;
		   printf("in frist a else\n ");
		  }
		
		while(str[i]!= NULL){
		
			if(str[i]==delim){
		    str[i]='\0';
		    	printf("in a while if statement\n");
		 cloc = &str[i+1];
	      
			}
		
	    printf("%s",cloc);
		i++;
			return cloc;
	}

}