class employee1{
int id;
String name;
double salary;



void setid(int i){
this.id = i;
}

void setname(String name){
this.name = name;
}

void setsalary(double salary){ 
this.salary = salary;
}
}// class ends here

class employee{
public static void main(String[] args){

employee1 e;
e = new employee1();
e.setid(12);
e.setname("tushar");
e.setsalary(10000);

System.out.println(e.name);
System.out.println(e.salary);
System.out.println(e.id);


}

}