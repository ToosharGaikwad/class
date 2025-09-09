class prod{
int id,price,quantity;
String name;

void setid(int id){
this.id = id;}

int getid(){
return this.id;}


void setprice(int price){
this.price = price;}

int getprice(){
return this.price;}


void setquantity(int quantity){
this.quantity = quantity;}

int getquantity(){
return this.quantity;}

void setname(String name){
this.name = name;}

String getname(){
return this.name;}

prod(){
this.id =99;
this.price =666;
this.quantity = 22;
this.name = "vaibhav";
}


prod(int id , int price,int q,String n){
this.id =id;
this.price =price;
this.quantity = q;
this.name = n;


}


void display(){
System.out.println("id = " +id);
System.out.println("name = " +name);
System.out.println("quantity = " +quantity);
}


}

class prodtest{

public static void main(String[] args){

prod p = new prod();
p.display();

prod p1 = new prod(12,554,32,"gaurav");
p1.display();


}
}









