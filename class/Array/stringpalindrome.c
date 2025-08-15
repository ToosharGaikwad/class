
#include<stdio.h>
#include<string.h>
int palendromestring(char str[]);
int main(){
	char str[] = "Good";
 palendromestring(str);
	
 }


 int palendromestring(char str[]){
	
//	char temp = strcmp(str);
	int len = strlen(str);
	
	int i=0;
	int flag =0;
	while(i<len/2){
		if(str[i]!=str[len-1-i]){
		
		   flag =1;
			break;
			
	}
	i++;
	len--;

 }
 	if(flag==0){
		printf("%s string is palindrome",str);
	}else if(flag==1){
	printf("%s string is not palindrome",str);	
	}
	return flag;
}


//
//
//#include <stdio.h>
//#include <string.h>
//
//int palendromestring(char str[]);
//
//int main() {
//    char str[] = "Good";
//    palendromestring(str);
//    return 0;
//}
//
//int palendromestring(char str[]) {
//    int len = strlen(str);
//    int flag = 0;
//
//    for (int i = 0; i < len / 2; i++) {
//        if (str[i] != str[len - 1 - i]) {
//            flag = 1;
//            break;
//        }
//    }
//
//    if (flag == 0) {
//        printf("%s is a palindrome string\n", str);
//    } else {
//        printf("%s is not a palindrome string\n", str);
//    }
//
//    return flag;
//}
//

//
