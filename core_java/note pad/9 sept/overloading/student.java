class Bank{
	
	
	
	void approveLoan(employee e1){
	if(e1.getannualSal()>12){
	System.out.println("approve Loan 7 Lakh");
	}else if(e1.getannualSal()>=10 && e1.getannualSal()<=12){
	System.out.println("approve Loan 6 Lakh");
	}

}
	void approveLoan(student s1){
	if(s1.getpersentage()>80){
	System.out.println("approve Loan 2 Lakh");
	}else if(s1.getpersentage()>60&&s1.getpersentage()<80){
	System.out.println("approve Loan 1 lakh");
	}
	else if(s1.getpersentage()>40&&s1.getpersentage()<60){
	System.out.println("approve Loan 50k");
	}
	}
	}
class student{
	int id,rollNo;
	double persentage;
	student(){
	this.id =22;
	this.rollNo =33;
	this.persentage = 88;
	}
	student(int i,int r,double p){
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

class employee{
	double  annualSal,id;
	String name;

  employee(){
	this.name = "sahil";
	this.annualSal = 7;
	this.id = 11;
	}
	employee(String name,double id,double annualSal){
	this.name = name;
	this.annualSal = annualSal;
	this.id = id;
	}
	void setid(double id){
	 this.id =id;
	}
	double getid(){
	return this.id;
	}
	void setannualSal(double annualSal){
	 this.annualSal =annualSal;
	}
	double getannualSal(){
	return this.annualSal;
	}
	void setname(String n){
	 this.name =n;
	}
	String getname(){
	return this.name;
	}
	void display(){
    	System.out.println("id: "+id);
 	System.out.println("name : "+name);
	System.out.println("annualSal : "+ annualSal);
	}
}
class testBank{
public static void main(String[] args){
	Bank b = new Bank();
	
	student s = new student(111,32,55);
	s.display();
	b.approveLoan(s);
	 
	employee e = new employee("Tushar",121,11);
	e.display();
	b.approveLoan(e);

}


}








