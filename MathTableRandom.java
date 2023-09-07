class MathTableRandom{
	public static void main(String[] args) {
		int n = 1 + (int)(Math.random()*100);
		System.out.println("number generated" +n);
		for (int i=1; i<=10; i++)
	    System.out.println(n+" * "+i+" = "+(i*n));
	}
}