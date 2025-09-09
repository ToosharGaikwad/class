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


void display(){
System.out.println("id = " +id);
System.out.println("name = " +name);
System.out.println("quantity = " +quantity);
}


}

class prodtest{

public static void main(String[] args){

prod p = new prod();
p.setid(12346);
p.setname("omkar");
p.setquantity(354768);
p.display();
}
}









