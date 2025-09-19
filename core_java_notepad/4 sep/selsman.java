class selsmaneger{

int id;
String name;
double incentive;
double salary;


void setid(int id){
this.id =id;
}

 int getid(){
return this.id;
}

void setname(String name){
this.name=name;
}

String getname(){
return this.name;
}
 
void setsalary(int salary){
this.salary = salary;
}

double getsalary(){
return this.salary;
}
void setincentive(double incentive){
this.incentive =incentive;}

double getincentive(){
return this.incentive;
}


void display(){
System.out.println(id);
System.out.println(name);
System.out.println(salary);
System.out.println(incentive);
}
}


class selstest{
public static void main(String []args){

selsmaneger s1 = new selsmaneger();
s1.setid(12);
s1.setname("xyz");
s1.setsalary(566545);
s1.setincentive(1253);
s1.display();


}

}












