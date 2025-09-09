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

void display(){
System.out.println("company name "+ co_name);
System.out.println("designation "+ designation);
System.out.println("distance "+ distance);

}
}


class testPl{
public static void main(String []args){
plStudent ps = new plStudent();
ps.setco_name("infosys");
ps.setdistance(455);
ps.setdesignation("web developer");
ps.display();
}
}






