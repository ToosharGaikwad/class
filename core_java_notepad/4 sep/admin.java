import java.util.Scanner;
class admin{
int id,salary;
double allowanc;
String name;


void setid(int id){
this.id = id;

}

int getid(){
return this.id ;
}

void setsalary(int salary){
this.salary = salary;}

int getsalary(){
return this.salary ;}


void setname(String name){
this.name = name;}

String getname(){
return this.name;}


void setallowanc(double allowanc){
this.allowanc = allowanc;}

double getallowanc(){
return this.allowanc;}

void display(){
System.out.println("id = "+ id);
System.out.println("name = "+name);
System.out.println("salry = "+salary);
System.out.println("allowanc = "+allowanc);

}

}
class adtest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

admin a = new admin();
System.out.println("enter a name");
String nm = sc.next();
a.setname(nm);


System.out.println("enter a id");
int id = sc.nextInt();
a.setid(id);

System.out.println("enter a salary");
a.setsalary(53322);
int salary = sc.nextInt();

System.out.println("enter a salary");
a.setallowanc(salary);
double allowanc = sc.nextDouble();
a.display();



}
}









