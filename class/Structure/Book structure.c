#include <stdio.h>
#include <string.h>

typedef struct Book {
    char Name[25];
    char auther[25];
    int price;
    int id;
    int rating;
} Book;

void storebook(Book brr[], int size);
void displaybook(Book brr[], int size);
int searchbookByName(Book brr[], int size, char bname[]);
int searchbookByNamehint(Book brr[], int size, char bname[]);
int searchbookByid(Book brr[], int size, int bid);
int deletebookbyname(Book brr[], int* size, char newname[]);
int deletebookbyid(Book brr[], int* size, int newid);
void addbook(Book brr[], int* size);
int updateBook(Book brr[], int size, char oldname[], char newname[], char newauther[], int newprice, int newid, int newrating);
void sortbyprice(Book brr[], int size);
int findmostExpensive(Book brr[], int size);
int findmostchipe(Book brr[], int size);

int main() {
    Book brr[100];
    int size = 3; // start with 3 books
    int choice;
    char newname[22], newauther[22], oldname[22];
    int newid, rating, bid, newprice;

    storebook(brr, size);

    while (1) {
        printf("\n------ MENU ------\n");
        printf("1. Display books\n");
        printf("2. Search by name\n");
        printf("3. Search by ID\n");
        printf("4. Delete by name\n");
        printf("5. Delete by ID\n");
        printf("6. Add book\n");
        printf("7. Update book\n");
        printf("8. Most expensive & cheapest\n");
        printf("9. Sort by price\n");
        printf("10. Search by name hint\n");
        printf("-1. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == -1) {
            printf("Exiting...\n");
            break;
        }

        switch (choice) {
            case 1:
                displaybook(brr, size);
                break;

           
            case 2: {
                char bname[22];
                int index;
                while (1) {
                    printf("Enter book name to search (or type 'exit' to stop): ");
                    scanf("%s", bname);

                    if (strcasecmp(bname, "exit") == 0)
                        break;

                    index = searchbookByName(brr, size, bname);
                    if (index != -1) {
                        printf("Book found: %s by %s, Price: %d, ID: %d, Rating: %d\n",
                               brr[index].Name, brr[index].auther, brr[index].price, brr[index].id, brr[index].rating);
                        break;
                    } else {
                        printf("Book not found! Try again.\n");
                    }
                }
                break;
            }

           
            case 3: {
                int index;
                while (1) {
                    printf("Enter book ID to search (or 0 to stop): ");
                    scanf("%d", &bid);

                    if (bid == 0)
                        break;

                    index = searchbookByid(brr, size, bid);
                    if (index != -1) {
                        printf("Book found: %s by %s, Price: %d, Rating: %d\n",
                               brr[index].Name, brr[index].auther, brr[index].price, brr[index].rating);
                        break;
                    } else {
                        printf("Invalid ID! Please try again.\n");
                    }
                }
                break;
            }

            
            case 4: {
                while (1) {
                    printf("Enter book name to delete (or 'exit' to stop): ");
                    scanf("%s", newname);

                    if (strcasecmp(newname, "exit") == 0)
                        break;

                    if (deletebookbyname(brr, &size, newname)) {
                        printf("Book deleted successfully!\n");
                        break;
                    } else {
                        printf("Book not found! Try again.\n");
                    }
                }
                break;
            }

            //  Delete by ID with Retry
            case 5: {
                while (1) {
                    printf("Enter book ID to delete (or 0 to stop): ");
                    scanf("%d", &newid);

                    if (newid == 0)
                        break;

                    if (deletebookbyid(brr, &size, newid)) {
                        printf("Book deleted successfully!\n");
                        break;
                    } else {
                        printf("Book not found! Try again.\n");
                    }
                }
                break;
            }

            //  Add book
            case 6:
                printf("Enter new book details (Name Author Price ID Rating):\n");
                addbook(brr, &size);
                break;

            //  Update book with Retry
            case 7: {
    while (1) {
        printf("Enter existing book name to update (or 'exit' to stop): ");
        scanf("%s", oldname);

        if (strcasecmp(oldname, "exit") == 0)
            break;

        int index = searchbookByName(brr, size, oldname);
        if (index == -1) {
            printf("Book not found! Please re-enter correct name.\n");
            continue;
        }

        printf("\n What do you want to update?\n");
        printf("1. Name\n");
        printf("2. Author\n");
        printf("3. Price\n");
        printf("4. ID\n");
        printf("5. Rating\n");
        printf("6. Update all fields\n");
        printf("Enter choice: ");
        int updateChoice;
        scanf("%d", &updateChoice);

        switch (updateChoice) {
            case 1:
                printf("Enter new Name: ");
                scanf("%s", brr[index].Name);
                break;
            case 2:
                printf("Enter new Author: ");
                scanf("%s", brr[index].auther);
                break;
            case 3:
                printf("Enter new Price: ");
                scanf("%d", &brr[index].price);
                break;
            case 4:
                printf("Enter new ID: ");
                scanf("%d", &brr[index].id);
                break;
            case 5:
                printf("Enter new Rating: ");
                scanf("%d", &brr[index].rating);
                break;
            case 6:
                printf("Enter new Name, Author, Price, ID, Rating:\n");
                scanf("%s %s %d %d %d",
                      brr[index].Name, brr[index].auther,
                      &brr[index].price, &brr[index].id, &brr[index].rating);
                break;
            default:
                printf("Invalid choice.\n");
                continue;
        }

        printf("Book updated successfully!\n");
        break; 
    }
    break;
}


            // Most Expensive & Cheapest
            case 8:
                findmostExpensive(brr, size);
                findmostchipe(brr, size);
                break;

            //  Sort by Price
            case 9:
                sortbyprice(brr, size);
                printf("Books sorted by price:\n");
                displaybook(brr, size);
                break;

            //  Search by Name Hint
            case 10: {
                char bname[22];
                printf("Enter partial name to search: ");
                scanf("%s", bname);
                int indexh = searchbookByNamehint(brr, size, bname);
                if (indexh != -1)
                    printf("Hint match found: %s by %s\n", brr[indexh].Name, brr[indexh].auther);
                else
                    printf("No book found with that hint\n");
                break;
            }

            default:
                printf("Invalid choice! Try again.\n");
        }
    }

    return 0;
}

//      FUNCTION DEFINITIONS 

void storebook(Book brr[], int size) {
    strcpy(brr[0].Name, "CProgramming");
    strcpy(brr[0].auther, "DennisRitchie");
    brr[0].price = 550;
    brr[0].id = 101;
    brr[0].rating = 5;

    strcpy(brr[1].Name, "LetUsC");
    strcpy(brr[1].auther, "YPKanitkar");
    brr[1].price = 300;
    brr[1].id = 102;
    brr[1].rating = 4;

    strcpy(brr[2].Name, "JavaBasics");
    strcpy(brr[2].auther, "JamesGosling");
    brr[2].price = 700;
    brr[2].id = 103;
    brr[2].rating = 5;
}

void displaybook(Book brr[], int size) {
    printf("\n%-15s %-15s %-10s %-10s %-10s\n", "Name", "Author", "Price", "ID", "Rating");
    for (int i = 0; i < size; i++) {
        printf("%-15s %-15s %-10d %-10d %-10d\n",
               brr[i].Name, brr[i].auther, brr[i].price, brr[i].id, brr[i].rating);
    }
}

int searchbookByNamehint(Book brr[], int size, char bname[]) {
    for (int i = 0; i < size; i++) {
        if (strstr(brr[i].Name, bname) != NULL)
            return i;
    }
    return -1;
}

int searchbookByName(Book brr[], int size, char bname[]) {
    for (int i = 0; i < size; i++) {
        if (strcasecmp(brr[i].Name, bname) == 0)
            return i;
    }
    return -1;
}

int searchbookByid(Book brr[], int size, int bid) {
    for (int i = 0; i < size; i++) {
        if (brr[i].id == bid)
            return i;
    }
    return -1;
}

int deletebookbyname(Book brr[], int* size, char newname[]) {
    for (int i = 0; i < *size; i++) {
        if (strcasecmp(brr[i].Name, newname) == 0) {
            for (int j = i; j < *size - 1; j++)
                brr[j] = brr[j + 1];
            (*size)--;
            return 1;
        }
    }
    return 0;
}

int deletebookbyid(Book brr[], int* size, int newid) {
    for (int i = 0; i < *size; i++) {
        if (brr[i].id == newid) {
            for (int j = i; j < *size - 1; j++)
                brr[j] = brr[j + 1];
            (*size)--;
            return 1;
        }
    }
    return 0;
}

void addbook(Book brr[], int* size) {
    if (*size < 100) {
        scanf("%s %s %d %d %d",
              brr[*size].Name, brr[*size].auther, &brr[*size].price,
              &brr[*size].id, &brr[*size].rating);
        (*size)++;
    } else {
        printf("No space available!\n");
    }
}

int updateBook(Book brr[], int size, char oldname[], char newname[], char newauther[],
                int newprice, int newid, int newrating) {
    for (int i = 0; i < size; i++) {
        if (strcasecmp(brr[i].Name, oldname) == 0) {
            strcpy(brr[i].Name, newname);
            strcpy(brr[i].auther, newauther);
            brr[i].price = newprice;
            brr[i].id = newid;
            brr[i].rating = newrating;
            return 1;
        }
    }
    return 0;
}

void sortbyprice(Book brr[], int size) {
    Book temp;
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (brr[j].price > brr[j + 1].price) {
                temp = brr[j];
                brr[j] = brr[j + 1];
                brr[j + 1] = temp;
            }
        }
    }
}

int findmostExpensive(Book brr[], int size) {
    Book max = brr[0];
    for (int i = 1; i < size; i++) {
        if (brr[i].price > max.price)
            max = brr[i];
    }
    printf("\nMost Expensive Book: %s (%d)\n", max.Name, max.price);
    return max.price;
}

int findmostchipe(Book brr[], int size) {
    Book min = brr[0];
    for (int i = 1; i < size; i++) {
        if (brr[i].price < min.price)
            min = brr[i];
    }
    printf("Cheapest Book: %s (%d)\n", min.Name, min.price);
    return min.price;
}
