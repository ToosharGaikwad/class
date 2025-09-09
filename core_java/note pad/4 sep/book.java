class book{
String book_name,title,auther , publisher;
int price;
void setbook_name(String book_name){
this.book_name = book_name; }

String getbook_name(){
return this.book_name; }

void settitle(String title){
this.title = title; }

String gettitle(){
return this.title; }

void setauther(String auther){
this.auther = auther; }

String getauther(){
return this.auther;}


void setpublisher(String publisher){
this.publisher = publisher; }

String getpublisher(){
return this.publisher;}

void setprice(int price){
this.price = price;}

int getprice(){
return this.price;}
void display(){
System.out.println("book name = " + book_name);
System.out.println("publisher = " + publisher);
System.out.println("price = " + price);
System.out.println("auther = " + auther);
System.out.println("title = " + title);
}
}

class bookTest{

public static void main(String []args){
book b = new book();
b.setprice(2465);
b.setpublisher("vaikaya_naydu");
b.setauther("sanu_kirti");
b.settitle("good_vibes");
b.setbook_name("leadership");
b.display();
}
}








