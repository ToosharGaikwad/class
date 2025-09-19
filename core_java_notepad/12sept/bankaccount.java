class bank{
double accountNo, balance;
String holderName,branch;
 static int interestrate;
static{
  interestrate = 6;
  }

void setaccountNo(double accountNo){
this.accountNo = accountNo;}

double getaccountNo(){
return this.accountNo;}


void setbalance(double balance){
this.balance = balance;}


static void setinterestrate(int r){
	interestrate = r;
}

double getinterestrate(){
	return interestrate;
}

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

bank(){
this.branch = "deogaon";
this.holderName = "Tushar";
this.balance = 546623;
this.accountNo = 124565;

System.out.println(" Non parameterised constructer");
}


bank(String br, String name,double bl, double acN){
this.branch = br;
this.holderName = name;
this.balance = bl;
this.accountNo = acN;

System.out.println(" this is parameterised constructer");
}




void display(){
System.out.println(" branch = " + branch);
System.out.println(" holder name = " + holderName);
System.out.println(" balance = " + balance);
System.out.println(" account no = " + accountNo);
System.out.println(" interest rate = " + interestrate);
}
}

class bankTest{
public static void main(String[] args){

bank b = new bank();

//b.setbranch("sambhaji nagar");
//b.setholderName("Tushar");
///b.setbalance(10200);
//b.setaccountNo(4255.5);

bank b1; // refrence
b1=new bank("borgao", "omakar", 342,56666555);
b1.display();
bank.setinterestrate(9);

//bank b2 = new bank("sambha","shubham",664,66433);
//b2.display();
//b2.display();
}


}












