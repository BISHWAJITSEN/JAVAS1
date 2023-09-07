class VarAdd{
	public static void main(String[] args) {
		add1();
		add2(6,7);
		int res=add3();
		System.out.println("add in 3rd way "+res);
		int res1=add4(8,9);
		System.out.println("add in 4th way "+res1);
		add5(2,3,5,7,11,13,17,19,23,29);
	}
	static void add1(){
		int a = 19;
		int b = 71; 
		System.out.println("add in 1st way "+(a+b));
	}
	static void add2(int c, int d){
		System.out.println("add in 2nd way "+(c+d));
	}
	static int add3(){
		int e = 18;
		int f = 21;
		return(e+f);
	}
	static int add4(int g, int h){
		int sum = g+h;
		return(sum);
	}
	static void add5(int...a){
		int sum = 0;
		for (int i=0; i<a.length; i++){
			sum = sum+a[i];
		}
		System.out.println("add in 5th way "+sum);
	}
}
