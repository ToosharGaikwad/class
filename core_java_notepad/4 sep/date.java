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
void display(){

System.out.println(d2.day);
System.out.println(d2.dow);
System.out.println(d2.month);
System.out.println(d2.year);
}

}
// class ends here 

class test{

public static void main(String[] args){
date d1;
date d2;
d1 =new date();
d1.setDay(10);
d2 =new date();
d2.setDay(14);
d2.setmonth(5);
d2.setyear(2013);
// display();
if(d1.day>d2.day){
System.out.println("d1 is younger");

}else{
System.out.println("d2 is younger");
}
d1.setDow("sunday");
d1.setmonth(10);
d1.setyear(2020);
void display();
System.out.println(d1.day);
System.out.println(d1.dow);
System.out.println(d1.month);
System.out.println(d1.year);



}




}

