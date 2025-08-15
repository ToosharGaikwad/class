#include<stdio.h>
 int diposit();
 int withdraw();
void displayAmount();
void main(){
	// first question is not get any conclusion
	// calculate selling price of boookk based on cost price and discount 
	// initialize some amount in our acc then gobr choice diposit or withdraw and display updated if amount less 3000 not withdraw
//		int price =500;
//	int discount =10;
//	int spdiscount =20;
//	printf("enter 10,20,30");
//	int no;
//	scanf("%d",&no);
//	if(discount ==no){
//		int cal = price*0.10;
//		int sprice = price-cal;
//		printf("%d",sprice);
//	}
printf("enter 1 for display amount \n enter 2 for diposit amount \n enter 3 for withdraw amount ");
		int no;
		scanf("%d",&no);
		if(no==1){
			displayAmount();
			
		}else if(no==2){
		diposit();
		
		}
		else if(no==3){
			
				withdraw();	
			
			}
}
	
    




	int	diposit(){
			int acc=10000;
			int addamount ;
			scanf("%d",&addamount);
			if(addamount>0){
				acc=acc+addamount;
			printf("%d",acc);
			}
		}
int	withdraw(){
			int acc=10000;
			int withdrawamount ;
			scanf("%d",&withdrawamount);
			acc=acc-withdrawamount;
			 if(withdrawamount>0&&acc>3000){
			printf(" amount is %d",acc);
			}else if(acc<3000){
				printf("not sufficieant balance ");
			}
			
		}
	void displayAmount(){
		printf("Your Account bal is 10000");
		}






