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

hrmaneger(){
this.id = 99;
this.name = "syz";
this.salary = 3325;
this.commition = 664;

}

hrmaneger(int i, String n,int s,int com){
this.id = i;
this.name = n;
this.salary = s;
this.commition =com;

}



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
m.display();
hrmaneger m1 = new hrmaneger(666,"tushar" , 55422,332);
m1.display();
}
}




