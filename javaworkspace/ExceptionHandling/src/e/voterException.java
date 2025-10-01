//package e;
//
//class voterageException extends Exception{
//	public String toString() {
//		return invalid age ;
//		
//	}
//	
//	
//}
//class voter{
//	int age;
//
//	public voter(int age) {
//		super();
//		this.age = age;
//	}
//	public void validate() {
//		try {
//			if(this.age<18) {
//				throw new voterageException();
//				
//			}
//			else {
//				System.out.println("yes you can vote");
//			}
//			catch (voterageException ve){
//				System.out.println("ve");
//			}
//		}
//	}
//
//}
//
//
//class voterException {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		voter v = new voter(22);
//		v.
//
//	}
//
//}

package e;

class voterageException extends Exception {
	public String toString() {

		return "invalid age !!";

	}

}

class voter {
	int age;

	public voter(int age) {
		super();
		this.age = age;
	}

	public void validate() throws voterageException {
		
			if (this.age < 18) {
				throw new voterageException();

			} else {
				System.out.println("yes you can vote");
			}
		

	}

}

class voterException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voter v = new voter(20);
		try {
		v.validate();
	} catch (voterageException ve) {
		System.out.println("you can not vote !!");
	}

	}
}