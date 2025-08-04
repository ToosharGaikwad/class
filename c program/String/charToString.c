#include<stdio.h>
#include<string.h>
//void main(){
 
//char str[] = { 'h','e','l','l','o','\0'};
//int i=0;
//while(str[i]!='\0'){
////	printf("%c",str[i]);
//	i++;
//}



//for(int i=0;i<5;i++){
//	printf("%c",str[i]);
//	
//}
//char str1[] = {"hello"};
//printf("%s",str1]);
	
///2 copy the string 
//char str1[]={"myfriend123"};
//char str[50] ;
//
//	
////	char res = strcpy(str1,str);
////    printf("%s",res);
//    int j=0;
//    while(str1[j]!='\0'){
//    	str[j]=str1[j];
//    	
//    	j++;
//	}
//
//printf("%s",str);


//  This code is not working 
//	
//	char str1[]={"hello"};
//	char str[]={"helll"};
//	int i=0;
//	int isequ=1;
//		while(str[i]!='\0'||str1[i]!='\0'){
//		if(str[i]!=str1[i]){
//	    isequ=0;
//	    break;
//		
//		}
//		i++;
//       if(isequ==1){
//       	printf("true");
//      
//	   }
//	   else{
//	   	printf("false");
//	   
//	   }

/// compare two strings
//
//char str1[] = "hello";
//    char str[] = "hell";
//    int i = 0;
//    int isequ = 1;
//
//    while(str[i] != '\0' || str1[i] != '\0') {
//        if(str[i] != str1[i]) {
//            isequ = 0;
//            break;
//        }
//        i++;
//    }
//
//    if(isequ == 1) {
//        printf("true");
//    } else {
//        printf("false");
//    }
//
//    return 0;
//}



 //print a index of character in string

//int strindex(char,char*);
//
//
//void main(){
//	
//    char newchar='o';
//	char str[]={"hello"};
//	strindex(newchar,&str);
//
//	
//}
//
//int strindex(char newchar,char* str){
//	int i=0;
//	while(str[i]!='\0'){
//	//	printf("for loop");
//		if(str[i]==newchar){
//			printf("%d",i);
//		   printf("hi");
//			
//		}
//		i++;	
//	}
//}




//  append one string to another string

//void strappend(char* ,char* );
//void main(){
//	char str1[23] ={"hi friends"};
//	char str2[] ={"Good"};
//	strappend(str1, str2);
//}
//
//void strappend(char* str1,char* str2){
//	int i=0;
//	int j=0;
//	while(str1[i]!='\0'){
//	
//		i++;
//	}
//		printf("%d",i);
//	    
//		while(str2[j]!='\0'){
//			str1[i]=str2[j];
//		
//			
//		        i++;
//				j++;
//		}
//		printf("%s",str1);
//		str1[i] = '\0'; 
//}


//  convert to lowerclass
void toLowercase(char str[]);
void main(){
	char str[] ={"HELLo friEND"};

 toLowercase(str);	
for(char i='A';i<='Z';i++){
	printf("%d",i);
	
	
}
	printf("%s",str);
}
void toLowercase(char str[] ){
	for(int i=0;str[i]!='\0';i++){
		
	
	if ( str[i]>='A'&&str[i]<='Z'){
		
		str[i] =str[i]+32;

	}
//	
}

}



// compare the length of string
//void cmplen(str1[],str2[])
//void main(){
//	char str1[] = {"hi friend"};
//	char str2[] = {"Goodg"};
//	cmplen(str1,str2);
//}
//
//
//int i;
//int j;
//   void cmplen(char str1[],char str2[]){
//	for(j=0;str1[j]!='\0';j++){
//		
//	}
//		for(i=0;str2[i]!='\0';i++){
//		
//	}
//	
//	if(i>j){
//		printf(" str2 is greter");
//	}else{
//	printf("str1 is greter");
//	}
//		
//}
//
//






