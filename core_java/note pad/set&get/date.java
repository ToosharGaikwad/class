class date {
int day,month,year;
String dow ;

void setDay(int d){ 
this.day = d;
}

void setDow(String str){
this.dow  = str;
} 

void setmonth(int month){
this.month = month;
} // class ends here 


void setyear(int year){
this.year = year;
} 

}// class ends here 

class test{

public static void main(String[] args){
date d1;
d1 =new date();
d1.setDay(10);
d1.setDow("sunday");
d1.setmonth(10);
d1.setyear(2020);
System.out.println(d1.day);
System.out.println(d1.dow);
System.out.println(d1.month);
System.out.println(d1.year);


}




}
