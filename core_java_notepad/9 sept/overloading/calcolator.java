class calculator{
	void add(int a ,int b){
	int c =a+b;
		System.out.println("addition is " + c);
		System.out.println("void add(int a ,int b)");
	}

	void add(double d1,int a){
	double d3 = d1+a;
		System.out.println("addition is " + d3);
		System.out.println("void add(double d1,int a)");

	}
	void add(double d1,double d2){
	double d3 = d1+d2;
		System.out.println("addition is " + d3);
		System.out.println("void add(double d1,double d2)");
	}
	void add(int d1,double  a){
	double d3 = d1 +4;
		System.out.println("addition is " + d3);
		System.out.println("void add(double d1,int a)");


	}

}
class test{
	public static void main(String []args){
	  calculator c = new calculator();
	c.add(10.2,3);
	c.add(52.03,21.0);
	c.add(665,98);
}
}