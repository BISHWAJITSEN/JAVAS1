class ASCII1Conti{
	public static void main(String[] args) {
		for (int i=65; i<=122; i++){
			if (i>90 && i<97)
				continue;
			System.out.print((char)i+ " ");
		}
	}
}