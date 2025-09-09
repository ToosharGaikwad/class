
class Time{
int minit;
int second;
int hour;
Time(){
 minit = 42;
 second = 23;
 hour = 12;
}
}

class Test1{
public static void main(String[] args){
  
  
Time t;
t = new Time();
  System.out.println("second " +t.second);
   System.out.println("minit "+t.minit);
System.out.println("hour " +t.hour);
}
}