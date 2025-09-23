class Animal{
	String drink;
	String eat;
	String stay;
	public Animal() {
		super();
		this.drink = "milk";
		this.eat ="flatbread";
		this.stay = "house";
	}
	public Animal(String drink,String eat,String stay) {
		super();
		this.drink = drink;
		this.eat = eat;
		this.stay = stay;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public String getStay() {
		return stay;
	}
	public void setStay(String stay) {
		this.stay = stay;
	}
	
	void sound() {
		System.out.println("sound of animal");
	}
	
}
class cat extends Animal{
	String meo;

	public cat(String sound) {
		super();
		this.meo = sound;
	}
	

	public String getSound() {
		return meo;
	}


	public void setSound(String sound) {
		this.meo = sound;
	}


	public cat() {
		super();
		this.meo = "meo";
	}
	void sound() {
		System.out.println("cat sound is meo meo " + meo);
	}
	
	
}
class dog extends Animal{
	String bark;

	public dog() {
		super();
		this.bark = "bhu";
	}

	public dog(String bark) {
		super();
		this.bark = bark;
	}

	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}
	void sound() {
		super.sound();
		System.out.println("dog sound is bark : " +bark);
	}
}
class TestAnimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.sound();
        a= new dog();
        a.sound();
        a = new cat();
        a.sound();
        
	}

}
