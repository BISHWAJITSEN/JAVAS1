class ArmStrong{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int a=n; int l=0;
		while (a!=0)
		{
		a=a/10;
		l=l+1;//length
		}
        int b=n;
        int rem; int arm=0;
        while (b!=0)
        {
	    int multi =1;
	    rem=b%10;
	    for (int i=1; i<=l; i++)
	    {
	    multi=multi*rem;
	    }
	    arm=arm+multi;
	    b=b/10;
        }
        if (arm==n) 
        System.out.println(n+ " is an armstrong");
        else
        System.out.println(n+ " is not an armstrong");
    }
}
