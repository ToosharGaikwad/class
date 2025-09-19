class date {
int day,month,year;
String dow ;

void setDay(int day){ 
this.day = day;
}

int getDay(){ 
return this.day;
}

void setDow(String str){
this.dow  = str;
} 

String getDow(){
return this.dow;
} 

void setmonth(int month){
this.month = month;
} 

int getmonth(){
return this.month;
}

void setyear(int year){
this.year = year;
} 

void getyear(){
this.year = year;
} 
date(){
this.day = 4;
this.month =12;
this.year =2010;
this.dow = "sunday";
}

date(int d,int m , int y, String day){
this.day = d;
this.month =m;
this.year =y;
this.dow = day;
}


void display(){

System.out.println("day = " + day);
System.out.println("month = " + month);
System.out.println("year = " + year);
System.out.println("day  of week = " + dow);
}

}
// class ends here 

class test{

public static void main(String[] args){
date d1;
date d2;
d1 =new date();
d2 =new date(4,3,2222,"friday");

//d1.setDay(10);
//d2.setDay(14);
//d2.setmonth(5);
//d2.setyear(2013);
// display();
//if(d1.day>d2.day){
//System.out.println("d1 is younger");

//}else{
//System.out.println("d2 is younger");
//}
//d1.setDow("sunday");
//d1.setmonth(10);
//d1.setyear(2020);

d1.display();
d2.display();














//System.out.println(d1.day);
//System.out.println(d1.dow);
//System.out.println(d1.month);
//System.out.println(d1.year);

}
}

