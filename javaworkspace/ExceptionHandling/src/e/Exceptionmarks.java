package e;

class invalidmarks extends Exception {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "invalid marks !!";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "no message";
	}
}

class mark {
	int marks;

	public mark(int marks) {
		super();
		this.marks = marks;
	}

	public void validate() throws invalidmarks {

	
			if (marks < 0 || marks > 100) {
				throw new invalidmarks();
			} else if (marks < 35) {
				System.out.println("fail !!");
			} else if (marks > 34 && marks < 50) {
				System.out.println(" pass second class");
			} else if (marks > 55 && marks < 75) {
				System.out.println(" pass with frist class");
			} else if (marks > 75 && marks < 95) {
				System.out.println(" pass frist class A++");
			} else if (marks > 94) {
				System.out.println(" pass first class with distinction");
			}

		
	}

}

class Exceptionmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mark i = new mark(113);
		
		
		try {
			i.validate();
		}catch (invalidmarks im){
			im.printStackTrace();
			 System.out.println(im.getMessage()); 
		System.out.println("invalid marks");
		}

	}

}