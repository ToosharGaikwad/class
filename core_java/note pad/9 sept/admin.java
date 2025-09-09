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

admin(){  //default constructer
this.salary = 84552;
this.name =" saurabh";
this.id = 120;
System.out.println("  non parameterised constructer ");
}

admin(int salary,int id ,String name){
this.salary = salary;
this.id = id;
this.name = name;
System.out.println(" parameterised constructer ");
}


void display(){
System.out.println("id = "+ id);
System.out.println("name = "+name);
System.out.println("salry = "+salary);
System.out.println("allowanc = "+allowanc);

}


}
class adtest{
public static void main(String[] args){
admin a = new admin();
a.display();

admin a1 = new admin(12310,321,"sachine");
a1.display();

//a.setname("sadawarte");
//a.setid(1223);
//a.setsalary(53322);
//a.setallowanc(2685);
//a.display();



}
}









