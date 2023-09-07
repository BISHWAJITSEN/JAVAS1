class Palindrom{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int x=n;//stored
		int rev=0, rem;
		while(x!=0)
		{
		rem=x%10;
		rev=rev*10+rem;
		x=x/10;
	    }
		if (n==rev)
		System.out.println(n+ " is palindrome");
	else
		System.out.println(n+ " is not palindrome");
		}
    } 