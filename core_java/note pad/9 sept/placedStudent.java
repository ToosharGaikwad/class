class plStudent{

 String co_name , designation;
 int distance;

void setco_name(String co_name ){
this.co_name = co_name;
}

String getco_name(){
return this.co_name;
}


void setdesignation(String designation){
this.designation = designation;
}

String getdesignation(){
return this.designation;
}


void setdistance(int distance){
this.distance = distance;}

int distance(){
return this.distance;}


plStudent(){
this.co_name = "macfee";
this.designation = "ceo";
this.distance = 333;

}


plStudent(String cName,String ds,int d){
this.co_name = cName;
this.designation = ds;
this.distance = d;

}


void display(){
System.out.println("company name "+ co_name);
System.out.println("designation "+ designation);
System.out.println("distance "+ distance);

}
}


class testPl{
public static void main(String []args){
plStudent ps = new plStudent();

ps.display();
plStudent p = new plStudent("amazon" , "se",111);
p.display();
}
}






