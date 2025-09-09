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
void display(){

System.out.println("course id  = " +c_id);
System.out.println("fees  = " +fees);
System.out.println("course Name  = " +cName);
}

}
class cTest{
public static void main(String[] args){

course c = new course();
c.setc_id(789);
c.setfees(30000);
c.setcName("java fullstac");
c.display();


}

}







