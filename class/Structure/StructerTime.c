//Define a structure named Time with members hours, minutes, and seconds.
// Write a C program to input two times, add them, and display the result in proper time format.

//struct Time{
//	int hours;
//	int minits;
//	int second;
//};
//
//
//#include<stdio.h>
//void main(){
//	struct Time t1,t2,result;
//	printf("Enter the Hours minit and second for time one");
//	scanf("%d%d%d",&t1.hours,&t1.minits,&t1.second);
//	
//	printf("Enter the Hours minit and second for time two");
//	scanf("%d%d%d",&t2.hours,&t2.minits,&t2.second);
//	
//			result.second = t1.second+t2.second;
//		    result.minits = t1.minits+t2.minits+result.second/60;
//		    result.hours = t1.hours+t2.hours+result.minits/60;
//		
//		result.minits %=60;
//		result.second %=60;
//		
//		printf("%02d:%02d:%02d: \n",result.hours,result.minits,result.second);
//	
//}


struct Time{
	int hours;
	int minits;
	int second;
};
struct Time addtime(struct Time t);
void display(t1);
#include<stdio.h>
void main(){N
	struct Time t1,t2;
	
      t1.hours = 5;
	 t1.minits = 542;
	 t1.second = 32;
	 display(t1);
	t1 = addtime(t1);
	
}


 struct Time addtime(struct Time t){
	
	int tsec = t.hours*3600+t.minits*60+t.second;
	t.hours = tsec/3600;
	int t1min = tsec%3600;
	t.minits = t1min/60;
	t.second= t1min%60;
	return t;
}

	void display(struct Time t){
		printf(" %d :%d :%d",t.hours,t.minits,t.second);
	}


















