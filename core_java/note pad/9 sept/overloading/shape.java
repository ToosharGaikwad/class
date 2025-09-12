class shape{
   	double area;
	void caculatearea(trangle t){
	
	area =0.5*t.getbase()*t.getheight();
	System.out.println("area of trangle" + area);
	}
	
	void calculatearea(reactangle r){
	 area = 3.14 * (r.getbreadth() * r.getlength());
	System.out.println("area of trangle" + area);	
	}
	
	 void calculatearea(circle c){
	  area = c.getradius() * c.getradius();
	  System.out.println("area of circle" + area);
	}		
	}// end heere

	
	class trangle{
	double base;
	double height;
	void trangle(){
	this.base = 0;
	this.height=0;
	}

	trangle(double base ,double height){
	this.base = base;
	this.height = height;
	}
	
	
	//setter
	 void setbase(double b){
 	 	this.base=b;
	 }
	void setheight(double h){
 		this.height=h;
	 }
	double getbase(){ 
		return this.base;
	}
	double getheight(){ 
		return this.height;
	}


	void display(){
    	System.out.println("base: "+base);
 	System.out.println("height : "+height);
	}
	
}
class circle{
double radius;
 circle(){
this.radius = 3;
}
 circle(double r){
this.radius = r;
}

void setradius(double radius){
 this.radius = radius;
}

double getradius(){
return this.radius;
}

void display(){
System.out.println("radius: "+this.radius);
}
}

class reactangle{

	double length;
	double breadth;

 reactangle(double l,double b){
	this.length = 1;
	this.breadth = b;
	}

void display() {
    System.out.println("Length: " + length);
    System.out.println("Breadth: " + breadth);
}

void setlength (double l){
this.length = l;
}
void setbreadth (double b){
this.breadth = b;
}

double getlength(){
return this.length ;
}
double getbreadth(){
return this.breadth ;
}
}


class Test{

public static void main(String []args){
shape s1 = new shape();

trangle t1 = new trangle(4,6.0);
t1.display();
s1.caculatearea(t1);

circle c1 = new circle(5);
c1.display();
s1.calculatearea(c1);

reactangle r1 = new reactangle(2,6);
r1.display();
s1.calculatearea(r1);


}


}






















