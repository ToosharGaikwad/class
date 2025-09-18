class Student{
	 int fbs_id ;
	 String s_name;
	int distance_travel;
	 static int student_count;

	static {
	student_count = 0;
	}
	//void setstudent_count(){
	//student_count = count;
	//}
	static int getstudent_count(){
	 return student_count;
	}
	void setfbs_id(int fbs_id){
	this.fbs_id = fbs_id;
	}
	int getfbs_id(){
	return this.fbs_id;
	}
	void setdistance_travel(int distance){
	this.distance_travel = distance;
	}
	int getdistance_travel(){
	return this.distance_travel;
	}
	void sets_name(){
	this.s_name = s_name;
	}
	String gets_name(){
	return this.s_name;
	}
	Student(){
	this.fbs_id = 66;
	this.s_name = "tushar" ;
	this.distance_travel = 99;
	
	}
	Student(int id, String name,int distance,int student_count){
	this.fbs_id = id;
	this.s_name = "name";
	this.distance_travel = distance;
	
	}

	void display(){
	System.out.println("fbs_id = "+fbs_id);
	System.out.println("s name = "+s_name);
	System.out.println("distance travel = "+distance_travel);
		
	}
}
class sTest{
	public static void main(String[] args){
	
	Student s1 = new Student(32,"tushar",33,2);
	
	Student s2 = new Student(1,"hsu",44,322);
	s2.display();
	s1.display();
	Student.getstudent_count();
}
}
