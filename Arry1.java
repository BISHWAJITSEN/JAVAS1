class Arry1{
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0]=10;
		arr[9]=arr[0]*2;
		arr[4]=arr[9];
		arr[3]=arr[4]-arr[0];
		arr[7]=99;
		for (int val: arr)
			System.out.println(val);
	}
}