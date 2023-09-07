class Address
{
	private int hno;
	private String streetName;
	private String locality;
	private String city;
	private int pinCode;
	
	public Address(int hno, String streetName, String locality, String city, int pinCode)
	{
	this.hno=hno;
	this.streetName=streetName;
	this.locality=locality;
	this.city=city;
	this.pinCode=pinCode;
}

void getAddress(){
System.out.println("****Address****");
System.out.println("HNO: "+hno);
System.out.println("Street Name: "+streetName);
System.out.println("Locality: "+locality);
System.out.println("City: "+city);
System.out.println("PINCODE: "+pinCode);

}
}