class Electricity{
	public static void main(String[] args) {
		int units = Integer.parseInt(args[0]);
		int fix = 50;
		
		if (units<=50)
		{
		System.out.println(fix+(units*2));
		}

	    else if (units<=100)
        {
        System.out.println(fix+units*3);
        }

		else if (units<=200)
		{ 
		System.out.println(fix+units*5);
		}

		else if (units<=500)
		{ 
		System.out.println(fix+units*15);
	    }
	    else
		System.out.println("bill is: ");
	}
}