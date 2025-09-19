class hrmaneger{
int id,salary;
double commition;
String name;



void setid(int id){
this.id =id ;
}

int getid(){
return this.id ;
}

void setsalary(int salary){
this.salary = salary;}

int getsalary(){
return this.salary ;}



void setcommition(double commition){
this.commition = commition;}

double getcommition(){
return this.commition;}


void setname(String name){
this.name = name;}

String getname(){
return this.name;}



void display(){
System.out.println("id = "+ id);
System.out.println("name = "+ name);
System.out.println("salary = "+salary);
System.out.println("commition = "+ commition);

}

}

class hrtest{
public static void main(String[] args){
hrmaneger m = new hrmaneger();
m.setname("ga..u sadawarte");
m.setid(103);
m.setsalary(55022);
m.setcommition(9625);
m.display();

}
}




