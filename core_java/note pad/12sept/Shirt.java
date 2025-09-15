class shirt{
	int id ;
	String brand,size,name;
	static double price;
	

	static{
	  price=10;
	}
	
 	void setid(int i){
 	 	this.id = i;
	}
	int getid(){
	 	return this.id;
	}
	static void setprice(double p){
 	 	price = p;
	}
	double getprice(){
	 	return price;
	}
	
	void setbrand(String brand){
 	 	this.brand = brand;
	}
	String getbrand(){
		 return this.brand;
	}
	void setname(String n){
 	 	this.name = n;
	}
	String getname(){
		 return this.name;
	}
	
	void setsize(String s){
 	 	this.size = s;
	}
	String getsize(){
		 return this.size;
	}

	void cal(){
	if(size.equals("medium")){
	price = price *1.1;
	}else if(size.equals("large")){
	price = price *1.2;
	}
	else if(size.equals("extralarge")){
	price = price *1.3;
	}
}

	shirt(){
		this.id = 33;
		this.name = "tushar";
		this.brand = "tata";
		this.size = "mediul";
	}
	 shirt(int id, String name, String brand, String size) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.size = size;
    }
	
	
	void display(){
	System.out.println("id = " + id);
	System.out.println("name = " + name);
	System.out.println("brand = " + brand);
	System.out.println("price = " + price);
	System.out.println("size = " + size);
	}
}

class shirtTest{
	 public static void main(String []args){
	shirt s = new shirt(10,"dljl","liagra","medium");
	shirt.price = 1000;
	shirt s1 = new shirt(10,"dhks","remond","extralarge");
	//s.cal();
	s.display();
	s1.cal();
	s1.display();

	}
	



}
