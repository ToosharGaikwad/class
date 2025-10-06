  #include<stdio.h>
void main(){
	
//	int no=1;
//	
//     while(no<10){
//     	 printf("%d",no);
//     	 
//     	no++;
//	 }
//   





// print a table 
//

//int i =1;
//
//
//while(i<=10){
//	printf("%d\n",5*i);
//	i++;
//} 
// 	
//}




// check the number is prime or not

//int i = 2,no =7,flag=0;
//while(i<no){
//if(no%i==0)	{
//		flag =1;
//	printf("number is not prime");
//
//	break;
//}
//	i++;
//}
//if(flag==0){
//	printf("number is prime");
//}




// sum of numbers
//
//int no = 5,temp;
//int i=1,sum=0;
//
//while(i<=5){
//    temp= 1*i;
//	sum = sum+temp;
//
//	i++;
//}
//
//	printf("%d",sum);


 //factoreal of numbers
//
//int n=5,fa=1;
//
//
//
//while(n>0){
//fa=	fa*n;
//n--;
//	}
//
//printf("%d",fa);


  //check the given number is strong or not

//int no = 145,r,sum=0;
//int temp =no;
//
//while(no>0){
//	int fa = 1;
// r = no%10;
// no=no/10;
// 
////printf("%d",r);
//
//while(r>0){
//  fa = fa*r;
//
//r--;	
//}
//
////printf("%d",fa);
//
//sum+=fa;
//}
//if(sum==temp){
//	printf("%d number is strong",temp);
//}
//
//
//printf("%d",sum);
//







// perfect number
//
//int no=28,i=1,sum=0;
//while(i<no){
//	
//	if(no%i==0){
////	printf("%d ",no);
//	}

//	i++;
//}
//sum=sum+i;
//
////printf("%d",sum);
//
//if(sum==no)
//printf("number is perfect %d",sum);



// find the sum of frist and last digit
//
//int no = 35345;
//int ld = no%10, fd ;
//while(no>0){
//	 fd = no%10;
//	  no = no/10;
//
//	
//}
//
//int sum=ld+fd;
//printf("%d",sum);
//
//


// find armstrong number
//int no =1234;
//while(no>0){
//	
//	int rem=no%10;
////	no=no/10;

  /// int res=1;
  // for(int i=1;i<=no;i++){
//   	int no=1234,rem,sum =0;
//   	int temp=no;
//   	while (temp>0){
//   		rem=temp%10;
//   		rem = rem *rem *rem*rem;
//   		sum = sum +rem;
//   	//	printf("%d",sum);
//   		
//   	//	printf("%d",temp);
//   		 if(sum==no){
//   		 	printf("%d no is armstrong",sum);
//			}
//			temp = temp/10;
//			printf("%d",sum);
//	      		   }
//	   
//  // }
//  



////// find armstrong number 
////
////int no =1234;
////int count=0 ,rem ,mul=1;
////
////while(no>0){
////	count++;
////no = no/10;
////	
////	
////		printf("%d",count);
////}
////
//////while(no>0){
//////  rem =	no%10;
//////  while(count>0){
//////  	mul= rem*rem;
//////  	printf("%d",mul);
//////  		printf("hi");
//////  	count--;
//////  
//////}
//////}   commented because not complited


// practice of mock question date is 4/10 /2025;
//int rem;
//int rev=0;
//int no = 1261;
//int temp = no;
//    for(int i= 0;i<4;i++){
//    		rem= no%10;
//    		rev = rev * 10+rem;
//            no = no/10;
//	   if(rev == temp){
//		printf("no is palindrome",no);
//	}else{
//		printf("not palindrome");
//		break;
//	}
//
//	}

//   strong number

	int no = 145;
	int temp = no;
	int rem;
	int sum = 0;
	while(no>0){
		rem= no%10;
		no = no/10;
	int fact =1;
		
			for(int i= 1;i<=rem;i++){
			fact = fact*i;
	}
		sum = sum+fact;
	

	}

	if(sum==temp){
			printf("no is strong %d", temp);}
		else{
			printf("not strong");
		
		}
	
}

//	int no = 422;
//	int temp =no;
//	int rem;
//	int sum=0;
//		int count =0;
////	while(no>0){
////	
////		
////	rem	=no%10;
////	no = no/10;
////		count++;
////		}
////		printf("count = %d",count);
//		
//	while(no>0){
//		
//		rem	=no%10;
//		no = no/10;
//		count++;
//		for(int i=0;i<count;i++){
//			rem = rem*rem;
//			sum +=rem;
//			
//			
//		}
//		printf("%d ",sum);
//	}
//	
//	}
//
//
//
//
//
//


