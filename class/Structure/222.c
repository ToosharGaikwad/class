#include <stdio.h>
#include <string.h>

void main() {
    char str[] = "i am own union"; 
    int size = strlen(str);

    for (int i = 0; i < size; i++) {

        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || 
            str[i] == 'o' || str[i] == 'u') {

            
            for (int j = i; j < size; j++) {
                str[j] = str[j + 1];
            }

            size--;   
            i--;      
        }
    }

    printf(" %s\n", str);
}
