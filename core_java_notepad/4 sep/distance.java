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
void display(){
 System.out.println("feet = " + feet);
System.out.println("inches = " + inches);

}
}

class dtest{
public static void main(String []args){
distance d = new distance();
d.setfeet(512);
d.setinches(323);
d.display();

}

}