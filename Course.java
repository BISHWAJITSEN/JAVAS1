class Course{

	private int id;
	private String courseName;
	private long fees;
	private String duration;
	private static String institute = "C-DAC";
    Address address;
    

	Course(int id, String courseName, long fees, String duration, Address address)
	{
		this.id=id;
		this.courseName=courseName;
		this.fees=fees;
		this.duration=duration;
		this.address=address;

	}


	void getCourse()
	{
		System.out.println(id+" "+courseName+" "+fees+" "+duration+" "+institute);
		address.getAddress();

	}
}