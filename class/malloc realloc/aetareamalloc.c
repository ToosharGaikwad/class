
void getarea(int* length,int* width);

void main(){
	int length = (int*) malloc(sizeof(int)*1);
    int width = (int*) malloc(sizeof(int)*1);
    scanf("%d",length);
    scanf("%d",width);
	getarea(length, width);
}


	


void getarea(int* length,int* width){
	int area = (*length) * (*width);
	printf("%d \n",area);
}