class emp{
int id ;
Double salary;
String name;

void setid(int id){
this.id = id;}
 
int getid(int id){
return this.id;}

void setsalary(double salary){
this.salary = salary;}

double getsalary(){
return this.salary;}
void setname(String name){
this.name = name;
}
String getname(){
return this.name;
}
void display(){
System.out.println("id = " + id);
System.out.println("name = " + name);
System.out.println("salary = " + salary);
}
}

class emptest{

public static void main(String[] args){

emp e = new emp();

e.setid(234);
e.setname("ranjeet");


e.setsalary(235343.3);
e.display();
}

}







