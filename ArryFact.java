    class ArryFact{
	static Long factorial(int x){ //x formal parameter - def
	Long fact = 1L;
	for (int i=1; i<=x; i++)
	facts=fact*i;
	return fact;
    }
	public static void main(String[] args){
	int n = Integer.parseInt(args[0]); //input
	Long result = factorial(n); //actual parameter call
	System.out.println("Factorial of "+n+ " is "+result); //output
    }
}