
class strRev {

	public static void main(String[] args) {
		String str = "this is string fbs";
		
	String sarr[] = str.split(" ");
	String s = " ";
	for(int i = sarr.length-1;i>=0;i--){
		System.out.print(sarr[i]+" ");
	}
	}

}

