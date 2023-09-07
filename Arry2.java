class Arry2{
	public static void main(String[] args) {
		int [] arr = new int[10];
		for (int i=0; i<arr.length; i++)
		arr[i]=i+10;
		int c=0;
		for (int x: arr){
			System.out.println("arr["+c+"] "+x);
			c++;
		}
	}
}