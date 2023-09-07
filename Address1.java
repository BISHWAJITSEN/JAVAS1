class Address1
{
	private int hno;
	private String streetName; //instance veriable
	private String landmark;
	private String city;
	private int pinCode;

	Address1(int hno, String streetName, String landmark, String city, int pinCode) //prameterized constructor
	{
		this.hno=hno;
		this.streetName=streetName;
		this.landmark=landmark;
		this.city=city;
		this.pinCode=pinCode;
    }
	void getAddress() //method       
	{
		System.out.println("****Address****");
		System.out.println(hno+" "+streetName+" "+landmark+" "+city+" "+pinCode);
	}
}