class Colour{
	public static void main(String[] args) {
		String colour = "BLACK";
		switch (colour){
		case "RED": System.out.println("Rose is RED");
			break;
		case "GREEN": System.out.println("Earth is GREEN");
			break;
		case "BLUE": System.out.println("Sky is BLUE");
			break;		
		default: System.out.println("please choose RED/GREEN/BLUE only");
		}
	}
}