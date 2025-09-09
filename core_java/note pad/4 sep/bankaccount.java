class bank{
double accountNo, balance;
String holderName,branch;

void setaccountNo(double accountNo){
this.accountNo = accountNo;}

double getaccountNo(){
return this.accountNo;}


void setbalance(double balance){
this.balance = balance;}

double getbalance(){
return this.balance;}

void setholderName(String holderName){
this.holderName = holderName;}

String getholderName(){
return this.holderName;}


void setbranch(String branch){
this.branch = branch;}

String getbranch(){
return this.branch;}
void display(){
System.out.println(" branch = " + branch);
System.out.println(" holder name = " + holderName);
System.out.println(" balance = " + balance);
System.out.println(" account no = " + accountNo);
}
}
class bankTest{
public static void main(String[] args){

bank b = new bank();
b.setbranch("sambhaji nagar");
b.setholderName("Tushar");
b.setbalance(10200);
b.setaccountNo(4255.5);
b.display();
}


}












