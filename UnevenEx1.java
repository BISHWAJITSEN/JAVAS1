class UnevenEx1{
	public static void main(String[] args) 
	{
		int [][] uneven = {{1,9,2}, {2,5,3}, {6,4,7}}; // declare and construct array
		for (int row=0; row<uneven.length; row++){
			System.out.print("Row" +row+ " : "); // print array
			for (int col=0; col<uneven[row].length; col++) 
				System.out.print(uneven[row][col] + " ");//change the column
			System.out.println();
		}
	}
}