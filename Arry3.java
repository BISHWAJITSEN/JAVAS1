class Arry3{
	public static void main(String[] args) {
		int [] arr = new int [25];
		for (int i=0; i<arr.length; i++)
			arr[i] = 1+(int)(Math.random()*25);
				int c=0;
				for (int x:arr){
    System.out.println(" arr["+c+"] = "+x);
    c++;
		}
	} 
}