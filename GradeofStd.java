class GradeofStd{
	public static void main(String[] args) {
		int m1 = Integer.parseInt(args[0]);
		int m2 = Integer.parseInt(args[1]);
		int m3 = Integer.parseInt(args[2]);
		int per = (m1 + m2 + m3)/3;
		per = per/10;
		switch(per){
		case 10:
		case 9:
		case 8:
		case 7: System.out.println("Distiction");
			break;
		case 6:	System.out.println("First class");
			break;
		case 5: System.out.println("Second class");
			break;
		case 4:
		case 3:
		case 2:
		case 1: System.out.println("Fail");
		break;
		default: System.out.println("Something went wrong");
	}
}
}