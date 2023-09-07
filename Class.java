class Address
{
	private int hno;
	private String streetName;
	private String city;
	private int pincode;
	
	Address(int hno, String streetName, String city, int pincode)
	{
	this.hno=hno;
	this.streetName=streetName;
	this.city=city;
	this.pincode=pincode;
}

void getAdress(){
System.out.println("***Address***");
System.out.println("HNO: "+hno);
System.out.println("HNO: "+streetName);
System.out.println("HNO: "+city);
System.out.println("HNO: "+pincode);

}
}