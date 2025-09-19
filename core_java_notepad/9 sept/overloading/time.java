class time{
	int hr,min,sec;
	void ftime(){
	if(this.sec>=60){
		this.min += this.sec/60;
		this.sec=this.sec%60;
		}
		if(this.min>=60){
		this.hr += this.min/60;
		this.min=this.min%60;
		}
		this.hr=this.hr%24;
 	
	}
	time(int hr,int min,int sec){
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		ftime();
	}
	time(){
		this.hr=0;
		this.min=0;
		this.sec=0;
		}

      time add(time t1,time t2){
		time result=new time();
		result.hr=t1.hr+t2.hr;
		result.min=t1.min+t2.min;
		result.sec=t1.sec+t2.sec;
		result.ftime();
		return result;
	}
	void add(int h,int m,int s){
		this.hr=this.hr+h;
		this.min=this.min+m;
		this.sec=this.sec+s;
		this.ftime();
	}
	void display(){
		System.out.println("Time is : "+this.hr+":"+this.min+":"+this.sec);
	}
}//class end here
class tTest{
	public static void main(String[] args){
	time t = new time(3,13,41);
	time t2 = new time(13,43,11);
	time result = new time();
	result=result.add(t,t2);
	result.display();
	
	}

}//class end here