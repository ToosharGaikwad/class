import java.util.Scanner;
class selsman{
int id,salary;
String name;
double incentive;


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

selsman(){
this.id = 101;
this.name = "rushikesh";
this.salary = 66533;
this.incentive = 999;

}


selsman(int id,String n,int s,int i){
this.id = id;
this.name = n;
this.salary = s;
this.incentive = i;

}



void display(){
System.out.println(id);
System.out.println(name);
System.out.println(salary);
System.out.println(incentive);
}
}


class selstest{
//public static void main1(String []args){


//selsman s1 = new selsman();
//s1.display();
//selsman s2 = new selsman(33,"tusha",332,84844);
//}



public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter id, Name, incentive, salary:");
int id = sc.nextInt();
String name = sc.next();
double incentive = sc.nextDouble();
double salary =  sc.nextDouble();

System.out.println(id+name+incentive+salary);
}

}












