#include <stdio.h>

// Function declarations
int searchElement(int, int, int*);
void deleteElement(int*, int*, int);
void displayArray(int, int*);
void inseartEle(int* arr,int* no);
int main() {
    int choice, no ;
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 80, 9, 10};
    int size = sizeof(arr) / sizeof(arr[0]);

    while (1) {
        printf("\n\n===== MENU =====\n");
        printf("1. Display elements\n");
        printf("2. Search element\n");
        printf("3. Delete element\n");
        printf("4. Exit\n");
        printf("5. Inseart element\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);  // Fix: use &

        switch (choice) {
            case 1:
                displayArray(size, arr);
                break;
            case 2:
                printf("Enter number to search: ");
                scanf("%d", &no);
                if (searchElement(no, size, arr) != -1)
                    printf("Element found.\n");
                else
                    printf("Element not found.\n");
                break;
            case 3:
                printf("Enter number to delete: ");
                scanf("%d", &no);
                deleteElement(arr, &size, no);
                break;
            case 4:
                printf("Exiting program.\n");
                return 0;
            case 5:            	
					printf("Enter number You want to inseart");
					scanf("%d",&no);
			    	inseartEle(int arr,int no);
			    	
            default:
                printf("Invalid choice.\n");
        }
    }

    return 0;
}

// Function to display array
void displayArray(int size, int *arr) {
    printf("Array elements: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Function to search an element
int searchElement(int no, int size, int *arr) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == no)
            return i;  // Return index if found
    }
    return -1; // Not found
}

// Function to delete an element

void deleteElement(int *arr, int *size, int no) {
    int pos = searchElement(no, *size, arr);
    if (pos == -1) {
        printf("Element not found, can't delete.\n");
        return;
    }
    for (int i = pos; i < *size - 1; i++) {
        arr[i] = arr[i + 1]; // Shift elements
    }
    (*size)--; // Reduce size
    printf("Element deleted successfully.\n");
}

void inseartEle(int* arr,int no){
	int i=0;
	
	while(arr[i]<10000){
		arr[i]+no;
		printf("%d",no);
		i++;
	}
}