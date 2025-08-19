//Create a structure named Book to store book details like title, author, and price.
//Write a C program to input details for three books,
//find the most expensive and the lowest priced books, and display their information.

#include<stdio.h>
#include<string.h>

typedef struct Book {

	char Name[25];
	char auther[25];
	int price;
	int id;
	int rating;
} Book;

void storebook(Book brr[], int size);
void displaybook(Book brr[],int size);
int searchbookByName(Book brr[],int size,char bname[]);
int searchbookByNamehint(Book brr[],int size,char bname[]);
int searchbookByid(Book brr[],int size,int bid);
int deletebookbyname(Book brr[],int* size,char newname[]);
int deletebookbyid(Book brr[],int* size,int newid);
void addbook(Book brr[],int* size);
int updateBook(Book brr[],int size,char newname[],char newauther[],int newprice,int newid,int newrating);
int sortbyprice(Book brr[],int size);
int findmostExpensive(Book brr[],int size);
int findmostchipe(Book brr[],int size);

void main() {
	Book brr[100];
	int size;
	size =3;
	char newname[22];
	int newid,rating,bid, newprice;
	char newauther[22];
	int choice;

	storebook(brr, size);
	while (1) { // infinite loop until user exits
		printf("\n------ MENU ------\n");
		printf("2. Display books\n");
		printf("3. Search by name\n");
		printf("31. Search by name hint\n");
		printf("4. Search by ID\n");
		printf("5. Delete by name\n");
		printf("6. Delete by ID\n");
		printf("7. Add book\n");
		printf("8. Update book\n");
		printf("9. Most expensive & cheapest\n");
		printf("10. Sort by price\n");
		printf("-1. Exit\n");
		printf("Enter your choice: ");
		scanf("%d", &choice);

		if (choice == -1) {
			printf("Exiting...\n");
			break; // exit loop
		}

		switch(choice) {
			case 31: {
				char bname[22];
				printf("enter a name you want to search by hint \n");

				scanf("%s",bname);
				int indexh = searchbookByNamehint(brr,size,bname);

				if(indexh!=-1) {
					printf(" book is awailable\n");
				} else {
					printf( "book is not awailable\n");
				}
				break;
			}
			case 2:
				displaybook(brr, size);
				break;

			case 3: {



				char bname[22];
				printf("enter a name you want to search by name \n");

				scanf("%s",bname);
				int index = searchbookByName(brr,size,bname);

				if(index!=-1) {
					printf(" book is awailable\n");
				} else {
					printf( "book is not awailable\n");
				}
				break;
			}
			case 4:
				printf("enter a id you want to search of book by id \n");
				scanf("%d",&bid);

				int sByid = searchbookByid(brr,size,bid);
				if(sByid==0) {
					printf(" book is awailable\n");
				} else {
					printf( "book is not awailable\n");
				}
				break;

			case 5: {
				printf("Enter the name of You want to delete book \n");
				scanf("%s",newname);
				int deletebyname = deletebookbyname(brr,&size,newname);
				if(deletebyname==1) {
					printf(" book is awailable \n");
					printf(" book is deleted\n");
				} else if(deletebyname==0) {
					printf(" book is not awailable \n");
					printf( "book is not deleted\n");
				}
				break;
				case 6:
					printf("Enter the id of You want to delete book  by id \n");
					scanf("%d",&newid);
					int deletebyid = deletebookbyid(brr,&size,newid);
					if(deletebyid==1) {
						printf(" book is awailable \n");
						printf(" book is deleted\n");
					} else if(deletebyid==0) {
						printf(" book is not awailable \n");
						printf( "book is not deleted\n");
					}
					break;
				}
			case 7: {

				printf("addbook : enter book name auther prise and id \n");
				addbook(brr,&size);
				displaybook(brr, size);
				break;
			}
			case 8: {

				printf("Enter a Name of book You want to update \n");
				scanf("%s",newname);
				printf("enter the book New name,New auther , and New price New id \n ");
				scanf("%s",newname);
				scanf("%s",newauther);
				scanf("%d",&newprice);
				scanf("%d",&newid);
				scanf("%d",&rating);

				updateBook(brr,size,newname,newauther,newprice,newid,rating);
				displaybook(brr,size);
				break;
			}
			case 9: {

				findmostExpensive(brr,size);
				findmostchipe(brr,size);
				break;
			}
			case 10: {
				sortbyprice(brr,size);
				printf("the books are sorted by price\n");
				displaybook(brr,size);
				break;
			}
		}
	}
}
void storebook(Book brr[],int size) {
	for(int i=0; i<size; i++) {
		printf("enter the book You want to store : name , book auther , and price , book id ,RATING \n");
		scanf("%s",brr[i].Name);
		scanf("%s",brr[i].auther);
		scanf("%d",&brr[i].price);
		scanf("%d",&brr[i].id);

		do {
			printf("Please rate 1 to 5: ");
			scanf("%d", &brr[i].rating);
		} while (brr[i].rating < 1 || brr[i].rating > 6);


	}

}
// display book
void displaybook(Book brr[],int size) {
	for(int i =0; i<size; i++) {
		printf("the Name =|%-10s| auther = |%-10s| price = |%-5d| id =|%-5d| rating =|%-5d| \n",brr[i].Name,brr[i].auther,brr[i].price,brr[i].id,brr[i].rating);
	}
}

// search book by name
int searchbookByNamehint(Book brr[],int size,char bname[]) {
	for(int i=0; i<size; i++) {
		if (strstr(brr[i].Name,bname)!=NULL) {
			return i;
		}

	}

	return -1;
}
int searchbookByName(Book brr[],int size,char bname[]) {
	for(int i=0; i<size; i++) {
		if (strcasecmp(brr[i].Name,bname)==0) {
			return i;
		}

	}

	return -1;
}


// search book by id
int searchbookByid(Book brr[],int size,int bid) {
	for(int i=0; i<size; i++) {
		if(brr[i].id==bid) {
			return 0;

		}
	}
	return-1;
}

// delete book by name

int deletebookbyname(Book brr[], int* size, char newname[]) {
	for(int i = 0; i < *size; i++) {
		if(strcasecmp(brr[i].Name, newname) == 0) {

			for(int j = i; j < *size - 1; j++) {
				brr[j] = brr[j + 1];
			}
			(*size)--;
			return 1;
		}

	}
	return 0;            // not found
}
int deletebookbyid(Book brr[], int* size,int newid) {
	for(int i = 0; i < *size; i++) {
		if(brr[i].id==newid) {

			for(int j = i; j < *size - 1; j++) {
				brr[j] = brr[j + 1];
			}
			(*size)--;
			return 1;
		}

	}
	return 0;            // not found
}


void addbook(Book brr[],int* size) {
	int count =0;

	if(count<99) {
		scanf("%s",brr[*size].Name);
		scanf("%s",brr[*size].auther);
		scanf("%d",&brr[*size].price);
		scanf("%d",&brr[*size].id);
		scanf("%d",&brr[*size].rating);
		(*size)++;
		count++;

	} else {
		printf("space is not awailable");
	}
}


int updateBook(Book brr[],int size,char newname[],char newauther[],int newprice,int newid,int newrating) {
	for(int i = 0; i <size; i++) {
		if(strcmp(brr[i].Name, newname) == 0) {

			strcpy(brr[i].Name, newname);
			strcpy( brr[i].auther, newauther);
			brr[i].price = newprice;
			brr[i].id =newid;
			brr[i].rating =newrating;
			return 1;
		}
	}
	return 0; // not found
}

int sortbyprice(Book brr[],int size) {
	Book temp;

	for(int i=0; i<size; i++) {
		for(int j=0; j<size-1; j++) {
			if(brr[j].price>brr[j+1].price) {
				temp = brr[j];
				brr[j] = brr[j + 1];
				brr[j + 1] = temp;
			}
		}
	}
}


int findmostExpensive(Book brr[],int size) {
	Book max=brr[0];
	for(int i=0; i<size; i++) {
		if(brr[i].price>max.price) {
			max=brr[i];
		}

	}
	printf("the most expencive book is %s",max.Name);

	return max.price;

}

int findmostchipe(Book brr[],int size) {
	Book min=brr[0];
	for(int i=0; i<size; i++) {
		if(brr[i].price<min.price) {
			min=brr[i];
			printf("The book is %s",brr[i].Name);
		}
	}
	printf("this is the most chipest book is %s",min.Name);
	return min.price;

}










