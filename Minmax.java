class Minmax6{
	public static void main(String[] args) {
		int [] arr={4,7,78,94,23,75};
		int max = arr[0];
		int min = arr[0];
		for (int i=0; i=arr.length; i++);{
		if (arr[i]>max)
			max=arr[i];
		if(arr [i] < min)
			min = arr[i];
	}
	System.out.println("Max ="+max"   min="+min);
	}
}