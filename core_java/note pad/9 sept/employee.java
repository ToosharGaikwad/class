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

emp(){
this.id =88;
this.name = "yuvraj";
this.salary = 8878.22;
}

emp(int i,String n,double sal){
this.id =i;
this.name = n;
this.salary = sal;
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
e.display();
emp e1 = new emp(666,"sonali",83324);
e1.display();
}

}







