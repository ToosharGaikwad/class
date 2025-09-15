class product{
	int id ,quantity;
	String name;
	static int price;

	static{
	  price =10;
	}
	
 	void setid(int i){
 	 	this.id = i;
	}
	int getid(){
	 	return this.id;
	}
	static void setprice(int p){
 	 	price = p;
	}
	int getprice(){
	 	return price;
	}
	void setquantity(int quantity){
 	 	this.quantity = quantity;
	}
	int getquantity(){
	 	return this.quantity;
	}
	void setname(String name){
 	 	this.name = name;
	}
	String getname(){
		 return this.name;
	}
	product(){
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	product(int id,String name, int quantity){
		this.id = 65;
		this.name = "surabh";
		this.quantity = 32;
	}
	
	void display(){
	System.out.println("id = " + id);
	System.out.println("name = " + name);
	System.out.println("quantity = " + quantity);
	System.out.println("price = " + price);	
	}
}

class prodTest{
	 public static void main(String []args){
	product p = new product(10,"somal",22);
	product.price = 22;
	p.display();
	
	}
	



}
