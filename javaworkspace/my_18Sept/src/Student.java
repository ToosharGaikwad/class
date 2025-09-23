import java.util.Scanner;
class substudent{

	int id,rollNo;
	double persentage;
	
	substudent(){
	this.id =22;
	this.rollNo =33;
	this.persentage = 88;
	}
	substudent(int i,int r,double p){
	this.id =i;
	this.rollNo =r;
	this.persentage = p;
	}
        void setid(int id){
        this.id = id;
}
	void setrollNo(int r){
        this.rollNo = r;
}
	void setpersentage(double p){
        this.persentage = p;
}
	int getid(){
	return this.id;

}
	
int getrollNo(){
return this.rollNo;
}
double getpersentage(){
 return this.persentage;
}
void display(){
	System.out.println("id: "+id);
	System.out.println("roll no : "+rollNo);
	System.out.println("persentage : "+persentage);
}
}
class placeStudent extends substudent{
	String designation;
	int distance;
	 placeStudent() {
		
		this.designation = "developer";
		this.distance = 500;
	}
	public placeStudent(String designation, int distance , int id,int rollNo,double persentage) {
	super(id,rollNo,persentage);
	
		this.designation = designation;
		this.distance = distance;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	void display() {
		super.display();
		System.out.println("designation is "+ designation);
		System.out.println("distance is "+ distance);
	}
	
}

	
class Student {

	public static void main(String[] args) {
		
		placeStudent p = new placeStudent();
		p.display();

	}

}
