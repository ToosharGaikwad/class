class course{
int c_id ,fees;
String cName;
//date duration;
 
void setc_id(int c_id){
this.c_id =c_id;
}
int getc_id(){
return this.c_id;}

void setcName(String cName){
this.cName = cName;
}
String getcName(){
return this.cName;}


void setfees(int fees){
this.fees =fees;
}
int getfees(){
return this.fees;}

course(){
this.c_id = 455;
this.fees = 6554;
this.cName = "dpmt";
System.out.println(" non parameterised");

}

course(int id,int fees,String cName){
this.c_id = id;
this.fees =fees;
this.cName = cName;
System.out.println("parameterised");
}



void display(){

System.out.println("course id  = " +c_id);
System.out.println("fees  = " +fees);
System.out.println("course Name  = " +cName);
}

}
class cTest{
public static void main(String[] args){

course c = new course();
c.display();
 
course c1 = new course(333,6666,"dpt");
c1.display();


}

}







