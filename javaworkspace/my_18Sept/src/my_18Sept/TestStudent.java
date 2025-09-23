package my_18Sept;


	
class student{
	int id,rollNo;
	double persentage;
	student(){
		System.out.println("default");
	this.id =22;
	this.rollNo =33;
	this.persentage = 88;
	}
	student(int i,int r,double p){
		System.out.println("parameterised");
		
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



class placeStudent extends student{
	
		// TODO Auto-generated method stub

	
	String cName;
	String designation;
	
	 placeStudent(int id,int rollNo,double persentage,String cName, String designation) {
		super(id,rollNo,persentage);
		this.cName = cName;
		this.designation = designation;
	}
	 placeStudent() {
		super();
		System.out.println("default constructer");
		this.id = id;
		this.rollNo = rollNo;
		this.persentage = persentage;
		this.cName = cName;
		this.designation= designation;
	}
	
	
	 void display(){
		System.out.println();	
	    System.out.println("id: "+id);
	 	System.out.println("roll no : "+rollNo);
		System.out.println("persentage : "+persentage);
		System.out.println("cName "+ cName);	
		System.out.println("designation "+ designation);
		}
}






class TestStudent {

	public static void main(String[] args) {
		
		placeStudent p = new placeStudent(1,22,95,"wipro","manager");
		p.display();
	}

}
