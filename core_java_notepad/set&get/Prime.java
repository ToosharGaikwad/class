class Prime{
 public static void main(String[] args){
boolean isprime = true;

int no = 10;
if(no<2){
isprime = false;
}else{
for(int i =2;i<no/2;i++){
if(i/2==0){
isprime =false;
}
}
}
if(isprime){
System.out.println("no is prime");
}else{
System.out.println("no is not prime");

}
}// main ends here 
}// class ends here