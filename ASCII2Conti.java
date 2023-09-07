class ASCII2Conti{
	public static void main(String[] args) {
		int count=1;
		for (int i=65; i<=122; i++){
			if (i>90 && i<97)
				continue;
			System.out.print((char)i+" ");
			if (count%5==0)
				System.out.println();
			count++;
		}
	}
}