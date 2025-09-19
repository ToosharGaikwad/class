class distance{

int feet,inches;

void setfeet(int feet){
this.feet = feet;
}

int getfeet(){
return this.feet;
}


void setinches(int inches){
this.inches =inches;
}

int getinches(){
return this.inches;
}

distance(){
this.feet = 54;
this.inches = 66;

}


distance(int f,int i){
this.feet = f;
this.inches = i;

}
void display(){
 System.out.println("feet = " + feet);
System.out.println("inches = " + inches);

}
}

class dTest{
public static void main(String []args){
distance d = new distance();
d.display();
distance d1 = new distance(332,998);
d1.display();
}

}